<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Pallavi Kanoor(pk558)</td></tr>
<tr><td> <em>Generated: </em> 6/24/2022 9:17:00 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-milestone1/grade/pk558" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/175751932-fd00a58b-a822-4b0d-9431-9f8b2fc06c2c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server connected waiting for client<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/175752025-30c761e0-cd35-41dc-8d5a-5aebeb207b28.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server and client connected and able to message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>The server is listening to the client, so it is important to know<br>which port the server is listening on. This is why when I type<br>connect localhost:3000, it says server connected and listening on port 3000. This is<br>why on all the client windows, I type this so that the messages<br>are able to be received at the server end.<div>The client needs to know<br>the server address and the port that the server is listening on so<br>that it can be connected to it successfully.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/175752275-ad91de86-3995-4dc5-adc0-283da291cac3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Broadcast message received by everyone<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/175752418-9bb2f2f6-0856-473b-8ac0-e3c0185e56a0.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client not in the room not sending/receiving the message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>The messages are sent from a room to only those clients who have<br>used the /joinroom ___ command to join the room. If the client is<br>not in the room, they do not receive the message. The client in<br>the room is able to send messages to others in the same room.<br>Using /createroom and /joinroom, clients are able to create their own rooms and<br>join other rooms. Each message sent is received by everyone in the room.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/175752522-b45967d8-ab05-45b4-ad34-9a6f7e53d795.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Top right client disconnected but the server is still connected and received a<br>message from the client at the bottom left<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/175752584-64260a71-a3cb-413f-976e-4e3e9cae1b0d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server terminated and clients automatically disconnected but still running<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>To terminate the server, I did control+c and after that the clients disconnected,<br>but were still running. The clients do not crash when the server is<br>terminated because only when “quit” is typed, it closes all connections. The server<br>doesn’t crash from the client(s) disconnecting in the same manner.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/pk558-wq/IT114-450/pull/7">https://github.com/pk558-wq/IT114-450/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-milestone1/grade/pk558" target="_blank">Grading</a></td></tr></table>