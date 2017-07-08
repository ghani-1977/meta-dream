Dreambox BSP layer for dm500hd, dm800se (v1) and dm7020hd.

How does it work?

Use https://github.com/OpenPLi/openpli-oe-core as your base and enter these commands:

cd openpli-oe-core
git submodule add https://github.com/Hains/dmm-bsp.git

Edit the "Makefile" file and add the BSP layer to it:

	$(CURDIR)/meta-openpli \
	$(CURDIR)/meta-dream \
+	$(CURDIR)/dmm-bsp \
	$(CURDIR)/meta-vuplus \

Remove the "/meta-dream/classes/image_types_nfi.bbclass" file because it doesn't support "jffs2nfi" images.
