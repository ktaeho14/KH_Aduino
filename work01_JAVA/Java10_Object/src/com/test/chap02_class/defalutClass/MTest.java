package com.test.chap02_class.defalutClass;

import com.test.chap02_class.publicClass.PublicClassTest;

public class MTest {

	public static void main(String[] args) {
		DefaultClassTest test = new DefaultClassTest();
		test.test();
		
		
		PublicClassTest test2 = new PublicClassTest();
		test2.test();
	}

}
