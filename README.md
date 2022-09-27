# Chap17guessingGame
You have written a program for binary search. That’s the logic you use for the classic Guessing Game. The computer generates a random number between 1 and 100 and the user makes a guess. If the user’s guess matches the random number, the game is over; otherwise, the computer gives feedback to the user that the guess is too high or too low, and the user guesses again.

In this project, you will also provide color feedback – if the guess is too high, change the background of the pane to cyan; if the guess is too low, change the background of the pane to red; if the guess is correct, change the background of the pane to green. The game begins with the background color of yellow. Keep track of the number of guesses, and when the user makes the correct guess, tell them how many tries it took. Provide a Reset button to reset the game to play again.

You must use anonymous inner classes for the action listener in this program. The user will enter their guess in a text field and press Enter to trigger the listener for providing the guess, and click on the Reset button to trigger the listener for resetting the game.

Here is a screenshot of the launch of the game:

Ch 17 Guessing Game launch

The user enters their guess in the text field and presses the Enter button. If the guess is too low, the screen changes to show a red background color:

Ch 17 Guessing Game low

The user enters another guess and presses the Enter button. If the guess is too high, the screen changes to show a blue background color:

Ch 17 Guess Game high

If the user's guess is the correct value, the screen changes to show a green background color, and it displays how many tries the user took:

Ch 17 Guessing Game correct

Clicking the Reset button results in the launch screen, and a new random number is generated.

Play the game and take 4 screenshots as shown above, for each status (launch, too low, too high, correct).

 

Submission: the specified screenshots and the root folder for the project

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
