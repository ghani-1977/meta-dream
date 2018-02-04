KV = "3.4-4.0"
DRIVERDATE = "20180130"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm820.md5sum] = "d66c45fb4a2ecb538095cbb1df9a3585"
SRC_URI[dm820.sha256sum] = "778a2b30de0dbc5558874cdcf1cd9afc64884fb50e938dd5617e4444e163d29b"

COMPATIBLE_MACHINE = "dm820"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm820.md5sum', True)}"
