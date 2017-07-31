KV = "3.4-4.0"
DRIVERDATE = "20170711"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm820.md5sum] = "c5e46a9281e9d6995023c288b9851f92"
SRC_URI[dm820.sha256sum] = "c3e28768b39cd5b15fe6a6f04706f3f4226a966535b9d566001d43eee069b642"

COMPATIBLE_MACHINE = "dm820"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm820.md5sum', True)}"
