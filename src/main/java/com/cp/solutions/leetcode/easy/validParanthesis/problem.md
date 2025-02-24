# [LC#20 Valid Paranthesis](https://leetcode.com/problems/valid-parentheses/description/)
#easy #stack

`Runtime : 2ms | Time : O(n)| Space : O(n)`

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

**Examples**

Input|Output
-|-
`()`|true
`()[]{}`|true
`(]`|false
`([])`|true


**Constraints:**

* 1 <= s.length <= 10<sup>4</sup>
* s consists of parentheses only `'()[]{}'`.