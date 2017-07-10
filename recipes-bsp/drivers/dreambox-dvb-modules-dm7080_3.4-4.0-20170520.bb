KV = "3.4-4.0"
DRIVERDATE = "20170520"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm7080.md5sum] = "056881fa29cd5f6a727647314269501e"
SRC_URI[dm7080.sha256sum] = "4b65a2efd4b53de445adfaacf69f5b08c64c013ebfb61d3a94a3b08cbe8731a1"

COMPATIBLE_MACHINE = "dm7080"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm7080.md5sum', True)}"
