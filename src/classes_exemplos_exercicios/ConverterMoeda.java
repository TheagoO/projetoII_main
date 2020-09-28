package classes_exemplos_exercicios;

public class ConverterMoeda {
		
	public double cota;
	public double dolar;
	public double reais = 0.0;
	
	public double cotacao() {
		reais = (cota*dolar)*1.06;		
		
		return reais;
	}
		
}
