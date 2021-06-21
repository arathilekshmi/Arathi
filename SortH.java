import java.util.*;

public class SortH 
{
	
	public static int[] sortByHeight(int[] a) 
	{
	    List<Integer> humanList = new ArrayList<>();
		List<Integer> indexList = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>(a.length);

	    for(int i=0; i < a.length; i++) 
		{
			if(a[i] != -1)
			{
				humanList.add(a[i]);
			} else if(a[i] == -1) 
			{
				indexList.add(i);
			}
		}
	    
	    int[] humanTmp = new int[humanList.size()];
			for(int i=0; i < humanList.size(); i++) 
			{
				humanTmp[i] = humanList.get(i);
			}

	    Arrays.sort(humanTmp);

	    for(int i=0; i < humanTmp.length; i++) {
				resultList.add(humanTmp[i]);
		}

	   	for(int i = 0; i < indexList.size(); i++) {
			resultList.add(indexList.get(i), -1);
		}

	    Integer[] resultArrayInteger = resultList.toArray(new Integer[resultList.size()]);
		int[] resultArrayReturn = new int[resultArrayInteger.length];
		for(int i = 0; i < resultArrayInteger.length; i++) {
			resultArrayReturn[i] = resultArrayInteger[i].intValue(); 
		}
	    
	    return resultArrayReturn;
	}
	public static void main(String []args)
	{
		int a[]=new int[] {-1,150, 190, 170, -1, -1, 160, 180};
 int result[]=sortByHeight(a);
 System.out.println(result);
		
	}
}



