package abcd;

public class MethodOverLoading {
	public void ab(int a) {
		System.out.println(a);
	}
	public void bc(String s) {
		System.out.println(s);
	}
	void ca(int b,String c) {
	System.out.println(b+" "+c);
}
	public static void main(String[] args) {
		MethodOverLoading v=new MethodOverLoading();
		v.bc("pinky");;
		v.ab(2);
		v.ca(12, "Raghu");

	}

}
