*Chip's Challenge Design Choices*
=================================

*MVC Architecture*
=================
For the JavaFx application, the system is split into:
~ A Model that builds levels.
~ A Controller that process the logic of object interaction.
~ A View that is used to display ImageViews to the scene.

*Strategy Pattern*
==================
The *LevelBuilder* class implements the strategy pattern in order to build the objects necessary for different levels. An array of interfaces holds the strategy for building Chip, Tiles, Obstacles, and Collectables.

*Observer Pattern*
==================
The *LevelDisplay* class observes the *Inventory* class in order to change the text displayed to the user whenever the *Inventory* class is updated.

*Inheritance*
=============
Gates and Walls inherit from the abstract Obstacle class, allowing the system to contain a data structure of obstacles with varying displays and logic for interaction. 
Keys and Flippers inherit from the abstract Collectable class for the same reason.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
If I could re-design this project I would change how I implemented the TileBuilders. The process of coding 125 tiles was tedious and could have been more systematic. I also would have used more arrays within classes to hold the duplicated private data types. 
