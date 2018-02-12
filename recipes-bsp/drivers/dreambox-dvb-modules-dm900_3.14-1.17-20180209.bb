KV = "3.14-1.17"
DRIVERDATE = "20180209"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "6bf8552306f518af4aaf0a700f3a05f3"
SRC_URI[dm900.sha256sum] = "a03d7d1282ec40a2e1e417960f980ecd494dc23346c99412a07a63dc11c43fc6"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
