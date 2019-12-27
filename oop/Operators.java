package oop;

public class Operators {

	public static void main(String[] args) {
		int i=12,j=19;
		boolean b=(i>j)&&(j++>i);
		System.out.println(i);
		b=(i>j)&(j++>i);
		System.out.println(j);
	}

}
