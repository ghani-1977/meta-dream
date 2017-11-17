require recipes-mediacenter/kodi/kodi_${PV}.bb

SRCREV = "6abeebd5ba371547c8f04272296433f5e4e28e86"

PROVIDES += "virtual/kodi"
RPROVIDES_${PN} += "virtual/kodi"
PROVIDES += "kodi"
RPROVIDES_${PN} += "kodi"

EXTRA_OECONF += " \
    --with-platform=dreambox-cortexa15 \
    --with-ffmpeg=v3d \
"
