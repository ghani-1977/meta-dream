KV = "3.4-4.0"
DRIVERDATE = "20170711"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm7080.md5sum] = "aded134e173b72298ae4069d73e58a3b"
SRC_URI[dm7080.sha256sum] = "6853d84a0da4ce6d6677a8efd1eddd7a1b18216a040b09e1aae102082422d182"

COMPATIBLE_MACHINE = "dm7080"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm7080.md5sum', True)}"
