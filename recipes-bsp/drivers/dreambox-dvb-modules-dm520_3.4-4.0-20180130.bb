KV = "3.4-4.0"
DRIVERDATE = "20180130"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm520.md5sum] = "0ea5a417f5358a94866159bd443ded0e"
SRC_URI[dm520.sha256sum] = "015245492567b57aa40a267f04b12376f1f702dc0d4ecee8b549fccc4e19f8b1"

COMPATIBLE_MACHINE = "dm520"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm520.md5sum', True)}"
