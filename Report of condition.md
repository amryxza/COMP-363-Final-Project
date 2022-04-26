#Status of the Project


I built a frame work using java.swing classes

The .txt files represents the script flow, with each acting as an object
contaning the dialog and only ends when a decision is needed to be made.

The Frame Class is the main brains of the code. Set up a window to display
the text. I am thinking of using a scanner and take the script line by line
using markers like integers for setting up things like choice buttons(this 
is the decisionScreen method).

THE PROBLEMS SO FAR

    -Texts is obstructed by the previous or blank text
    -Decision buttons are not able to handle path decision
    -Decision detection only acts on the first script

THINGS TO THINK/DO

    -User name input
    -Graphics
    -Mentioned problems 
    -other ways to process the script
    -Think about how to add the point sytems

-----------------------------------------------
#Update v2

    -Fixed structure in the code
    -No more problems with the text display
    -Decision pathing is fixed

We still have the same extra things to do still but this is the basic explanation of each class

*Game.java*
-
This class instantiates the other classes and contains the main() method to execute. There is a class
called ChoiceHandler() that retrieves a command from when the buttons are pressed executing the corresponding code from
showing. (I used switch statements to work the button logic)

*UI.java*
-
This class sets up all the panels and text boxes. I we want to add more intaractive areas this is where we set up the 
base. This is also were we can add images but i havent tried it out yet.

*ScreenManager*
-
This class is responsible for displaying the correct panels needed when we need them, this is where we can code extra utilities
for the user to interact. keep in mind that this relies that the J**** object has been added. Also any buttons will need to have
their commands added under the handler and what it does needs to be executed. 

*Story*
-
This class is in charge of the story. it stores the dialog on an arraylist, and we store a couple of other
variables like the paths and the option text for the decision buttons. This is were the information processing is
with a simple format

    Dialoge = Dialoge for the scene is added to the array
    ...
    pathFlag = this is were we can store the type of path we are having as of now (???) is the diverging decion flag, we can 
                create other flags for other pourposes.
    question= this is the prompt for the player to decide
    Option 1&2 = next is the 2 lines for the option Strings to chose
    Path 1&2 = the last 2 lines contains the actual path lines for the text that we will  process next

We can modify this or add to this, we just need to implement the code in the textIN() method. 

*Player*
-
This class just stores the general data of the player. This class is yet to be impelemented, but it is initialized  in setUP() the Stroy class but not fully
