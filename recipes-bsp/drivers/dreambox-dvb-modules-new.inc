SUMMARY = "Hardware drivers for Dreambox"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS += "virtual/kernel"
PRIORITY = "required"
INC_PR = "r7"

PRECOMPILED_ARCH = "${@bb.utils.contains('MACHINE', 'dm920', 'dm900', MACHINE, d)}"

DREAMBOX_DVB_MODULES_MIRROR ?= "http://dreamboxupdate.com/download/opendreambox/2.5.0/dreambox-dvb-modules/${KV}-${PRECOMPILED_ARCH}-${DRIVERDATE}/${PRECOMPILED_ARCH}/${MD5SUM}"

SRC_URI = "${DREAMBOX_DVB_MODULES_MIRROR}/dreambox-dvb-modules_${KV}-${PRECOMPILED_ARCH}-${DRIVERDATE}_${PRECOMPILED_ARCH}.tar.xz;name=${MACHINE}"

S = "${WORKDIR}/dreambox-dvb-modules_${KV}-${PRECOMPILED_ARCH}-${DRIVERDATE}_${PRECOMPILED_ARCH}"

inherit module-base

addtask make_scripts after do_patch before do_compile
do_make_scripts[lockfiles] = "${TMPDIR}/kernel-scripts.lock"
do_make_scripts[depends] += "virtual/kernel:do_shared_workdir gnupg:do_populate_sysroot"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

INSANE_SKIP_${PN}_append = " already-stripped"

do_install() {
    find . -depth -not -path "./patches*" -not -path "./.pc*" -print0 | cpio --null -pdlu ${D}
    chown -hR root:root ${D}
}

do_install_append() {
    install -d ${D}${sysconfdir}/modules-load.d
    echo stb-core > ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    chmod 0644 ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/lcd.ko ]; then
        echo lcd > ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
        chmod 0644 ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
    fi
    for module in bcm7435 dreambox_keyboard; do
        if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/$module.ko ]; then
            echo $module >> ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
        fi
    done
    chmod 0644 ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
}

do_install_append_dm520() {
    install -d ${D}${sysconfdir}/modules-load.d
    echo stb-core > ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    chmod 0644 ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/lcd.ko ]; then
        echo lcd > ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
        chmod 0644 ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
    fi
    for module in bcm73625 dreambox_keyboard; do
        if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/$module.ko ]; then
            echo $module >> ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
        fi
    done
    chmod 0644 ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
}

do_install_append_dm900() {
    install -d ${D}${sysconfdir}/modules-load.d
    echo stb-core > ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    chmod 0644 ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/lcd.ko ]; then
        echo lcd > ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
        chmod 0644 ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
    fi
    for module in bcm7439 dreambox_keyboard; do
        if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/$module.ko ]; then
            echo $module >> ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
        fi
    done
    chmod 0644 ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
}

do_install_append_dm920() {
    install -d ${D}${sysconfdir}/modules-load.d
    echo stb-core > ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    chmod 0644 ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/lcd.ko ]; then
        echo lcd > ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
        chmod 0644 ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
    fi
    for module in bcm7439 dreambox_keyboard; do
        if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/$module.ko ]; then
            echo $module >> ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
        fi
    done
    chmod 0644 ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
}


PACKAGES =+ "${PN}-lcd ${PN}-stb-core"

RDEPENDS_${PN} = "dreambox-secondstage-${MACHINE} kernel-${DM_LOCALVERSION} ${PN}-stb-core"
RDEPENDS_${PN}_dm900 = "kernel-${DM_LOCALVERSION} ${PN}-stb-core"
RDEPENDS_${PN}_dm920 = "kernel-${DM_LOCALVERSION} ${PN}-stb-core"
RDEPENDS_${PN}-lcd = "${PN}-stb-core"
RRECOMMENDS_${PN} = "${PN}-lcd"

FILES_${PN} = "${sysconfdir}/modules-load.d/10-${BPN}.conf \
               /lib/modules/${DM_LOCALVERSION}/extra/"

FILES_${PN}-lcd = "${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf \
                   /lib/modules/${DM_LOCALVERSION}/extra/lcd.ko"

FILES_${PN}-stb-core = "${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf \
                        /lib/modules/${DM_LOCALVERSION}/extra/stb-core.ko"

# We don't use KERNEL_VERSION in this recipe, because the
# precompiled modules depend on a specific version.
DM_LOCALVERSION = "${@'-'.join('${PV}'.split('-')[:-1])}-${PRECOMPILED_ARCH}"
DRIVERDATE = "${@'${PV}'.split('-')[-1]}"

pkg_postinst_${PN} () {
if [ -z "$D" ]; then
	depmod -a ${DM_LOCALVERSION}
fi
}
pkg_postinst_${PN}-lcd () {
if [ -z "$D" ]; then
	depmod -a ${DM_LOCALVERSION}
fi
}
pkg_postinst_${PN}-stb-core () {
if [ -z "$D" ]; then
	depmod -a ${DM_LOCALVERSION}
fi
}
