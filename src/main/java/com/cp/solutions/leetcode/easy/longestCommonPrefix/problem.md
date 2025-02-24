# [LC#14 Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/)
#easy

`Runtime : 1ms | Time : O(n log n)| Space : O(1)`

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

**Constraints:**

* 1 <= strs.length <= 200
* 0 <= strs[i].length <= 200
* strs[i] consists of only lowercase English letters if it is non-empty.

**Example 1:**

Input: strs = ["flower","flow","flight"]

Output: "fl"

**Example 2:**

Input: strs = ["dog","racecar","car"]

Output: ""

Explanation: There is no common prefix among the input strings.