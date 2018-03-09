inherit upx_compress

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += " \
	${@bb.utils.contains("MACHINE_FEATURES", "dreambox", "\
	file://use-ioctl-22-for-h265-dreamboxes.patch \
	", " \
	file://use-ioctl-7-for-ac3plus-non-dreamboxes.patch \
	", d)} \
"
