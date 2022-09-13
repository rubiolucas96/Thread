package controller;
public class ThreadVetor extends Thread{
	private int opcao;
	private int [] vetor;
	
	public ThreadVetor(int opcao, int vetor[]) {
		this.opcao = opcao;
		this.vetor = vetor;
	}
	
	public void run() {
		double tempoinicial = System.nanoTime();
		if (opcao==1) {
			for (int i = 0; i<vetor.length;i++) {
				
			}
		}
		else {
			for (int i : vetor){
				
			}
		}
		double tempofinal = System.nanoTime();
		double tempototal = tempofinal - tempoinicial;
		tempototal = tempototal / Math.pow(10, 9);
		System.out.println("Opcão "+opcao+" Tempo = "+tempototal);
	}
}
