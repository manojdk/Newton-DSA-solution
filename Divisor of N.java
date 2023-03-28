/* *****||Divisors Of N||*****

Time Limit: 2 sec
Memory Limit: 128000 kB

**Problem Statement**
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.

**Input**
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

**Constraints:**
1 <= T <= 50
1 <= N <= 10^9

**Output**
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2

**Example**
Input:
2
9
8
Output
0
3 */

/* ***Solution*** */

class Main {
    public static void countOfDivisorsDivByTwo(int n){
       int count=0;
       for (int i=1;i<=Math.sqrt(n);i++){//100
           if(n%i==0){
               //System.out.println(i);
               if(i%2==0){
                   count++;
               }
               if(i!=n/i) { // 10
                   //System.out.println(n / i);
                   if((n/i) %2==0){
                       count++;
                   }
               }
           }
       }

       System.out.println(count);
   }
   public static void main (String[] args) {
   
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-- > 0){
       int n = sc.nextInt();
       countOfDivisorsDivByTwo(n);
   }
   }
}