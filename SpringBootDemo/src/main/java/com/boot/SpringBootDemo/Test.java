package com.boot.SpringBootDemo;

public class Test {
 public void displayData() {
	 for (int i = 0; i < 10; i++) {
		System.out.println("Data:"+(i+1));
	}
	 System.out.println("method call over in master");
	 System.out.println("method execution completed");
	 System.out.println("End of the method");

 }
}
