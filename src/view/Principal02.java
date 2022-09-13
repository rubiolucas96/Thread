package view;
import controller.ex2ThreadId;
public class Principal02 {
	public static void main(String[] args) {

		for (int idThread = 0; idThread < 5; idThread++) {
		Thread threadId = new ex2ThreadId(idThread);
		threadId.start();
		}		
	}
}
