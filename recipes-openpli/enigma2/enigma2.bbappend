FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

inherit upx_compress

SRC_URI_append_dm800 = " \
    file://e2_old_dvbapi.patch \
"

SRC_URI_append_dm8000 += " \
    file://fix-wrong-driver-date.patch \
"

SRC_URI_append_dm7080 += " \
    file://add-support-dm7080.patch \
"

# We remove python-asn1crypto because we're using an older version of python-pyopenssl on smallflash receivers
RDEPENDS_${PN}_remove_smallflash = " \
	python-asn1crypto \
	"
