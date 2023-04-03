/* *****||Logical search||*****

Time Limit: 2 sec
Memory Limit: 128000 kB

**Problem Statement**
Given a sequence of n numbers such that the difference between the consecutive terms is constant, find the missing term in logarithmic time. Assume that the first and last elements are always part of the input sequence and the missing number lies between index 1 to n-1.
Solve the problem using divide and conquer approach.

**Input**
first line contain a single integer N.
second line contain N space separated integer A[i].

**Output**
print missing number in given array.

**Constraint :**
1<=N<=10^5
1<=A[i]<=10^9

**Example**
Sample Input 1:
5
5 7 9 11 15
Sample Output 1:
13
Sample Input 2:
5
1 4 7 13 16
Sample Output 2:
10 */

/* ***Solution*** */

class Main {
    static int findMissing(int[] arr, int n)
    {
        int a, l, s, i, sum = 0, missingnumber;
        a = arr[0];
        l = arr[n - 1];
        if ((a + l) % 2 == 0) 
        {
            s = (a + l) / 2;
            s = s * (n + 1);
        }
        else {
            s = (n + 1) / 2;
            s = (a + l) * s;
        } 
        for (i = 0; i <= n - 1; i++) {
            sum = sum + arr[i];
        }
        missingnumber = s - sum;
        return missingnumber;
    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);      
    int n = sc.nextInt();
    int[] array = new int[n];
        for(int i=0; i<n; i++)  
        {  
        array[i]=sc.nextInt();  
        }    
        System.out.println(findMissing(array, n));
    }
}