Dreambox BSP layer for dm500hd(v1), dm800se(v1) and dm7020hd(v1). All models will be available soon!

How does it work? Simply with PLi's OE!

Use https://github.com/OpenPLi/openpli-oe-core as your base, Open a terminal inside "openpli-oe-core" folder and enter:
```
git submodule add https://github.com/Hains/dmm-bsp.git
```
Now edit the "Makefile" file and add the BSP layer to it:
```
	$(CURDIR)/meta-openpli \
	$(CURDIR)/meta-dream \
+	$(CURDIR)/dmm-bsp \
	$(CURDIR)/meta-vuplus \
```
Remove the "/meta-dream/classes/image_types_nfi.bbclass" file because it doesn't support "jffs2nfi" images.

We're independent so if you think you can help you're welcome to send us merge requests :).

Experimental machines(Not yet ready!):
```
dm500hdv2
dm520
dm800
dm800sev2
dm820
dm900
dm7020hdv2
dm7080
```
