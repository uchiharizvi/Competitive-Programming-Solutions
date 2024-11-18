# Problem Sum Array Puzzle

Given an array arr[] of n integers, construct a Sum Array sum[] (of same size) such that sum[i] 
is equal to the sum of all the elements of arr[] except arr[i]. 
Solve it without subtraction operator and in O(n).

### **Example**

Input : arr[] = {3, 6, 4, 8, 9}

Output : sum[] = {27, 24, 26, 22, 21}
### **Example**

Input : arr[] = {4, 5, 7, 3, 10, 1}

Output : sum[] = {26, 25, 23, 27, 20, 29}

### **Algorithm:**
1) Construct a temporary array leftSum[] such that leftSum[i] contains sum of all elements on left of arr[i]
excluding arr[i].
2) Construct another temporary array rightSum[] such that rightSum[i] contains sum of all elements on on right
of arr[i] excluding arr[i].
3) To get sum[], sum left[] and right[].
