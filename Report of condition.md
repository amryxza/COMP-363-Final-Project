# Status of the Project


Built a framework using java.swing classes

The .txt files represent the script flow, with each acting as an object
containing the dialogue and ending when a decision needs to be made.

The Frame Class is the main brains of the code. It sets up a window to display
the text. Thinking of using a scanner and taking the script line by line
using markers like integers for setting up things like choice buttons (this 
is the decisionScreen method).

THE PROBLEMS SO FAR

    -Texts are obstructed by the previous or blank text
    -Decision buttons are not able to handle path decision
    -Decision detection only acts on the first script

THINGS TO THINK/DO

    -User name input
    -Graphics
    -Mentioned problems 
    -Other ways to process the script
    -Think about how to add the point systems

-----------------------------------------------
# Update v2

    -Fixed structure in the code
    -No more problems with the text display
    -Decision pathing is fixed

We still have the same extra things to do still, but this is the basic explanation of each class

*Game.java*
-
This class instantiates the other classes and contains the main() method to execute. There is a class
called ChoiceHandler() that retrieves a command from when the buttons are pressed, executing the corresponding code. 
(Used switch statements to work the button logic.)

*UI.java*
-
This class sets up all the panels and text boxes. Want to add more intaractive areas. This is where we set up the 
base. This is also where we can add images (still need to be added).

*ScreenManager*
-
This class is responsible for displaying the correct panels needed when we need them. This is where we can code extra utilities
for the user to interact with. This relies on the condition that the J**** object has been added. Also, any buttons will need to have
their commands added under the handler to be executed. 

*Story*
-
This class is in charge of the story. It stores the dialogue on an arraylist, and we store a couple of other
variables like the paths and the option text for the decision buttons. This is where the information processing is.

    Dialogue = Dialogue for the scene is added to the array
    ...
    pathFlag = this is where we can store the type of path we are having as of now. (???) is the diverging decision flag. We can 
                create other flags for other purposes.
    question = this is the prompt for the player to decide
    Option 1&2 = next are the 2 lines for the option Strings to chose between
    Path 1&2 = the last 2 lines contain the actual path lines for the text that we will process next

We can modify or add to this; we just need to implement the code in the textIN() method. 

*Player*
-
This class just stores the general data of the player. This class is yet to be implemented, but it is initialized in setUp() in the Story class

-----------------------------------------------


# Update V3

The code has been routed with everything that has been ready and is ready for a demo.
The only comment is that we need to rework the pacing and some of the wording,
as it loses a lot of the writing. 

The code for the processing has been dictated, but we can mix symbols to add more. Each group of symbols 
represent a specific type of decision loop or action:

    ??? = decision between 2 options
    XXX = No decision to be made, dictated path
    @@@ =  Redundant choice, they both lead to the same path
    ### = Triple choice, 3 paths
    *** = End activator for the demo

There are a lot of things that we can still add.

For the point processing, thinking of either using the text files to store the 
 values (since they only change as the decisions are made), or storing the decision prompts
 onto a hashmap using the options as keys to get the corresponding values.

 ---------------


# Update V4

*Testing*
-
Prior to the demo, some conversation paths were not linked together to form a complete tree.
Edits have since been made to ensure that the wording is not cut off when it is displayed, and the game
was run several times through the sections of the decision tree to make sure all the paths are correct. Majority
of the testing for this project was done this way, since viewing the progression of the conversation is
easiest if you are simply playing the game. Conversation prompts were flagged if they returned an error or incorrect path,
and then the code was amended to fix these issues. Because of the size of the dialogue, several typos were also
found this way and have also been amended. Every decision path was tested manually to ensure there are
no bugs. The code should now display a clear path through the tree that is comprehensible to both players and developers.

*Iterative Design*
-
The design has been modified to reflect the original intentions of the game, which was to have mutable personalities
moods of each of the characters. This was difficult to implement, because we also needed to connect certain paths to
specific mood values for each character. For example, if one of the NPCs becomes frustrated with the player in a conversation, the decision
path is modified to only allow for a more hostile conversation. The difficulty was determining whether these paths should
be forked from specific player responses, or if the paths should be based solely off of the current personality variable
values. In the end, we decided on a mixture of both. Some decision paths can only be reached if the player chooses
a specific response in a conversation, while other paths have the option to be reached either directly by conversation, 
or by reaching a certain variable value at a later point in the game. This makes for more realistic and AI-like conversations,
as there is not a straight-shot path through the game but rather a web of paths. 
 
 -------
