import java.util.*;
import java .io.*;
public class Sort
{
  static  int [] sortByHeight(int []a)
  {
  if(a==null||a.length==0||a.length==1)
  {
    return a;
  }
  int l=0;
  int r=a.length-1;
  while(l<=r)
  {
  if(a[l]==-1)
  {
    l++;
  }
  else if(a[r]==1)
  {
  r--;
  }
  else
  {
  insertSort(a,l,r);
   l++;
  }
  }
  return a;
  }

private static void   insertSort(int[] a,int l,int r)
{
for(int ind=r; ind>=l;ind--)
{
if(a[ind]!=-1&&a[ind]<a[l])
{
 swap(a,ind,l);
}
}
}
private static void swap(int[]a,int p1,int p2)
{
int temp=a[p1];
 a[p1]=a[p2];
 a[p2]=temp;
}
public static void main(String []args)throws Exception
 {
 int a[]=new int[] {-1,150, 190, 170, -1, -1, 160, 180};
 int result[]=sortByHeight(a);
 System.out.println(result);
 }

}