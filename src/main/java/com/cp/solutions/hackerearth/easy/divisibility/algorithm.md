# Divisible Problem

## Optimized Approach

### Key Observations
1. Only the last digit of the final number matters.
* If the last digit of the final number is 0, then it is divisible by 10.
* Since concatenating last digits only affects the last digit, only the last digit of the last number matters!
* If the last digit of the last number is 0, print “YES”, otherwise print “NO”.
2. Time Complexity:
* Instead of creating a large “new number” from the last digits of all elements, only focus on the last number’s last digit. This reduces time complexity to O(1) instead of O(N). 
3. Space Complexity:
* You do not need to store the “new number”.
* Instead, just store the last digit of the last element.
* Hence, space complexity is O(1).

## Optimal Approach

1. Input N (size of array)
2. Input the array of N numbers. 
3. Extract the last digit of the last number using A[N-1] % 10. 
4. the last digit is 0, print “YES”, otherwise print “NO”.