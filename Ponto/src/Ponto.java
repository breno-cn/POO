import java.util.Scanner;

public class Ponto{
	private double x;
	private double y;
	
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
		
	public void setPonto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double distancia(double x, double y){
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	
	public double distancia(Ponto p){
		return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
	}
	
	static private Ponto lePonto(){
		Scanner in = new Scanner(System.in);
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		return new Ponto(x1,y1);
	}
	
//	public static void main(String args[]){
//		System.out.print("Digite uma coordenada: ");
//		Ponto p = lePonto();
//		System.out.print("Digite outra coordenada: ");
//		Ponto p2 = lePonto();
//		System.out.println("Distancia entre os dois pontos = " + p.distancia(p2));
//	}
}
