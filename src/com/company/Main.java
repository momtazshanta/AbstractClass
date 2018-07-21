package com.company;

public class Main {

    public static void main(String[] args) {
	Rattre rattre=new Rattre();

		Human onu=new Human() {
			@Override
			void work() {
				System.out.println("clean");
			}
		};

		rattre.sleep();
		rattre.work();

		onu.sleep();
		onu.work();



    }
}
