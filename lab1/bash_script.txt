#!/bin/bash
#1
mkdir lab0
cd lab0
mkdir charmeleon3
mkdir charmeleon3/timburr
mkdir charmeleon3/mienshao
mkdir charmeleon3/swellow
touch charmeleon3/staryu; 
touch magmortar6; 
touch roserade7
mkdir scraggy8
mkdir scraggy8/sunflora
touch scraggy8/mismagius
mkdir scraggy8/gyarados
mkdir scraggy8/taillow
mkdir starmie7
mkdir starmie7/wynaut
mkdir starmie7/lillipup
touch starmie7/charizard 
touch starmie7/camerupt
mkdir starmie7/excadrill
touch timburr0
echo "satk=7 sdef=6 spd=9" > charmeleon3/staryu.txt
echo "Развитые способности Vital \n Spirit" > magmortar6.txt
echo "Живет Forest Glassland Rainforest" > roserade7.txt
echo "Тип \n покемона GHOST NONE" > scraggy8/mismagius.txt
echo "Ходы Air Cutter Air Slash Blast Burn \n Body Slam Counter Defense Curl Double-Edge Dragon Claw \n" > starmie7/charizard.txt
echo "Способности Ember \n Magnitude Focus Energy Flame Burst.." > starmie7/camerupt.txt
echo "Способности Focus Guts Sheer Force" > timburr0.txt
#2
chmod u+rwx charmeleon3; chmod o+rx charmeleon3; chmod o+w charmeleon3
chmod 357 charmemelon3/timburr 
chmod 570 charmeleon3/mienshao
chmod o-rwx charmeleon3/staryu.txt; chmod u+r charmeleon3/staryu.txt
chmod o-rwx magmortar6.txt; chmod u+rw magmortar6.txt; chmod g+r magmortar6.txt;
chmod o-rwx roserade7.txt; chmod u+rw roserade7.txt; chmod o+r roserade7.txt
chmod o-r scraggy8; chmod g+rw scraggy8
chmod o-w scraggy8/sunflora; chmod g-r scraggy8/sunflora
chmod uo-wx scraggy8/mismagius.txt; chmod g-rwx scraggy8/mismagius.txt
chmod o-w scraggy8/gyarados; chmod g-r scraggy8/gyarados
chmod 357 scraggy8/taillow
chmod 755 starmie7
chmod a+rwx starmie7/wynaut; chmod u-w starmie7/wyanut; chmod g-rx starmie7/wynaut
chmod u-w starmie7/lillipup; chmod og+x starmie7/lillipup;
chmod 046 starmie7/charizard.txt;
chmod 400 starmie7/camerupt.txt;
chmod o-w starmie7/excadrill; chmod g-rx starmie7/excadrill
chmod a-rwx timburr0.txt; chmod a+r timburr0.txt;
#3
ln -s timburr0.txt lab0/starmie7/charizardtimburr
cat charmeleon3/staryu.txt charmeleon3/staryu.txt > magmortar6_23.txt
ln timburr0.txt lab0/scraggy8/mismagiustimburr
cat timburr0.txt charmeleon3/staryutimburr.txt
cp timburr0.txt charmeleon3/timburr
ln -s starmie7 Copy_92
cp -R scraggy8 charmeleon3/timburr
#4
wc -c charmeleon3/staryu.txt scraggy8/mismagius.txt starmie7/charizard.txt | sort -n -r
grep -r llo opd/lab0/ 2>/tmp/errorsNull | ls -ltr
grep -nr '^t' lab0/ 2>/tmp/errorsNull
find lab0/ -name 't*' 2>/dev/null | cat -n | sort -r
cat lab0/timburr0.sh 2>/tmp/errorsNull | grep -vi 'r$'
sed '/6$/d' timburr0.txt 2>/dev/null
grep -r mbu opd/lab0/ 2>/tmp/errorsNull && ls -S
#5
rm roserade7
rm starmie7/camerupt
unlink lab0/starmie7/charizardtimbu*
unlink lab0/scraggy8/mismagiustimbu*
rm -rf charmeleon3
rm -rf charmeleon3/mienshao
 
