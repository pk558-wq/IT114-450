<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Pallavi Kanoor(pk558)</td></tr>
<tr><td> <em>Generated: </em> 8/6/2022 3:06:59 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone4/grade/pk558" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262209-d6c10952-833d-4a03-aa1c-2f71023305b6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the export button can be clicked to export all chat history it will<br>then be saved in a txt file in the same directory as the<br>client<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262240-20b02e5f-b6e0-4661-a7ed-bc87f3fe0c1c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this is the folder it is saved to every time. then you click<br>the name and you can open the chat<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262257-831b2791-2b41-4802-9f64-c33383c87230.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this is the .txt file for billy who just pressed export<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262279-2bfd2c2a-7adf-4f6e-9923-71dacd15839a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this is the chat between billy and his friends in a .txt plain<br>text format<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I implemented this feature by creating an ArrayList of strings to capture all<br>the messages that were received. Then, I created an export button similar to<br>the send button. When this button is clicked, the FileWriter class is called<br>to write every string from the ArrayList in separate lines. It is stored<br>in a .txt file format so it can be viewed in any editor,<br>not just Java. Previously, I was serializing it and saving it as a<br>.dat file. I then realized that it was not readable unless it was<br>being opened using Java.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262318-124dcc93-707a-45ed-8c39-ed395957b9e0.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this is the muted list folder which is stored per user the file<br>name is the same as the username<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262330-428d302b-9262-4a19-9a94-0c9ca576b878.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this is a serialized java binary file. billy muted teddy so the file<br>is called billy.dat<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262428-23857c6e-1524-401f-b7be-afb9db4303cd.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the server is now stopped, but the muted users will be on the<br>disk<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262486-18cf5ff4-86ae-4639-8ba1-226c8ea710e8.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this is the server restarted<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262615-13ef5208-f504-45d3-abbf-d21035edddd4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>billy has teddy muted since the last time the server was started so<br>that has persisted<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I implemented this function by using serialization. I used an ArrayList to store<br>the muted users. When the /mute is called, the code checks if the<br>user is already in the list, and if so, that user is not<br>added again. It returns a boolean of true or false. If the user<br>has been added, then true, and if not, then false. Based on the<br>boolean result, the messages are sent to the receiving user, otherwise that user<br>will get bombarded. This is to avoid spamming.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262702-c0243e2b-b643-4712-baf6-b46fc3b63aa3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the users who got muted and unmuted are receiving alerts about it<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262767-94ba2f25-c90d-46c6-9858-4f85c3321bb5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code of when the users are alerted<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>To implement this feature, I utilized the startsWith() function. If the message starts<br>with “/mute” or “/unmute,” then you get the username using substring. Then, the<br>user is sent a message saying that they were muted or unmuted by<br>a user.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262702-c0243e2b-b643-4712-baf6-b46fc3b63aa3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the grayed out users are the ones that you have muted<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/183262838-21aa84f5-611b-4f9e-8bbc-d0934f4e5b39.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>billy is the last to speak to he gets highlighted<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>For this feature, I set the background color to gray if a user<br>typed “/mute.” If the user typed “/unmute,” then the background was reset using<br>repaint(). And for the highlighting of the last user to send a message,<br>I set the background color to red, and again, when the next user<br>typed, the previous user was reset. At the bottom of the for loop,<br>I put in the repaint() function for a fresh start each time. I<br>saved the last user in a variable called lastSenderID so that if the<br>same sender sends multiple messages, the background is not changed every time.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone4/grade/pk558" target="_blank">Grading</a></td></tr></table>