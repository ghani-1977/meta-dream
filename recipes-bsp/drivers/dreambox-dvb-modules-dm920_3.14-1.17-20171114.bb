KV = "3.14-1.17"
DRIVERDATE = "20171114"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm920.md5sum] = "83f6b9d55dd9bc21d9b482bb37bd8e96"
SRC_URI[dm920.sha256sum] = "adc4dca96bbd5b12b3ebf95bd3216c7c6ce0536b17b8d1a1953b3c39dde47194"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
