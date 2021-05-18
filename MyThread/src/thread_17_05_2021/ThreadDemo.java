package thread_17_05_2021;

public class ThreadDemo extends Thread{
public void run() {
	System.out.println("Current tThread Name : "+Thread.currentThread().getName());
	System.out.println("Current Thread Priority :"+Thread.currentThread().getPriority() );
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadDemo t1 = new ThreadDemo();
ThreadDemo t2 = new ThreadDemo();
t1.setName("First Thread");
t2.setName("Second Thread");
t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();

	}

}
