package thread_17_05_2021;

public class JoinThread extends Thread {
	public void run() {
		for (int i = 0; i < 10 ; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	} 

	public static void main(String[] args) {
		JoinThread jt1 = new JoinThread();
		jt1.setName("first name");
		JoinThread jt2 = new JoinThread();
		jt2.setName("second Name");
		JoinThread jt3 = new JoinThread();
		jt3.setName("Third name");
		jt1.start();
		try {
			jt1.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		jt2.start();
		jt3.start();
		

	}

}
