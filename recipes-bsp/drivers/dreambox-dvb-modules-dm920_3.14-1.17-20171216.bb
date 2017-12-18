KV = "3.14-1.17"
DRIVERDATE = "20171216"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm920.md5sum] = "a1e81b1c0824151271e08e0921f48cd1"
SRC_URI[dm920.sha256sum] = "5e4bdf3558c3f03e40c23b515e60f8acd403623991ac32366fc58b49f1da9014"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
