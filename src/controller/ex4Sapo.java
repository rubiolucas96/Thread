package controller;

public class ex4Sapo {
	 int posicao = 0;
	    int [] classificacao = new int[5];

	    public ex4Sapo(){

	    }

	    public void iniciaCorrida(){
	        int distanciaMaxima = 500;

	        for (int t = 0; t < 5; t++){
	            int sapo = t + 1;
	            Thread thread = new ThreadSapo(distanciaMaxima,sapo);
	            thread.start();
	        }
	    }

	    public synchronized void chegadaFinal(int sapo){
	        classificacao[posicao] = sapo;
	        System.out.println("O sapo " + sapo + " chegou em " + ( posicao + 1 ) + "º lugar.");
	        posicao++;
	    }

	    class ThreadSapo extends Thread {

	        int puloMaximo;
	        int distanciaMaxima;
	        int distanciaPercorrida;
	        int puloPercorrido;
	        int sapo;

	        public ThreadSapo(int distanciaMaxima, int sapo){
	            this.distanciaMaxima = distanciaMaxima;
	            this.puloMaximo = 100;
	            this.sapo = sapo;
	        }

	        public void run() {
	            while (verificaChegada() == false){
	                salta();
	            }chegadaFinal();
	        }

	        public void salta(){
	            int tamanhoSalto = (int)(Math.random()*puloMaximo);
	            distanciaPercorrida += tamanhoSalto;
	            System.out.println("O sapo " + sapo + " deu um salto de " + tamanhoSalto + " metros e percorreu " + distanciaPercorrida + " metros.");
	        }

	        public boolean verificaChegada(){
	            return distanciaPercorrida >= distanciaMaxima;
	        }

	        public void chegadaFinal(){
	        	ex4Sapo.this.chegadaFinal(sapo);
	        }

	    }}
