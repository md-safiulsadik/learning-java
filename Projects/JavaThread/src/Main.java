import javax.swing.plaf.TableHeaderUI;

public class Main {

    public static void main(String[] args) throws Exception {
        MyThread th = new MyThread();
        // MyRunnable r = new MyRunnable();
        Thread rt = new Thread(new MyRunnable());

        th.start();
        th.join();
        rt.start();
    }
}

	// 1st methord for thread
class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread is running!");
		}
	}
}


class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnable Thread id running!");
		}
	}
}
