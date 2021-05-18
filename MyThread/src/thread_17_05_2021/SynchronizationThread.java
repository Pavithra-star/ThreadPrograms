package thread_17_05_2021;

class Test1 extends Thread {
	static synchronized void dipMessage(String msg) {
		// System.out.println(name);
		try {
			System.out.println(msg);
			Thread.sleep(4000);
			System.out.println(msg);
			Thread.sleep(4000);

		} catch (InterruptedException e) {

			System.out.println(e);
		}
	}
}

class Task11 extends Thread {
	public void run() {
		Test1.dipMessage("First Task");
	}
}

class Task22 extends Thread {
	public void run() {
		Test1.dipMessage("second Task");
	}
}
class Task33 extends Thread {
	public void run() {
		Test1.dipMessage("Third Task");
	}
}

public class SynchronizationThread extends Thread {

	public static void main(String[] args) {
		Task11 t1 = new Task11();
		t1.start();
		Task22 t2 = new Task22();
		t2.start();
		Task33 t3 = new Task33();
		t3.start();

	}

}
