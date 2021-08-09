package abcd;

import java.util.Arrays;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] a=new int[] {1,5,4,96,85,6,89};
  Arrays.sort(a);
  int size=a.length;
  for(int i=0;i<a.length;i++) {
	  System.out.println(a[size-2]);
	  break;
  }
	}

}
