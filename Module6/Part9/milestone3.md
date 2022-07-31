<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Pallavi Kanoor(pk558)</td></tr>
<tr><td> <em>Generated: </em> 7/30/2022 10:29:29 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone3/grade/pk558" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006641-523cf35c-275b-45ff-a0cd-dc94c804d065.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows all 3 clients with usernames connected<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006659-c8c3fbe4-4299-46cd-af9a-7f24cda74157.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows host and port for all 3 clients (before pressing next and adding<br>in usernames)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>For this part of the project, there was a user interface created which<br>had blocks and buttons that simulated a chat box. Once a user enters<br>their port and host, they are able to enter a username and enter<br>the room. The username field cannot be left empty, otherwise we cannot distinguish<br>each user. Then, the users name appears with a : next to it<br>to signify that they sent a message and what the message is.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006803-332bb19a-99f9-4aad-860c-3005ce5cf0d0.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>#1 list of users in the room is displayed for all users, #3<br>the send message text box and send message button are shown<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006848-a27d71e9-8451-4016-822b-68220ef31a67.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>#2 shows chat history saving every time a text is sent<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182002553-0c36585a-cc57-4b5b-8b29-6c62eac080d6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>#4 code in ClientUI.java showing that the enter key works to press send<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006869-d7d1573f-5c5c-4c2c-9b5f-08fe7dc823bf.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>/flip and /roll working and the text is displayed in bold font<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006896-1a6fd0db-b151-4f80-aee2-7e5d1935c5c3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code in ServerThread.java that rolls die and flips a coin it then prints<br>the result in bold<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <p>For the /flip command, I used a random number generator. I assigned heads<br>and tails to 0 and 1, respectively. Then I did the random number<br>generator and whatever was yielded, I printed it with &lt;b&gt; and &lt;/b&gt; surrounding<br>it. This is how I got the text format logic. For /roll, I<br>did something similar using a random number generator. I had it from 0-6,<br>and it would randomly pick a number and display it. I used the<br>same &lt;b&gt; &lt;/b&gt; HTML logic to print stylized text. I did 0-6 because<br>I wanted to simulate a six sided playing dice.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006939-3df930a1-e76c-4c0c-8d99-34879ce8793a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the screenshot has #1, #2, #3, #4, #5 working<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>I used if else statements for this part of my project. I used<br>the startsWith() function and basically printed the middle part of the text (<strong>hi</strong>)<br>prints hi. If it starts with ** that means bold, -- is italics,<br>and __ is underline. For the color codes, I used startsWith(“#”).<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006964-809be658-b364-4819-a39f-24a5efaafcd0.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>anne sent cole a private message by using @cole so bob did not<br>receive this message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182002918-d83a6dba-b60b-4bb0-bc8e-9914e585a91a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>when the message starts with @ the code makes sure only that user<br>receives the message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>I used the startsWith() function for this. If the message starts with “@“,<br>then that specific message is only sent to the user that follows the<br>“@/“ and nobody else.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td> <em>Response:</em> <p><br><br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182006985-219ffca5-8fbe-496b-b2fd-e61e44d06594.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>anne muted cole so when cole sent a message only bob received it<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/182007005-62736080-972f-4a6a-9fe3-6f5c29dbda99.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>anne unmuted cole and everyone received his message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>This logic was achieved using an if statement. If the message starts with<br>“/mute” or “/unmute” then the user will either receive or stop receiving the<br>messages that have been sent.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone3/grade/pk558" target="_blank">Grading</a></td></tr></table>