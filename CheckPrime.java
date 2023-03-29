/* *****||Check Prime||*****

Time Limit: 2 sec
Memory Limit: 128000 kB

**Problem Statement**
Given an integer N, your task is to check whether the given number is prime or not

**Input**
The input contains a single integer N.

**Constraints:**
1 <= N <= 100000000000

**Output**
Print "YES" If the given number is prime else print "NO".

**Example**
Sample Input:-
2
Sample Output:-
YES
Sample Input:-
4
Sample Output:-
NO */

/* ***Solution*** */

class Main {
    public static void isPrime(long n){
        if(n==1){
            System.out.println("NO");
                return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        isPrime(n);
    }
}