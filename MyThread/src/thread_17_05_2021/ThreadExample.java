package thread_17_05_2021;


class Task1 extends Thread {
	public void run() {
		System.out.println("Phani task");
		System.out.println(Thread.currentThread().isAlive());
	}
}
class Task2 extends Thread {
	public void run() {
		System.out.println("Jyothi task");
	}
}
class Task3 extends Thread {
	public void run() {
		 System.out.println("Third task u have to do");
	}
}

public class ThreadExample extends Thread { 
	public void run() {
		 System.out.println("Total task we have to complete by the end of the day");
	}

	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();
		ThreadExample te =new  ThreadExample();
		t3.start();
		te.start();
		t1.start();
		t2.start();

}
}
