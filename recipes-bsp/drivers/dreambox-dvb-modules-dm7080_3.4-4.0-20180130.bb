KV = "3.4-4.0"
DRIVERDATE = "20180130"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm7080.md5sum] = "5098a31612808a353995f59abc11d3a7"
SRC_URI[dm7080.sha256sum] = "9e77c6e7f4361b870bf779da2d9873d8710a98e0853361cc870310bc25bb130c"

COMPATIBLE_MACHINE = "dm7080"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm7080.md5sum', True)}"
