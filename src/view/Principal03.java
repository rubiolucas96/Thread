package view;
import controller.ex3Matriz;
public class Principal03 {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Thread t = new ex3Matriz(i);
			t.start();
		}
		
	}
}
