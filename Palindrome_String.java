/* ******||Palindrome Number||*****
Time Limit: 2 sec
Memory Limit: 128000 kB

**Problem Statement**
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function isPalindrome() which contains N as a parameter.

**Constraints:**
1 <= N <= 9999

**Output**
You need to return "True" is the number is palindrome otherwise "False".

**Example**
Sample Input:
5
Sample Output:
True
Sample Input:
121 
Sample Output:
True */

//  **Solution**
static void isPalindrome(int N)
	{
	   int sum=0;
	   int temp=N;
	   while (N>0)
	   {
		   int r = N%10;
		   sum = (sum*10)+r;
		   N= N/10;
	   }
	   if(temp==sum)
	   {
		   System.out.println("True");
	   }
	   else{
		   System.out.println("False");
	   }
	}