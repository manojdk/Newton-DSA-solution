/* *****||Boundary Traversal of Matrix||*****

Time Limit: 2 sec
Memory Limit: 128000 kB

**Problem Statement**
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.

**Input**
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

**Constraints:**
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100

**Output**
For each testcase, in a new line, print the boundary traversal of the matrix A.

**Example**
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4
Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4  */

/* ***Solution*** */

class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            if (m == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[0][i] + " ");
                }
            } else if (n == 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[j][0] + " ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[0][j] + " ");
                }
                for (int i = 1; i < m - 1; i++) {
                    System.out.print(arr[i][n - 1] + " ");
                }
                for (int j = n; j > 0; j--) {
                    System.out.print(arr[m - 1][j - 1] + " ");
                }
                for (int i = m - 1; i > 1; i--) {
                    System.out.print(arr[i - 1][0] + " ");
                }
            }
            System.out.println();
        }
    }
}