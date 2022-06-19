<table><tr><td> <em>Assignment: </em> IT114 - Sockets Part 1 - 3</td></tr>
<tr><td> <em>Student: </em> Pallavi Kanoor(pk558)</td></tr>
<tr><td> <em>Generated: </em> 6/19/2022 2:34:13 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-sockets-part-1-3/grade/pk558" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch for this assignment</li><li>Go through the socket lessons and get each part implemented (parts 1-3)</li><li>Create a new folder called Part3HW</li><li>Create an empty m4_submission.md file in Part3HW</li><li>Add/commit/push the branch</li><li>Create a pull request to main and keep it open</li><li>Copy the the Part3 code into this new folder</li><li>Git add/commit all of the sample code and the Part3HW code</li><li>Implement two of the following server-side activities for all connected clients (majority of the logic should be processed server-side and broadcasted to all clients if/when applicable)</li><ol><li>Simple number guesser where all clients can attempt to guess</li><ol><li>Hint: may want separate commands to start, stop, and guess (or starting lasts for x rounds then stops)</li><li>No need to implement complexities like strikes</li></ol><li>Coin toss command (random heads or tails)</li><li>Dice roller given a command and text format of "roll #d#" (i.e., roll 2d6)</li><li>Math game (server outputs a basic equation, first person to guess it right gets congradulated and a new equatiion is given)</li><ol><li>Hint: may want a separate start, stop, answer commands (or starting lasts for x rounds then stops)</li></ol><li>Private message (a client can send a message targetting another client where only the two can see the messages)</li><li>Message shuffler (randomizes the order of the characters of the given message)</li></ol><li>Fill in the below deliverables</li><li>Save and generated the markdown or markdown file</li><li>Update the m4_submission.md file in the Part3HW folder</li><li>Add/commit/push your changes</li><li>Merge the pull request</li><li>From the M4-Sockets branch, navigate to your m4_submission.md file on github and copy the link</li><li>Submit the direct link to Canvas</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Baseline </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add as many screenshots as necessary to show basic communication among 3 clients and 1 server</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/174494894-a6f1305a-af26-4d71-807c-4e16c702dfc8.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>One server and three clients interacting<br></p>
</td></tr>
<tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Feature Implementation 1 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <ol start="2"><br><li>Coin toss command (random heads or tails) is one of the features<br>that I chose to implement for this assignment. In order to do so,<br>the client types “cointoss” as the command. Then, either heads or tails is<br>displayed using the Random class. I made the index of heads 0 and<br>the index of tails 1. Either 0 or 1 is randomly chosen and<br>displayed. I created a String array called tossResult which contains heads and tails.<br></li><br></ol><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/174495138-8460c9c3-1a34-4a8e-9926-7bb330fae63d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Coin toss first screenshot<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/174495139-bb6eca5f-3edc-41f1-bc4e-0ef4bcedcbb9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Coin toss second screenshot (this one has the coin toss code)<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Feature Implementation 2 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <div>6. Message shuffler (randomizes the order of the characters of the given message)<br>is the second feature I chose to implement. The way I did it<br>is I created a string builder referencing the last assignment. I used a<br>similar logic for the last feature, using an array to randomize the letters.<br>Because the random class is technically a math function, it can only work<br>with integers. I assigned each letter in the word to an index, making<br>it an integer and then scrambled the integers. The new word was stored<br>in a new array and every time a letter was used, I decremented<br>it so it would not be repeated.</div><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/174495326-436ff7e9-82fe-4626-a362-86a1caa5a5d7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>String builder<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/174495339-8ff3c7c8-a40f-4d9f-9ba8-88c3a0d521ff.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shuffler code<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Did you have an issues and how did you resolve them? If no issues, what did you learn during this assignment that you found interesting?</td></tr>
<tr><td> <em>Response:</em> <p>I had a few issues during this assignment like initially connecting my server<br>to the clients. Overall, it was a really new concept for me so<br>it took me a while to figure out how to work them. I<br>was able to learn a lot of interesting things during this lesson like<br>how to implement these features and I thought it was really interesting how<br>if there was a command in front of the string it only displayed<br>to the server, not the other clients. But if there was no command,<br>then it displayed to all clients and the server.<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Pull request link</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/pk558-wq/IT114-450/pull/4">https://github.com/pk558-wq/IT114-450/pull/4</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-sockets-part-1-3/grade/pk558" target="_blank">Grading</a></td></tr></table>