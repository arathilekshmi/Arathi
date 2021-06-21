class Sumdigit
{
   public static void main(String[]args)
   {
     int  a=11,b=199, c=255 ,d=5;
	 
	 int rem=0,re=0,r=0,t=0;
	 int sum=0,su=0,s=0,x=0;
	 //number is 11
	  while(a>0)
	  {
	    rem=a%10;
		sum=sum+rem;
		 a=a/10;
	  }
	  while(b>0)
	  {
		re=b%10;
        su=su+re;
        b=b/10;	
        if(b==0&&  su>9)
		{
         b=su;
		 su=0;
         
		}			
	  }
	  while(c>0)
	  {
		r=c%10;
        s=s+r;
        c=c/10;	
        if(c==0&&  s>9)
		{
         c=s;
		 s=0;
         
		}			
	  }
	  while(d>0)
	  {
	    t=d%10;
		x=x+t;
		 d=d/10;
	  }
	  System.out.println("11=" +sum);
	  System.out.println("199=" +su);
      System.out.println("255=" +s);
	  System.out.println("5=" +x);
   } 
}	 



//OUTPUT
//11=   2
//199= 19 10    1
//255= 12       3
//5=    5        	