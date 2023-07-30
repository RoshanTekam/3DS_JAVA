package com.ds.threadTesting;

import java.lang.*;

public class RunnableInterfaceTest {
	public static void main(String[] args) {

		Person person=new Student(3,"Hare");
//		person.run();
		Student personObj = new Student(1, "Krishna");
		Student personObj1 = new Student(2, "Rama");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		personObj1.startStudent();
		personObj.startStudent();
		personObj.joinStudent();
		personObj1.joinStudent();
		System.out.println("______End of the thread_____");
	}
}

class Person implements Runnable {
	public void run()
	{
		System.out.println("This is person class ....");
	}

}

class Student extends Person {
	private int id;
	private String name;
	private final Thread t;
//	private String rollNo;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.t = new Thread(this);
	}

	public synchronized void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + id + " " + name + " ");
			
		}
	}

	public void startStudent() {
		t.start();
	}

	public void joinStudent() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
