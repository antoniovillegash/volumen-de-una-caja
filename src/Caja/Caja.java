package Caja;

public class Caja {
	int ancho,alto,profundo;
	
	Caja(){}
	
	Caja(int a, int b, int c){
			this.ancho=a;
			this.alto=b;
			this.profundo=c;
	}
	int volumen(){
		return alto*ancho*profundo;
	}
}
