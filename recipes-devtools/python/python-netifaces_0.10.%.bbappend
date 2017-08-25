FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append_dm800 = " \
    file://define-RTNL_FAMILY_MAX.patch \
"
