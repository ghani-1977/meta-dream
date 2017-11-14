KV = "3.14-1.17"
DRIVERDATE = "20171113"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "ee1fa51128931edfc078c5fee836254b"
SRC_URI[dm900.sha256sum] = "480cc75e30a19ef01c439b76bf5c65cd0a81e79f010c23e4b36fa2db17640491"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
