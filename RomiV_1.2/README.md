Hello!

Your first lesson over the romi bots is that almost everything in the code is bad and wrong and gross

what we must do first is to download this awful code :)

All of the information I will be giving here today is also accessable through the documentation: https://docs.wpilib.org/en/stable/docs/romi-robot/index.html

But I will be teaching you more things that are not in the documentation and should be greatly simplyfied in this file

First things first: your romi or pololu is a robot similar to the frc bots. What I teach you is meant to be for teleop, if you chose to learn anything autonmous this README Docs will not be useful, you will have to teach youself that information or ask someone who is knowlegable in autonomous.

Okay now the actual proccess of downloading the disgusting code, 
1st: You must download the Romi.zip file from this cool user on Github, https://github.com/wpilibsuite/WPILibPi/releases
    We used the 2022 version because the 2023 version was or still is broken
After we download that file we also need to download an Balenaetcher - https://www.balena.io/etcher 

2nd: We need to flash a micro sd card: there should already be a micro sd card in the boxes: you will also need a micro sd --> usb adapter, we should have one in our build room somewhere if it isn't with the romi boxes
After you flash the SD card put it into the romi, will then need a mircro andriod plug into a usb.

This is the wireless Network Setup portion

turn on the romi

connect to Romi wifi WPILibPi(seriel #) w/ WPILib2021 as the passcode

the open your web browser and put in http://10.0.0.2/ or http://wpilibpi.local/

When you get into the site click the button in the top right and toggle it to writable

Now we are going to change the passcode and name

go to Network settings and give it a new SSID and a new passcode(passphrase) (we made the SSID into RomiV and RomiJV we also make the passcode WPILib1810 for both romis)

Now put it into read only

Turn off the romi
Connect a USB A to a micro-B cable from the pi to the romi
next turn it back on and connect it to its Wifi network and connect to the web dashboard

Next go to romi and scroll down to where it says update Firmware

A consle will pop up and should say it worked in smarter terms :)



Now we must program the romi

First we must create a new WPILib project
    Hit ctrl-shift-p
    then select "Create a new project
        Now you must fill in what you want your project to look like
            Select project type, make it an Example
            
            next find RomiReference
            
            fill out the rest of the fields (our team is 1810)

    Then click Generate Project

Now of you wanna make the bot drive you can, it comes with ArcadeDrive (which is gross), all you need to do it to hook up a controller. F5 will generate the Simulated Robot Code and will open the drive station

You know the Romi code is functioning when you see (HALSimWS: WebSocket Connected)

Congrats you have set up your romi

In this code we replaced arcade drive with tank drive and imported an xbox controller. We also deleted all autonoumous code, and now works really well

You can program the romi for whatever you want to do though 

- Jacob Morton
    - Romi Documentator