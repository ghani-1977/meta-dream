KV = "3.4-4.0"
DRIVERDATE = "20170520"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm820.md5sum] = "24d4926f66533e17384008c617186316"
SRC_URI[dm820.sha256sum] = "6ade0ff8fab8c83afa3fd1a363de59a7fb91568fa93502986b22b02880ffc80b"

COMPATIBLE_MACHINE = "dm820"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm820.md5sum', True)}"
