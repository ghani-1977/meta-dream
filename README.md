Dreambox BSP layer for:
```
dm500hd
dm800se
dm7020hd
```
How does it work? Simply with PLi's OE!

Use https://github.com/OpenPLi/openpli-oe-core as your base, Open a terminal inside "openpli-oe-core" folder and enter:
```
git submodule add https://github.com/DMM-PLi/dmm-bsp.git
```
Now edit the "Makefile" file and add the BSP layer to it:
```
	$(CURDIR)/meta-openpli \
	$(CURDIR)/meta-dream \
+	$(CURDIR)/dmm-bsp \
	$(CURDIR)/meta-vuplus \
```
For later updates and after every 'make update' !!! You need to open a terminal inside "dmm-bsp" folder and enter:
```
git pull origin master
```
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
We're independent so if you think you can help you're welcome to send us merge requests.
