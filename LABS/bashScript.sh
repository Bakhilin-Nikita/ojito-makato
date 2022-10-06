#!/bin/bash
#1
cd ~/ojito-makato/LABS/; umask 022
mkdir lab0
cd lab0
mkdir -p charmeleon3 charmeleon3/timburr charmeleon3/mienshao charmeleon3/swellow
touch charmeleon3/staryu magmortar6 roserade7
mkdir -p  scraggy8 scraggy8/sunflora scraggy8/gyarados scraggy8/taillow
touch scraggy8/mismagius
mkdir -p  starmie7 starmie7/wynaut starmie7/lillipup
touch starmie7/charizard  starmie7/camerupt
mkdir starmie7/excadrill
touch timburr0
echo "satk=7 sdef=6 spd=9" > charmeleon3/staryu
echo -e  "Развитые способности Vital \nSpirit" > magmortar6
echo -e  "Живет Forest Glassland Rainforest" > roserade7
echo -e  "Тип \nпокемона GHOST NONE" > scraggy8/mismagius
echo -e  "Ходы Air Cutter Air Slash Blast Burn \nBody Slam Counter Defense Curl Double-Edge Dragon Claw Dragon Pulse \nDynamicpunch Fire Pledge Fire Punch Focus Punch Fury Cutter Growl Heat \nWave Iron Tail Mega Kick Mega Punch Metal  Claw Mud-Slap Ominous Wind \nOutrage Rage Roost Seismic Toss Shadow Claw Sleep  Snore Steel \nWing Swift Tailwind Thunderpunch Twister" > starmie7/charizard
echo -e  "Способности Ember \nMagnitude Focus Energy Flame Burst Amnesia Lava Plume Earth Power \nCurse Take Down Rock Slide Yawn Earthquake Eruption \nFissure" > starmie7/camerupt
echo "Способности Focus Guts Sheer Force" > timburr0
#2
chmod u+rwx charmeleon3; chmod o+rx charmeleon3; chmod o+w charmeleon3
chmod 357 charmeleon3/timburr 
chmod 570 charmeleon3/mienshao
chmod o-rwx charmeleon3/staryu; chmod u+r charmeleon3/staryu
chmod o-rwx magmortar6; chmod u+rw magmortar6; chmod g+r magmortar6;
chmod o-rwx roserade7; chmod u+rw roserade7; chmod o+r roserade7
chmod o-r scraggy8; chmod g+rw scraggy8
chmod o-w scraggy8/sunflora; chmod g-r scraggy8/sunflora
chmod uo-wx scraggy8/mismagius; chmod g-rwx scraggy8/mismagius
chmod o-w scraggy8/gyarados; chmod g-r scraggy8/gyarados
chmod 357 scraggy8/taillow
chmod 755 starmie7
chmod a+rwx starmie7/wynaut; chmod u-w starmie7/wynaut; chmod g-rx starmie7/wynaut
chmod u-w starmie7/lillipup; chmod og+x starmie7/lillipup;
chmod 046 starmie7/charizard;
chmod 400 starmie7/camerupt;
chmod o-w starmie7/excadrill; chmod g-rx starmie7/excadrill
chmod a-rwx timburr0; chmod a+r timburr0;
#3
ln -s timburr0 starmie7/charizardtimburr
cat charmeleon3/staryu charmeleon3/staryu > magmortar6_23
ln timburr0 scraggy8/mismagiustimburr
cat timburr0 >  charmeleon3/staryutimburr
cp timburr0 charmeleon3/timburr
ln -s starmie7 Copy_92
cp -R scraggy8 charmeleon3/timburr
#4
wc -c charmeleon3/staryu scraggy8/mismagius starmie7/charizard | sort -n -r
(ls -ltr ./* ./*/* | grep llo ) 2>/tmp/errorsNull 
grep -r '.*' ./t* | sort 2>/tmp/errorsNull
(cat ./ ./*/* | grep -vi 'r$') 2>/tmp/errorsNull
(ls -al ~/opd/lab0/*/** ~/opd/lab0/ | grep "t$" | sort -r) 2>/dev/null
(ls -Sr  ./ ./*/* | grep 'mbu') 2>/tmp/errorsNull
#5
rm roserade7
rm starmie7/camerupt
unlink lab0/starmie7/charizardtimburr
unlink scraggy8/mismagiustimburr
rm -rf charmeleon3
rm -rf charmeleon3/mienshao
 
