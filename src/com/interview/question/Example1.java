package com.interview.question;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1_Sub obj1=new Example1_Sub();
		Example1_Sub obj2=new Example1_Sub();
		obj1.a=0;
		Example1_Sub.b=0;
		obj1.cal(1, 2);
		obj2.a=0;
		obj2.cal(2, 3);
		System.out.println(obj1.a+" "+Example1_Sub.b);
	}

}
