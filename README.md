# RayCasting #
## Table of content ##
1. [Project]()
2. [ScreenShots]()
3. [DevLogs]()
4. [Tools]()
5. [Author]()
6. [Sources]()
## Project ##
This project aims to recreate a 3d engine similar to the one put in place in the Game Wolfenstein 3d. This project will be realised solely in java with swing.  
![Ray Casting exaple from Wikipedia](https://github.com/LEBOCQTitouan/RayCasting/blob/main/img/readme/rayCastingExample.gif)  
***A simple example of raycasting***
## Screenshots ##
## DevLog ##
### Day 1 ###
- [x] creation basic folder/file organisation
- [x] Vector intersection
- [x] diagram class
### Day 2 ###
I have discovered that creating 3D vectors was useless in RayCasting ( and so was creating a method enabling us to detect intersections between 3D vectors 😢 ).
Indeed RayCasting make a 2D map appear as 3D. For instance (sorry same as the other one):  
![Ray Casting example](https://github.com/LEBOCQTitouan/RayCasting/blob/main/img/readme/rayCastingExample.gif)  
So all the game is based on simuling depth from a 2D basis.
#### How does it work ? ####
The camera (your POV) launches rays enbabling it to detect what is in front of him, and the more an object will be far from the camera the smaller it will appear on screen.
#### How to make the POV look 3D ? ####
First all walls will have a fixed height and will be all on the same plane. Why ? Because thanks to that we will already know the height of the obstacles and thanks to that we will be able to calcuate only have an only unknown value.  
![Raycasting Demo](https://github.com/LEBOCQTitouan/RayCasting/blob/main/img/readme/RaycastingDemo.png)  
Finally we put a our screen between the objects and our camera and we have our simulated 3D vision.  
Let's get to work !  

## Tools ##
## Author ##
## Sources ##
