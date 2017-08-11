require dreambox-secondstage.inc

COMPATIBLE_MACHINE = "dm7020hdv2"

SRC_URI[md5sum] = "61940d88fa99757a4ff1705a14fad3ee"
SRC_URI[sha256sum] = "f11dd4e990d32629d66d35131569532ddc91592bb85e0cf78bc2e7de0aaebfc6"

do_install_prepend() {
	install -m 0644 ${B}/secondstage-dm7020hd-89.bin secondstage-dm7020hdv2-89.bin
}
