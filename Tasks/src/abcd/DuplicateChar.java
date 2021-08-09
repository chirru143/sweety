package abcd;

public class DuplicateChar {

	public static void main(String[] args) {
		int a[]= {2,5,2,6,3,3,4,6,8,10};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}

	}

}
