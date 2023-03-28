/* *****||Make A, B Equal||*****

Time Limit: 2 sec
Memory Limit: 128000 kB

**Problem Statement**
You are given two arrays A and B of n elements, each element is either 0 or 1.
You can make operations of 2 kinds:
Pick an index i and change A[i] to 1-A[i].
Rearrange the array A however you want.
Find the minimum number of operations required to make a equal to b.

**Input**
First line contains n.
Next line contains n space separated integers denoting Array A.
Next line contains n space separated integers denoting Array B.

**Constraints**
1 <= n <= 105
0 <= A[i], B[i] <= 1

**Output**
A single integer denoting required operations.

**Example**
Input:
3
1 0 1
0 0 1
Output:
1
Explanation :
change A[0].
Input:
4
1 1 0 0
0 1 1 1
Output:
2
Explanation :
change A[2] and then rearrange. */

/* ***Solution*** */

class Main {
    public static void findMinOperations(int A[],int B[],int n){
        int x=0; // count no of 1s /sum for array A
        int y=0; // count no of 1s /sum for array B
        int z=0; // exact places mismatch in both arrays  -> without reshuffling
        for(int i=0;i<n;i++){
            if(A[i]==1){
                x++;
            }
        }

        for(int i=0;i<n;i++){
            if(B[i]==1){
                y++;
            }
            if(A[i]!=B[i]){
                z++;
            }
        }
        int ans=Math.min(z,Math.abs(x-y)+1);
        System.out.println(ans);

    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        int B[]=new int[n];


        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }

        findMinOperations(A,B,n);
    }
}