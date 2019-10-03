package com;

public class PPT {
	public static void main(String [] args){
		int a = add(1);
		int b = add(1,2);
		System.out.println(a);
		System.out.println(b);
		String c = str("");
		//String d = str("","");
		System.out.println(c);
	}

	public static String str(String ...is) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String str( String is , int ...a ) {
		// TODO Auto-generated method stub
		return "";
	}

	public static int add(int ...is) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(Integer i:is)
			sum = sum + i;
		return sum;
	}
}
