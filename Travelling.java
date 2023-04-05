/* -----||Travelling||----- 

Time Limit: 2 sec
Memory Limit: 128000 kB

--Problem Statement--
Given N cities in a line and your initial position, you want to visit all the cities at least once. You can go to one coordinate P to P+D or P-D where D is the number of steps which you choose initially. Your task is to find the maximum value of D such that you can visit all the cities at least once.

--Input--
The first line of input contains two integers N and X(initial position). The second line of input contains N space separated integers representing the location of cities.

--Constraints:--
1 <= N <= 100000
1 <= City[] <= 100000000

--Output--
Print the maximum value of D such that you can visit all the cities.

--Example--
Sample Input:-
3 3
1 7 11
Sample Output:-
2
Sample Input:-
3 81
33 105 57
Sample Output:-
24 */

/* ---Solution--- */
class Main {
    static int fun(int a,int b)
    {
        if(a==b)
        {
            return a;
        }
        if(a>b)
        {
            return a-b;
        }
        else return b-a;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr [] = new int[n];
        int b[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++){
        b[i]=fun(arr[i],k);
    }
    Arrays.sort(b);
    System.out.print(b[0]);
}
}
