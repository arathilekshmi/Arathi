import java.util.*;
 
 class Obsta {
    static int avoidObstacles(int[] obs)
    {
        HashSet<Integer> hash = new HashSet<Integer>();
        int max = obs[0];
        for (int i=0; i<obs.length; i++)
        {
            hash.add(obs[i]);
            max = Math.max(max, obs[i]);
        }
 
        for (int i = 1; i <= max; i++)
		{
            int j;
            for (j = i; j <= max; j = j + i) 
			{
 

                if (hash.contains(j))
                    break;
            }
 
            
            if (j > max)
                return i;        
        }
 
        return max+1;
    }
 
    
    public static void main(String[] args)
    {
        int a[] = new int[] { 5, 3, 6, 7, 9 };
        int b = avoidObstacles(a);
        System.out.println(b);
		int c[] = new int[] { 2,3};
        int d = avoidObstacles(c);
		System.out.println(d);
		int e[] = new int[] { 1,4,10,6,2 };
        int f = avoidObstacles(e);
        System.out.println(f);
		int g[] = new int[] { 1000,999 };
        int h = avoidObstacles(g);
        System.out.println(h);
		int k[] = new int[] {19,32,11,23 };
        int l = avoidObstacles(k);
        System.out.println(l);
		int m[] = new int[] { 5,8,9,13,14};
        int n = avoidObstacles(m);
        System.out.println(n);
		
    }
}

//  Output 
//4
//Testcases:
//4
//7
//6
//3
//6