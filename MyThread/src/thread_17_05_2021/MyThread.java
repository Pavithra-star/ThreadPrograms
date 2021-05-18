package thread_17_05_2021;

public class MyThread extends Thread {

	public static void main(String[] args) {
//		String name = Thread.currentThread().getName();
//		System.out.println(name);
//		main

		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());
//		main
//		5
//		
		
		
	}
	
	

}
