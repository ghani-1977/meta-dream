FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append_dm800 = " \
    file://dvb-api3.patch \
"
