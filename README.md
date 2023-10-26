### DieGame

Prerequisites:

    Primitive Data Types
    Loops
    Arrays
    Classes
    Interfaces

Learning Objectives:

    Using interfaces
    Using simulation to test alternative strategies

In this project, I implemented a multiplayer dice game called "Die." The main goal of the game is for the first player to reach a target of 100 points to win. Each player, in turn, rolls the dice and checks their accumulated points. In each turn, a player has two choices: "roll" and "hold."

Within this project, I created various classes and interfaces to test different strategies. Firstly, I defined a general Die player by implementing the DiePlayer interface. Then, I created classes such as HoldAt20DiePlayer, HoldAt25DiePlayer, and RaceToGoalDiePlayer to represent strategies. These classes determine whether players should roll or hold based on different criteria.

I also allowed a human player to participate by creating the UserDiePlayer class. This class provides options for the player to make moves from the command line and handles whether the player should roll or hold based on user preferences.

To represent my own strategy, I created the MyDiePlayer class. This strategy defines the player's decisions in cases where a specific point threshold is reached or as the target score is approached.

The DieGame class is the one that implements the rules of the game. I added specific data members to keep track of players and scores. I simulated each turn with the playTurn() method and found the player with the highest score using the getMaxScore() method. Additionally, I printed the players' scores to the screen using the printScores() method.

Finally, I created the PlayDie class and tested the game with the main method. I used this class to play the game with computer players having different strategies and the UserDiePlayer class or to calculate statistics.

To complete the project, I gathered statistical data by playing the game 1,000 times. I calculated the winning percentages for each strategy and saved the results in a text file named "statistics.txt." In this file, I evaluated the performance of each strategy and determined the best strategy, sharing my observations.

In summary, in this project, I created an object-oriented implementation of the dice game "Die," a playable game with different strategies. I tested various strategies and explored the dynamics of the game by comparing my strategy with others.
