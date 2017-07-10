# dreambox-mips32el-new.inc

TARGET_ARCH = "mipsel"
DEFAULTTUNE = "mips32el"

MTD_KERNEL = "mtd2"

require conf/machine/include/dreambox-new.inc
require conf/machine/include/tune-mips32.inc

MACHINE_KERNEL_PR = "r14"
