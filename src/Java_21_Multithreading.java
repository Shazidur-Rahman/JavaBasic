

class ThreadClass extends  Thread{
	@Override
	public void run() {
		for (int i =0; 1<10; i++){
			System.out.println("The thread class number: linr: "+i);

			try{
				Thread.sleep(100);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Java_21_Multithreading {
	public static void main(String[] args) {
		ThreadClass tc1 = new ThreadClass();
		tc1.start();

		for (int i=0;i<10;i++){
			System.out.println("Main thread: Line: "+i);
		}

	}
}
