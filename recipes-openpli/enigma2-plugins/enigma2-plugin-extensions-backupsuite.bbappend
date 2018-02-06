RDEPENDS_${PN} = " \
	mtd-utils \
	mtd-utils-ubifs \
	${@bb.utils.contains("IMAGE_FSTYPES", "tar.bz2", "bzip2" , "", d)} \
	${@bb.utils.contains("IMAGE_FSTYPES", "jffs2nfi", "mtd-utils-jffs2 dreambox-buildimage" , "", d)} \
	${@bb.utils.contains("IMAGE_FSTYPES", "ubinfi", "mtd-utils-jffs2 dreambox-buildimage" , "", d)} \
	"
