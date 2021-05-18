package thread_17_05_2021;

public class TestThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		TestThread tt = new TestThread();
		tt.setPriority(10);
		tt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
