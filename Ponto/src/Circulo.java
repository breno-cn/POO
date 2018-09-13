import java.util.Scanner;

public class Circulo{
	private double raio;
	private Ponto centro;
	private String nome;
	
	public Circulo(double raio, Ponto p, String nome){
		this.raio = raio;
		centro = new Ponto(p.getX(), p.getY());
		this.nome = nome;
	}
	
	public setCirculo(double raio, Ponto p, String nome){
		this.raio = raio;
		centro.setPonto(p.getX(), p.getY());
		this.nome = nome;
	}
	
	public double getRaio(){
		return raio;
	}
	
	public Ponto getCentro(){
		return centro;
	}
	
	public String getNome(){
		return nome;
	}
	
	public double diametro(){
		return 2*raio;
	}
	
	public double area(){
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double circunferencia(){
		return 2*Math.PI*raio;
	}
	
	static private Circulo leCirculo(){
		Scanner in = new Scanner(System.in);
		System.out.print("Digite as coordenadas do centro: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		System.out.print("Digite o raio do circulo: ");
		double r = in.nextDouble();
		System.out.print("Digite o nome do circulo: ");
		String s = in.next();
		Ponto p = new Ponto(x,y);
		return new Circulo(r, p, s);
	}
	
	public static void main(String agrs[]){
		Circulo cir = leCirculo();
		System.out.println(" Dados do circulo de raio " + cir.getRaio());
		System.out.println(" Diametro\t:\t" + cir.diametro());
		System.out.println(" Circunferencia\t:\t" + cir.circunferencia());
		System.out.println(" Area\t\t:\t" + cir.area());
	}
}
