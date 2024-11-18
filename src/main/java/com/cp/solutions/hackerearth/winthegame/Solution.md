Solution

To solve this problem, you need to calculate the probability that Satyam wins the game based on the rules provided. Here’s a Java program that implements the solution:

Approach:

	1.	Use dynamic programming to calculate the probability. Let dp[i][j] represent the probability that Satyam wins given there are i red balls and j green balls left in the bag.
	2.	Base cases:
	•	If there are no red balls (R == 0), Satyam wins: dp[0][j] = 1.
	•	If there are no green balls and red balls exist, Satyam loses: dp[i][0] = 0.
	3.	Transition:
	•	If it’s Satyam’s turn, he draws either a red or green ball:

`dp[i][j] = \frac{i}{i+j} \cdot 0 + \frac{j}{i+j} \cdot dp[i][j-1]`


If it’s Kunal’s turn, Kunal draws either a red or green ball:

`dp[i][j] = \frac{i}{i+j} \cdot dp[i-1][j] + \frac{j}{i+j} \cdot dp[i][j-1]`

	
The solution is found iteratively for each test case.