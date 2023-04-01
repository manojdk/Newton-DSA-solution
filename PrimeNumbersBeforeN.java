/* *****||Prime Numbers Before N||*****

Time Limit: 2 sec
Memory Limit: 128000 kB
 **Problem Statement**
Find the number of prime numbers before N (Including that number too).

**Input**
The first line of the input contains the number of test cases T.
Next T lines contain the value N.

**Constraints**
1 <= T <= 1e5
1 <= N <= 1e5

**Output**
Print the number of primes number before that number. 

**Example**
Sample Input 1:
2
3
11
Sample Output 1:
2
5   */

/* ***Solution*** */

class Main {
    static int [] booleanArray(int num)
    {
        boolean [] bool = new boolean[num+1];
        int [] count = new int [num+1];

        bool[0] = true;
        bool[1] = true;
        for(int i=2;i*i<=num;i++)
        {
            if(bool[i]==false)
            {
                for(int j=i*i; j<=num;j+=i)
                bool[j]=true;
            }
        }
        int counter = 0;
        for(int i=1;i<=num;i++)
        {
            if (bool[i]==false)
            {
                counter = counter+1;
                count[i]=counter;
            }
            else
            {
                count[i] = counter;
            }
        }
        return count;
    }
   public static void main (String[] args) throws IOException {
        InputStreamReader ak = new InputStreamReader(System.in);
        BufferedReader hk = new BufferedReader(ak);

        int[] v = booleanArray(100000);

        int t = Integer.parseInt(hk.readLine());

        for (int i = 1; i <= t; i++) {
            int a = Integer.parseInt(hk.readLine());
            System.out.println(v[a]);
        }
    }
}
