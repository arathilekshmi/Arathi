public class Second
{
    public static  void main(String[]args)
	{ 
	   int[]a={3,4,5,6};
	   int[]b={9,3,2,0};
	   int temp;
	   for(int i=0;i<a.length;i++)
       {
	     for(int j=i+1;j<a.length;j++)
		 {
		   if(a[i]>a[j])
		   {
		     temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			}
          }
        }
		int t;
		for(int i=0;i<b.length;i++)
       {
	     for(int j=i+1;j<b.length;j++)
		 {
		   if(b[i]<b[j])
		   {
		     t=b[i];
			 b[i]=b[j];
			 b[j]=t;
			}
          }
        }
       System.out.println("Smallest nth element=" +a[1]);
	   System.out.println("Smallest nth element=" +b[1]);
	 }
}	 
    //  output:Smallest nth element=4
    //         Smallest nth element=3	
	
	
	
	
	
	
	
	