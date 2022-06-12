<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Pallavi Kanoor(pk558)</td></tr>
<tr><td> <em>Generated: </em> 6/12/2022 12:16:49 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-number-guesser/grade/pk558" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><li>Add/commit the files as-is from the lesson material</li><li>Pick 2 of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/173213915-f3bcf8b8-8ba9-4399-a248-c86f0ad0820c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Output<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/173213920-86cc8a96-513e-4639-8c23-6b031f28d290.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/173213945-895bf542-c78a-43a8-a219-4a6d57b1e153.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Calling the function<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>For this modification, I implemented an if else function because I decided that<br>checking the guess and comparing it to the randomly generated number will be<br>the most efficient way to go about this problem. I did if the<br>guess is less than the number, then print higher and if it is<br>greater than the number then print lower. I created a new function which<br>I then called in the given function processGuess().<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/173213967-8380c8c1-ac5a-46df-ac7b-cff294462169.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Output<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/173213981-11b0dd55-3f98-4ad6-8084-43d56dbdc17b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/173213983-ea500b8d-d066-45c0-be98-28fcd78346b5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Calling the function<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>In order to solve this problem, I integrated an if else if else<br>block. Because there were three conditions to check, I thought this would be<br>the most effective way to complete it. I also had to use the<br>math absolute function in case guess - number ended up being a negative<br>number. I used the ranges 10, 5, and 2 to check each case.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/pk558-wq/IT114-450/pull/3">https://github.com/pk558-wq/IT114-450/pull/3</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>During this lesson, I was able to revisit some things I had learned<br>in a previous class I took in Java last semester. Some of this<br>topics include if else statements and calling functions. Some struggles I encountered while<br>completing this homework are that at first my cold, warm, hot function was<br>not showing up every time. After looking at my code again, I realized<br>that guess - number can be negative in some cases. Because my if<br>else if else function was only accounting for a certain range of positive<br>values, this would not show up. I then decided to use the math<br>absolute function to tackle this issue.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-number-guesser/grade/pk558" target="_blank">Grading</a></td></tr></table>