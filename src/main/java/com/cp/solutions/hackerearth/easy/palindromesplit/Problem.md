# Palindrome Split

You are given a string S consisting of lowercase English letters. 
Your task is to find the maximum number of palindromic subsequences that can be created from the given string. 
Each palindromic subsequence must have a length greater than 1, and each element of the string can be part of at most 
one palindromic subsequence.

We'll call non-empty string S[p1p2...pk] = Sp1Sp2...Spk(1<=p1 <p2<...<pk<=|s|) subsequence of string S = S1S2...S[s], 
where |S| is the length of string S. For example, strings "abcb", "cb" and "abacaba" are subsequences of string "abacaba".

## Input format

* The first line of input contains an integer denoting the number of test cases.
* Each test case consists the string

## Output format

For each test case, print the maximum number of palindromic subsequences you can create in a separate line.

## Constraints

`1<=T<=100`

`2<=|S|<=10^4`

| Sample Input | Sample Output |
|--------------|---------------|
| 2            |               |
| aaad         | 1             |
| fdffd        | 2             |

## Explanation
* In the first test case you can create one palindromic subsequence. You can create "aa".
* In the second test case you can create two palindromic subsequence. You can create "dfd", "ff".


