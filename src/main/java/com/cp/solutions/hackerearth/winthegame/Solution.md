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

### Solution with Loops

Explanation:

	1.	Dynamic Programming Table (dp): This table calculates the probabilities iteratively, taking care of all possible cases.
	2.	Edge Cases:
	•	If R = 0, Satyam always wins (probability = 1.0).
	•	If G = 0, Kunal always wins (probability = 0.0).
	3.	Precision: The output is formatted to six decimal places using %.6f.

Complexity:

	•	Time Complexity: O(T \times R \times G) for each test case.
	•	Space Complexity: O(R \times G) due to the DP table.

Example:

Input:
`3
2 1
1 1
1 0`

Output:
`0.666667
1.000000
0.000000`

### Solution with Streams

Key Simplifications:

1. Java 8 Streams for Test Cases: Used IntStream.range to iterate over test cases concisely. 
2. Helper Method: Moved the main computation into a calculateWinningProbability method for 
better modularity.
3. Focus on Core Logic: Since only Satyam’s winning probability is needed, the transition logic is 
simplified by focusing on the relevant case.

Example:

Input:
`3
2 1
1 1
1 0`

Output:
`0.666667
1.000000
0.000000`

### Benefits of Simplification:

* Readability: Code is easier to follow with a clear separation of logic.
* Reusability: The computation logic is encapsulated in a reusable method.
* Conciseness: Java 8 streams and concise loops reduce boilerplate code.

This solution maintains clarity and functionality while leveraging modern Java features.

The performance difference between the original and simplified Java 8 implementation is minimal 
because the computational complexity and core operations remain unchanged. 
Here’s a detailed comparison of the two:

### Performance Analysis

#### Time Complexity:

1. Both versions fill the same  dp[R+1][G+1]  table.
2. The complexity for each test case is  O(R \times G) , which is identical for both implementations.

#### Space Complexity:

1. Both implementations use a 2D array of size  dp[R+1][G+1] , so space usage is also  
O(R \times G) .

#### Key Operations:

1. Both implementations perform the same number of mathematical calculations ( +, *, / ) 
and array accesses.

### Differences in Performance

#### Stream vs. Loop:
1. Standard for loops: Direct iteration may have slightly lower overhead compared to streams due to the lack of lambda function calls and internal stream mechanics.
2. Streams in Java 8: Streams introduce minimal overhead because of lambda creation, function references, and additional method calls during execution.
3. For small-scale problems like this one, the performance difference is negligible.
#### Modularity Overhead:
1. In the simplified version, using a helper method (calculateWinningProbability) adds a minor function call overhead.
2. However, modern JVMs optimize such calls effectively, so the impact is insignificant.

### Conclusion

1. Normal Inputs: For most practical inputs, the performance difference between the two implementations is negligible, often less than a millisecond.
2. Large Inputs: For very large inputs, the loop-based version might have a slight advantage in raw execution speed due to reduced overhead.

If performance is absolutely critical for edge cases, prefer the original loop-based implementation. 
Otherwise, the simplified Java 8 version is more elegant and easier to maintain.