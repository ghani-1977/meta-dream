KV = "3.4-4.0"
DRIVERDATE = "20171115"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm820.md5sum] = "f99e967f9064ead811d835891f122057"
SRC_URI[dm820.sha256sum] = "2c79b4acf0ff2da616a31a6e2093ce53bcf34f0034c931c84edd1691a306f95a"

COMPATIBLE_MACHINE = "dm820"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm820.md5sum', True)}"
