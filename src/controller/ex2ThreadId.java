package controller;

public class ex2ThreadId extends Thread {
	private int idThread;
	
	public ex2ThreadId(int idThread) {
		this.idThread = idThread;
	}
	
	public void run() {
		System.out.println(idThread);
	}
}
