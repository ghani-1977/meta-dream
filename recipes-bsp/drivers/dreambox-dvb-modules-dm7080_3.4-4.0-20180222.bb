KV = "3.4-4.0"
DRIVERDATE = "20180222"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm7080.md5sum] = "1858f867b5ae51aba6ad9496dca2c259"
SRC_URI[dm7080.sha256sum] = "7b874ca71d46cc5cf7d65edf669a15d75766ab1d475df1f4f94fbf6a9de685b8"

COMPATIBLE_MACHINE = "dm7080"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm7080.md5sum', True)}"
