package abcd;

public class SecondLargeNum {

	public static void main(String[] args) {
	int a[]= {12,21,22,25,56,79,76,102};
	int large=a[0];
	int secondLarge=a[0];
	
	for (int i = 0; i < a.length; i++) {
	      System.out.print(a[i]+"\t");
	}
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>large) {
			secondLarge=large;
			large=a[i];
		}
	}
	System.out.println("\nSecond largest number is:" + secondLarge);
}
}