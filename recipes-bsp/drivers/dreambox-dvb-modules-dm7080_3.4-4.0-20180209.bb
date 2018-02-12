KV = "3.4-4.0"
DRIVERDATE = "20180209"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm7080.md5sum] = "fc016647c2b3c260cc6ca75c591f1ff0"
SRC_URI[dm7080.sha256sum] = "478a8fbeb6adf8980b763f608917c4eb8b56c994f3d1e62c06f6d4513b6feb4e"

COMPATIBLE_MACHINE = "dm7080"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm7080.md5sum', True)}"
