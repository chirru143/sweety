package abcd;

public class ArrayMinNum {

	public static void main(String[] args) {
	int a[]={10,21,22,25,23,28};
		
		int max= a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<max)
				max=a[i];

		}
		System.out.println(max);

	}

}
