package com.shreyans.java8;

public interface MyData {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		if (str == null) {
			return true;
		} else {
			if ("".equals(str)) {
				return true;
			} else {
				return false;
			}
		}

	}
}
