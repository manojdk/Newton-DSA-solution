/* ******||Number of primes||*****

Time Limit: 20 sec
Memory Limit: 128000 kB
**Problem Statement**
Given a number n find the number of prime numbers less than equal to that number.

**Input**
There is only one integer containing value of n.

**Constraints:**
1 <= n <= 10000000

**Output**
Return number of primes less than or equal to n

**Example**
Sample Input
5
Sample Output
3
Explanation:-
2 3 and 5 are the required primes.
Sample Input
5000
Sample Output
669   */

/* ***Solution*** */

class Main {
    public static boolean isPrime(long n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void countPrimes(int n){
        int count=0;
        for(int i=2;i<=n;i++){  // 2 3 4 5 6 7 8 9 10
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countPrimes(n);
    }
}