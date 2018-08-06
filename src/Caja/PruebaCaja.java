package Caja;

public class PruebaCaja {
	public static void main(String args[]) {
		int alto=2,ancho=3,profundo=6;
		Caja obj1=new Caja(alto,ancho,profundo);
		System.out.println("el volumen es: "+obj1.volumen() );
	}

}
