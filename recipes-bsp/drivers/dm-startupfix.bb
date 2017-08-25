require conf/license/license-gplv2.inc

PV = "1.0"

SRC_URI = "file://startup_fix.sh"

INITSCRIPT_NAME = "startup_fix"
INITSCRIPT_PARAMS = "start 03 S ."

inherit autotools pkgconfig update-rc.d

do_compile() {
}

do_install() {
    install -d ${D}/etc/init.d/
    install -m 0755 ${WORKDIR}/startup_fix.sh ${D}/etc/init.d/startup_fix
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

