import java.util.*;
import java .io.*;
public class Arsto
{
  public static int[] astcoll(int [] ast)
  {
  Stack<Integer> st=new Stack<>();
  for(int val:ast)
  {
   if(val>0){ st.push(val);}
   else
   {
    while(st.size()>0&& st.peek()>0&&st.peek()<-val)
	{
	 st.pop();
	}
	if(st.size()>0&&st.peek()==val){ st.pop();}
	else if(st.size()>0&&st.peek()>-val){
	}
	else{
	st.push(val);
	 }
   }
  }
  int ans[]=new int [st.size()];
  int i=ans.length-1;
  while(i>=0)
  {
  ans[i--]=st.pop();
  }
  return ans;
  }
 public static void main(String []args)throws Exception
 {
 BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
 int n= Integer.parseInt(read.readLine());
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
 a[i]=Integer.parseInt(read.readLine());
 int result[]=astcoll(a);
 //System.out.println(result.length);
  for(int e:result)
  {
   System.out.println(e);
  }
 }
 }

}