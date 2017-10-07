KV = "3.4-4.0"
DRIVERDATE = "20171004"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm820.md5sum] = "5abde5546569ddd6849f3589d9266807"
SRC_URI[dm820.sha256sum] = "ba1649a8e41f36d14a8877ac9369b2da578da0e5271ac293775325ae87c1a183"

COMPATIBLE_MACHINE = "dm820"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm820.md5sum', True)}"
