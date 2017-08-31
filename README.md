Dreambox BSP layer for:
```
dm500hd - kernel 3.2.92 driver 20140616 secondstage 84
dm500hdv2 - kernel 3.2.92 driver 20140616 secondstage 89
dm520 - kernel 3.4.113 driver 20170801 secondstage 3
dm800 - kernel 2.6.18 driver 20131228a secondstage 84
dm800se - kernel 3.2.92 driver 20151201 secondstage 84
dm800sev2 - kernel 3.2.92 driver 20151201 secondstage 89
dm900 - kernel 3.14.79 driver 20170801 secondstage N/A
dm7020hd - kernel 3.2.92 driver 20161019 secondstage 89
dm7020hdv2 - kernel 3.2.92 driver 20161019 secondstage 89
dm8000 - kernel 3.2.92 driver 20140604a secondstage 84
```
How does it work? Simply with PLi's OE!

Use https://github.com/OpenPLi/openpli-oe-core (test1 branch) with Ubuntu 16.04.3 LTS as your base, Open a terminal inside "openpli-oe-core" folder and enter:
```
rm -rf meta-dream

git clone -b test1 https://github.com/DMM-PLi/meta-dream.git

rm -f meta-openpli/recipes-openpli/enigma2-plugins/enigma2-plugin-extensions-openwebif.bbappend

cp -f meta-dream/recipes-daemons/vsftpd/vsftpd_3.0.3.bb meta-openpli/recipes-daemons/vsftpd/vsftpd_3.0.3.bb

cp -f meta-dream/recipes-connectivity/samba/samba_4.6.%.bbappend meta-openpli/recipes-connectivity/samba/samba_4.%.bbappend
```
Delete line 185-188 in the meta-openpli/recipes-openpli/enigma2/enigma2.bb file:
```
-PV_enigma2-fonts = "2017.04.30"
-PR_enigma2-fonts = "r0"
-PKGV_enigma2-fonts = "${PV_enigma2-fonts}"
-PKGR_enigma2-fonts = "${PR_enigma2-fonts}"
```
For latest updates you need to open a terminal inside "meta-dream" folder and enter:
```
git pull origin test1
```
each time you do "make update" for the OE.

Experimental machines:
```
dm820
dm7080
```
We're independent so if you think you can help you're welcome to send us merge requests.
