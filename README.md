Dreambox BSP layer for:
```
dm500hd - boot status is ?
dm500hdv2 - boot status is ?
dm520 - boot status is ?
dm800se - boot status is ?
dm800sev2 - boot status is ?
dm900 - boot status is ok
dm7020hd - boot status is ok
dm7020hdv2 - boot status is ?
dm8000 - boot status is ?
```
How does it work? Simply with PLi's OE!

Use https://github.com/OpenPLi/openpli-oe-core (develop branch) with Ubuntu 16.04.2 LTS (4.8.0-58 kernel) as your base, Open a terminal inside "openpli-oe-core" folder and enter:
```
rm -rf meta-dream
git clone https://github.com/DMM-PLi/meta-dream.git
```
Now if you want to build for dm7020hd/dm7020hdv2 edit the "Makefile" file(line 112):
```
$(BBLAYERS):
	[ -d $@ ] || $(MAKE) $(MFLAGS) update

+ifeq ($(MACHINE),dm7020hdv2)
+MACHINE=dm7020hd
+endif

initialize: init
```
and(line 147):
```
	@echo 'Generating $@'
-	@echo 'export BB_ENV_EXTRAWHITE="MACHINE"' > $@
+	@echo 'export BB_ENV_EXTRAWHITE="MACHINE EXACTNAME"' > $@
	@echo 'export MACHINE' >> $@
+	@echo 'export EXACTNAME' >> $@
	@echo 'export PATH=$(CURDIR)/openembedded-core/scripts:$(CURDIR)/bitbake/bin:$${PATH}' >> $@
```
For latest updates you need to open a terminal inside "meta-dream" folder and enter:
```
git pull origin master
```
each time you do "make update" for the OE.

Experimental machines:
```
dm800 - Use Ubuntu 14.04.5 LTS
dm820 - PLi's OE isn't recent enough!
dm7080 - PLi's OE isn't recent enough!
```
We're independent so if you think you can help you're welcome to send us merge requests.
