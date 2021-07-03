package tp4;

public class Grupo {
	private int[] ArrayA = new int [10];
	private int[] ArrayB = new int [10];
	
	
	public int[] getArrayA() {
		return ArrayA;
	}
	public void setArrayA(int[] arrayA) {
		this.ArrayA = arrayA;
	}
	public int[] getArrayB() {
		return ArrayB;
	}
	public void setArrayB(int[] arrayB) {
		this.ArrayB = arrayB;
	}
	public void setArrayANaPosicao(int valor, int posicao) {
		if(posicao < 0) {
			System.out.println("A posição está fora do Array! Menor que 0");
			return;
		}else if(posicao > 9) {
			System.out.println("A posição está fora do Array! Maior que 9");
			return;
		}
		this.ArrayA[posicao] = valor;
		
	}
	public int getArrayANaPosicao(int posicao) {
		return ArrayA[posicao];
	}
	public int getArrayBNaPosicao(int posicao) {
		return ArrayB[posicao];
	}	
	public void setArrayBNaPosicao(int valor, int posicao) {
		if(posicao < 0) {
			System.out.println("A posição está fora do Array! Menor que 0");
			return;
		}else if(posicao > 9) {
			System.out.println("A posição está fora do Array! Maior que 9");
			return;
		}
		this.ArrayB[posicao] = valor;
	}
	public void calcula(int a, int b) {
		if(a == 0) throw new ExcecaoDivisaoResultadoZero(); //Exceção com mensagem personalizada foi criada e
		try {                                               //resultado da divisao é zero
			System.out.println(a+"/"+b+"="+(a/b));
		} catch (ArithmeticException e) {
			System.out.println("Não pode dividir por zero");
		} finally {
		    System.out.println("É o resultado da calculo");
			
		}
	}
	 public void calculaDivisaoArrays() {
		int i;
		for (i = 0; i < 9; i++) {
			calcula(ArrayA[i], ArrayB[i]);
		}		
		}
	}
	

