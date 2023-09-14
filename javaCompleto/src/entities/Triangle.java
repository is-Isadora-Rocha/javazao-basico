package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	/*Delegação de responsabilidade: 
	como calcular a área do triangulo é próprio triângulo.*/
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
