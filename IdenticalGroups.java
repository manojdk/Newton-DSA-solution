/* -----||Identical Groups||----- 
Time Limit: 2 sec
Memory Limit: 128000 kB

--Problem Statement--
Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups without any balls left. What is the largest number of groups she can make?
Identical groups mean there are equal number of same coloured balls in each group.

--Input--
A single line containing two integers x and y.

--Constraints:--
1<=x, y<=10000000

--Output--
Return the largest number of groups that can be made.

--Example--
Sample Input
3 9
Sample Output
3
Explanation:-
1 red ball and 3 blue ball will be in each group.
Sample Input:
4 9
Sample Output:
1 */ 

/* ---Solution--- */

class Main {
    public static void main (String[] args) {
       // Your code here
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       while(n1%n2!=0){
           int rem = n1%n2;
           n1=n2;
           n2 = rem;
       }
       int gcd = n2;
       System.out.print(gcd);
   }
}