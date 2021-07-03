package tp4;

public class ExcecaoDivisaoResultadoZero extends ArithmeticException{
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "O resultado da divisao é zero";
	}
	
}
