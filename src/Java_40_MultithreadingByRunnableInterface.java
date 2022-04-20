class MyThreadClass implements Runnable{
     public void run() {
		 for (int i = 0; i < 10; i++) {
			 System.out.println("Thread number: " +Thread.currentThread().getId() +": Line: " +i);
		 }
	 }
}
public class Java_40_MultithreadingByRunnableInterface {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThreadClass());
		Thread thread2 = new Thread(new MyThreadClass());

		thread1.start();
		thread2.start();

		for (int i = 0; i < 10; i++)
			System.out.println("Main Thread: Line: " +i);
	}
}
