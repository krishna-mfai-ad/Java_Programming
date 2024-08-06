package practices;

import java.util.Arrays;
public class Endzeros {

	public static void main(String[] args) {
		int[] arr= {1,2,0,0,3,4,6,0,9,7};
		int nz=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[nz]=arr[i];
				nz++;
			}
		}
		

	for(int i=nz;i<arr.length;i++)
	{
		arr[i]=0;
		
	}
	System.out.println(Arrays.toString(arr));

}
}
