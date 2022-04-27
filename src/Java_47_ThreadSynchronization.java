class Transfer{
	public void sendMessage(String message){
		System.out.println(message + " is sending...");
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(message + " is sent...");
	}
}

class MessageTransfer extends Thread{
	private String message;
	Transfer msgTransfer;
	public  MessageTransfer(String msg, Transfer trans){
		message = msg;
		msgTransfer = trans;
	}

	@Override
	public void run() {
		synchronized (msgTransfer){
			msgTransfer.sendMessage(message);
		}
	}
}

public class Java_47_ThreadSynchronization {
	public static void main(String[] args) {
		Transfer trns = new Transfer();
		MessageTransfer msg1 = new MessageTransfer("Hello", trns);
		MessageTransfer msg2 = new MessageTransfer("World", trns);
		MessageTransfer msg3 = new MessageTransfer("Java", trns);

		msg1.start();
		msg2.start();
		msg3.start();
	}
}
