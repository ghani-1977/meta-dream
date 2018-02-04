KV = "3.14-1.17"
DRIVERDATE = "20180130"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "ba3bb3155fe47bc60038bf91170bacab"
SRC_URI[dm900.sha256sum] = "45cc8dae645f49eb11ebd3f29664f0c3151d8ea3a08fae55dc35759faced276e"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
