MACHINE_KERNEL_PR_append = ".${INC_PR}.57"

COMPATIBLE_MACHINE = "dm500hd|dm500hdv2|dm800se|dm800sev2|dm7020hd|dm7020hdv2|dm8000"

PATCHLEVEL = "92"

SRC_URI = " \
			${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-3.2.tar.bz2;name=kernel \
			${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-3.2.${PATCHLEVEL}.xz;apply=yes;name=kernel-patch \
			http://download.filesystems.org/unionfs/unionfs-2.x-latest/unionfs-2.6_for_3.2.62.diff.gz;name=unionfs \
			file://linux-dreambox-kernel.patch \
			file://change-function-to-setattr-prepare.patch \
			file://clear_sublevel.patch \
			file://0001-Revert-MIPS-Fix-potencial-corruption.patch \
			file://fadvise_dontneed_change.patch \
			file://fix-proc-cputype.patch \
			file://mips-refactor-clearpage-and-copypage.patch \
			file://rtl8712-backport-b.patch \
			file://rtl8712-backport-c.patch \
			file://rtl8712-backport-d.patch \
			file://make-3.82-hack.patch \
			file://0001-brmcnand_base-disable-flash-BBT-on-64MB-nand.patch \
			file://0002-ubifs-add-config-option-to-use-zlib-as-default-compr.patch \
			file://em28xx_fix_terratec_entries.patch \
			file://em28xx_add_terratec_h5_rev3.patch \
			file://dvb-usb-siano-always-load-smsdvb.patch \
			file://dvb-usb-af9035.patch \
			file://dvb-usb-a867.patch \
			file://dvb-usb-rtl2832.patch \
			file://dvb_usb_disable_rc_polling.patch \
			file://dvb-usb-smsdvb_fix_frontend.patch \
			file://0001-it913x-backport-changes-to-3.2-kernel.patch \
			file://rtl8712-fix-warnings.patch \
			file://fixme-hardfloat.patch \
			file://0001-correctly-initiate-nand-flash-ecc-config-when-old-2n.patch \
			file://kernel-add-support-for-gcc6.patch \
			file://0001-misc-latin1-to-utf8-conversions.patch \
			file://defconfig \
			file://0001-dvb_frontend-backport-multistream-support.patch \
			file://0008-MIPS-Fix-build-with-binutils-2.24.51.patch \
			file://0010-BRCMSTB-Fix-build-with-binutils-2.24.51.patch \
"

SRC_URI[kernel.md5sum] = "7ceb61f87c097fc17509844b71268935"
SRC_URI[kernel.sha256sum] = "c881fc2b53cf0da7ca4538aa44623a7de043a41f76fd5d0f51a31f6ed699d463"
SRC_URI[kernel-patch.md5sum] = "066d1595995c67c1edd9cadd82651ea6"
SRC_URI[kernel-patch.sha256sum] = "88bc10d4af6499b407ad2193a8d1d155a1abbece98a17066fc2d6247edca7a01"
SRC_URI[unionfs.md5sum] = "348e5021d5340f12e2968ff4eb74d45d"
SRC_URI[unionfs.sha256sum] = "c0c449a445e9e07c5b1ba8e8c40013c0e40a5948c30a7190677d19ba7358c11a"

require linux-dreambox.inc

S = "${WORKDIR}/linux-3.2"
