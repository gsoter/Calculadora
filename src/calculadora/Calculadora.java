package calculadora;

public class Calculadora implements ICalculadora {

	@Override
	public int somar(String num1, String num2) {
		int iNum1 = Integer.parseInt(num1);
		int iNum2 = Integer.parseInt(num2);
		return iNum1 + iNum2;
	}

	@Override
	public double dividir(String num1, String num2) {
		return Integer.parseInt(num1) / Integer.parseInt(num2);
	}

	@Override
	public double raizQuadrada(String num1) {
		Double result = null;
		try {
			if(!num1.equals(null))
			result = Math.sqrt(Double.parseDouble(num1));
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}

}
