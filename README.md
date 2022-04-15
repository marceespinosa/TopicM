# TopicM
JAVA Assigment. Topic Modeller

Created by Ana Marcela Espinosa 
Computer Science Infrasctructure TUD
Student Number C20306516


This code/program is a topic modeller un which it will let the user be able to choose
2 text files from drectories in order to then compare them and display the top 10 main words used 
in the file as well as the similarity of both text files. 

I have created a Java project called Assignemt, in which then i created a package called 
com_file.OO and last but not least i created 3 classes called: NewGUI, Control and FileProcessor.

In my FileProcessor file I declared my attritubes at the top and have started with my methods. 
I have decided to go for a HashMap in which it will store AllWords as wll as another HashMap in ehich it will store the words from the files
I also declared an Array in which it will read the file from the stop words and will store them in 
an Array 

To be able to open the file, i declared a FileChooser to be able and open it in the GUI. 
In my First method in the FileChooser class, i have readWords, this has a try and catch in it in which it will read the file line by line
there is a while loop inside of the try in which it will help to read the file from the stop words
and store them into the array in the foor loop it will have error checking in whic it will turn the 
wirds into lowercase ad in there it will add the words to the array StopWords_2.
Now there is another while loop in which now it will read the words from the text file in which the 
user has selected and it will check for the stop words; if there are any stop words then it wont be 
stored in the array for the words. There is a foor loop in which it will have the same error 
checking and will have everything into lower case and will split every word. Then there is an if 
statment, that if statement is if any of the words from the text file areequal to the stopwords 
then it will not store it, but if it doesnt have a stop word then it will added to Words_2.
Now the Hashset, so after the file has been read and scanned the file it then will store them 
into the hashset. There us a for loop in which it will look for the words and their frequency 
then it will go throught the if loop and if the word is repeated it will have a counter in which 
it will count that pecific word. 
lastly there is an if statement for it tow compare the two files and will have the two files 
'words' put into one set of words.

Moving on to my GUI class, my class is called NewGUI; I have declared all of the attributes at  
the top such as the JLabel, the buttons, panel, textfields and the FileChooser file 1 and file 
2, I also have a counter an in a string and an int input and a starbutton. 
In the first method called NewGUI i have it as a string tittle(I will explain later on). i have 
created th elabel and the frame, i have set the fram to be visible and set a size to it, i have 
also set a layout. Then I have created the panel2 and added them to the frame, i have also given 
them a background color. 
I have also created the buttons and have given them a background color, i have added to buttons 
to their respective panel and have added them text. 
Button will have a text called first file and if the mouse is on top of that text then it will 
say to "Please select a file" and it will have an ActionListener that later on is going to be 
useful for when the button is clicked then it will select a file. 
Button2 then has a text called Second File and if the mouse in on top of the button box then it 
will say to "Please enter a second file"
Then I have the topwords in which its a textflied in there it will have a text saying to "Please 
enter the amount of topwrds desired and then button 3 will  have the Top Word enter button and 
if the mouse in on top if that box it says enter. For now stopwords textfield it say to "Please 
enter a stop word" then it will have a box button5 in which it will have the text Stop Word Enter and if 
the mouse is on top if the box then it will say to Enter. 
Then button 4 will have the start button and if the mouse is on top then it will just say save 
and run. The button 6 is to show the top words andif the mouse if on top of it, it will just say 
to Select and see the top words.
Now i have a method called ActionPerformed in which then any of the buttons have been pressed 
then something needs to happen, now if button 1 is pressed then it let the user choose the file 
they want to compare and if will display the path on the console. then if button 2 is pressed 
then is the same as button1 that it will let the user choose the file and it will display the 
path of that file.
if button 3 is presed then its going to add the stop word input from the user to the stopwords 
list.
if button 4 is pressed it will now read the 2 files it will get the path, it will go to my 
FileProcessor class do whats required like reading the words from the file and then it will come 
back around go into the if statement to check the similarity of the text files and it will have 
that the similarity is equal to the wordcounter times 100 and it will divide by the number of 
the words that are in the file. and then it will go into another if statement in which if the 
similarity is greater than 45% then it will display the chance of being the same topic or else 
the % of not being the same topic.
There is noting put into the fields from the user then button 4 will display to enter a valid 
number and the counter and similarity will be equal to 0;
Moving further, button 5 if the textfield top words is empty then the button 5 will dispplay to 
please enter a number else it will check the top words
last but not least button6, this button will now be display the words into the console. it will 
go into the File Processor class and it will go through the hashmap. 


In my Control i only have the GUI in which is called NewGUI and the NewGUI class had a String 
title in order to be able to declare the title in my main; in this case it is Text and Words




I think that if i had more time, i woulve put more into the GUI probably more background color, 
more error checking, probably implemet it with Q3, adn let the user also find a word and to 
display how many times it was on that file. or search for the word and display the ord with the 
sentence. I would not let it look this simple



