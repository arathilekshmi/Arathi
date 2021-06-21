import java.util.*;
import java.io.*;
 class Least
 {
   static int least(int a[],int n)
	{
      Arrays.sort(a);
		
	  int leastco=n+1;
	  int rev=-1;
	  int count=1;
	  
	  for(int i=1;i<n;i++)
	  {
	   if(a[i]==a[i-1])
	   {
	    count++;
	   }
	   else
	   {
	   if(count < leastco)
	   {
	    leastco = count;
		rev = a[i-1];
	   }
	   count=1;
	   }
	  }
	 if(count < leastco)
	 {
	   leastco =count;
	   rev=a[n -1];
	 }
	  return rev;
	}
	public static void main(String []args)
    {
        int a[] = {1, 3, 2, 1, 2, 2, 3, 1};
        int n = a.length;
        System.out.println(least(a, n));
         
    }
  } 