Dreambox BSP layer for:
```
dm500hd - kernel 3.2.92 driver 20140616 secondstage 84
dm500hdv2 - kernel 3.2.92 driver 20140616 secondstage 89
dm520 - kernel 3.4.113 driver 20170801 secondstage 3
dm800se - kernel 3.2.92 driver 20151201 secondstage 84
dm800sev2 - kernel 3.2.92 driver 20151201 secondstage 89
dm900 - kernel 3.14.79 driver 20170801 secondstage N/A
dm7020hd - kernel 3.2.92 driver 20161019 secondstage 89
dm7020hdv2 - kernel 3.2.92 driver 20161019 secondstage 89
dm8000 - kernel 3.2.92 driver 20140604a secondstage 84
dm800 - kernel 2.6.18 driver 20131228a secondstage 84
```
How does it work? Simply with PLi's OE!

Use https://github.com/OpenPLi/openpli-oe-core (develop branch) with Ubuntu 16.04.2 LTS as your base, Open a terminal inside "openpli-oe-core" folder and enter:
```
rm -rf meta-dream
git clone https://github.com/DMM-PLi/meta-dream.git
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
