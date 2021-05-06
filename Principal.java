package hilos2;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int arreglo[], tam; 
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        tam = leer.nextInt();
        arreglo = new int[tam];
        
        for(int i = 0; i<tam; i++) {
        	arreglo[i] = (int)Math.round(Math.random()*10) ;
        }
        
        System.out.println("----Numeros en el arreglo----");
        for(int i = 0; i<tam; i++) {
        	System.out.println(arreglo[i]);
        }
        System.out.println("----Operaciones----");
        Suma hilo1 = new Suma(arreglo);
        Cuadrados hilo2 = new Cuadrados(arreglo);
        Media hilo3 = new Media(arreglo);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
        leer.close();
	}//main
	
}
