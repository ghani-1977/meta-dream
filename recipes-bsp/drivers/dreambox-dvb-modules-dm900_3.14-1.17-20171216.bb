KV = "3.14-1.17"
DRIVERDATE = "20171216"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "d9ca731bd8ded004a816307e53f7bc94"
SRC_URI[dm900.sha256sum] = "255075e51d8ea377e8289bfb9529512cbe06b94753cf6651b53198ca49968c94"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
