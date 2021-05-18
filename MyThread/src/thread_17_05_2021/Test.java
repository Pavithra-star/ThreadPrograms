package thread_17_05_2021;

class Reserve implements Runnable {

	int available = 1;
	int wanted;

	public Reserve(int i) {
		wanted = i;
	}

	public void run() {
		bookSeat();
	}

	public synchronized void bookSeat() {
		System.out.println("Available Breaths=" + available);
		if (available >= wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted + "Berths Reserved For " + name);
			try {
				Thread.sleep(1500);
				available = available - wanted;
			} catch (InterruptedException e) {

			}
		} else
			System.out.println("Sorry , no breaths");

	}
}

public class Test {

	public static void main(String[] args) {
		Reserve obj = new Reserve(1);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("First Person");
		t2.setName("Second Person");
		t1.start();
		t2.start();

	}

}
