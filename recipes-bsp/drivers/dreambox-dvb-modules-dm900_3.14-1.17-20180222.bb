KV = "3.14-1.17"
DRIVERDATE = "20180222"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "acf76b39e7b238eaf73c7ba609ceb2f0"
SRC_URI[dm900.sha256sum] = "4dd33187d6bf4277b31ccdb067e0c43db7664fe21ec589815e5e09641d8c7fc5"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
