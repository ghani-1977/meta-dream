KV = "3.14-1.17"
DRIVERDATE = "20171211"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "0f7de681c1843446d6a14b95b3cb27ad"
SRC_URI[dm900.sha256sum] = "a2831ec0e6f30472dd9c0c0d9331f4bd7bdae7bf4e2d237df71b6c89b904fca9"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
