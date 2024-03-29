<table><tr><td> <em>Assignment: </em> IT114 M2 Java-HW</td></tr>
<tr><td> <em>Student: </em> Pallavi Kanoor(pk558)</td></tr>
<tr><td> <em>Generated: </em> 6/4/2022 7:20:32 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-m2-java-hw/grade/pk558" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p><br></p><p><strong>Template Files</strong>&nbsp;You can find all 3 template files in this gist:&nbsp;<a href="https://gist.github.com/MattToegel/fdd2b37fa79a06ace9dd259ac82728b6">https://gist.github.com/MattToegel/fdd2b37fa79a06ace9dd259ac82728b6</a>&nbsp;<br></p><p>Setup steps:</p><ol><li><code>git checkout main</code></li><li><code>git pull origin main</code></li><li><code>git checkout -b M2-Java-HW</code></li></ol><p>You'll have 3 problems to save for this assignment.</p><p>Each problem you're given a template&nbsp;<strong>Do not edit anything in the template except where the comments tell you to</strong>.</p><p>The templates are done in such a way to make it easier to capture the output in a screenshot.</p><p>You'll copy each template into their own separate .java files, immediately git add, git commit these files (you can do it together) so we can capture the difference/changes between the templates and your additions. This part is required for full credit.</p><p>HW steps:</p><ol><li>Open VS Code at the root of your repository folder</li><li>In VS Code create a new folder/directory called M2</li><li>Create 3 new files in this new M2 folder (Problem1.java, Problem2.java, Problem3.java)</li><li>Paste each template into their respective files</li><li><code>git add .</code></li><li><code>git commit -m "adding template baselines</code></li><li>Do the related work (you may do steps 8 and 9 as often as needed or you can do it all at once at the end)</li><li><code>git add .</code></li><li><code>git commit -m "completed hw"</code></li><li>When you're done push the branch<ol><li><code>git push origin M2-Java-HW</code></li></ol></li><li>Create the Pull Request with <b>main</b>&nbsp;as base and&nbsp;<strong>M2-Java-HW</strong>&nbsp;as compare (don't merge/close it yet)</li><li>Create a new file in the M2 folder in VS Code called m2_submission.md</li><li>Fill out the below deliverable items, save the submission, and copy to markdown</li><li>Paste the markdown into the m2_submission.md</li><li>add/commit/push the md file<ol><li><code>git add m2_submission.md</code></li><li><code>git commit -m "adding submission file"</code></li><li><code>git push origin M2-Java-HW</code></li></ol></li><li>Merge the pull request from step 11</li><li>On your local machine sync the changes<ol><li><code>git checkout main</code></li><li><code>git pull origin main</code></li></ol></li><li>Submit the link to the m2_submission.md file from the main branch to Canvas</li></ol><p><br></p></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Problem 1 - Only output Odd values of the Array under "Odds output" </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> 2 Screenshots: Clearly screenshot the output of Problem 1 showing the data and show the code</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/172028145-3cb81e2d-114a-4f5a-b17a-b26bb9393427.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Problem 1 Output<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/172028147-959b9985-1d11-4f33-b3ec-3431a97f834a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Problem 1 Code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Describe how you solved the problem</td></tr>
<tr><td> <em>Response:</em> <p>I solved the problem by using the logic that when a number is<br>divided by two and there is a remainder of one, it is an<br>odd number. I implemented that into my code by using an if statement.<br>To traverse through the array, I used a for each loop. At the<br>end, I printed whichever element in the array met the condition of having<br>a remainder of one (odd numbers), which created a list of odd numbers<br>in the array.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Problem 2 - Only output the sum/total of the array values (the number must end in 2 decimal places, if it ends in 1 it must have a 0 at the end) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> 2 Screenshots: Clearly screenshot the output of Problem 2 showing the data and show the code</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/172028210-94e783be-9e3c-48b2-a8fa-0780f1507834.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Problem 2 Output<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/172028212-6bc2a6cf-a709-41d8-a9e4-d9f757864fb5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Problem 2 Code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Describe how you solved the problem</td></tr>
<tr><td> <em>Response:</em> <p>In order to add the elements of the array, I used the total<br>counter which was set and added each value of the array to it,<br>which built up to the final total count.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Problem 3 - Output the given values as positive under the "Positive Output" message (the data otherwise shouldn't change) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> 2 Screenshots: Clearly screenshot the output of Problem 3 showing the data and show the code</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/172028239-f2bfaf59-27ee-4ebf-8c41-5d9127bd8899.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Problem 3 Output<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/172028244-6e8bd772-30ae-4cd8-a58e-34b077b9f531.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Problem 3 Code Part 1<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/106254258/172028247-0d21a122-a208-45ea-b2ee-cf4717d79ab2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Problem 3 Code Part 2<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Describe how you solved the problem</td></tr>
<tr><td> <em>Response:</em> <p>The positive conversion was done using a switch statement. There are cases, which<br>represent each array type that was in the code. Depending on which one<br>it matches, the case is chosen and then the break statement breaks out<br>of the loop. I also referenced the StringBuilder at the bottom of the<br>code, specifically the .getClass() and .getSimpleName() operators.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc Items </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull Request URL for M2-Java-HW to main</td></tr>
<tr><td>Not provided</td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about what you learned, any issues you had, how you resolve them</td></tr>
<tr><td> <em>Response:</em> <p>I was able to refresh my Java skills from CS113, especially in terms<br>of figuring out logic to use to solve the problems. Problem 3 was<br>extremely challenging at first, as I thought out a lot of different ways<br>of solving the situation before I was able to complete it properly. What<br>mainly helped me was the StringBuilder code at the bottom, as I was<br>able to reference that and build my code accordingly.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-m2-java-hw/grade/pk558" target="_blank">Grading</a></td></tr></table>