package hilos2;

public class Cuadrados extends Thread{
	
	public Cuadrados(int arr[]) {
		run(arr);
	}//cuadrados
	
	public void run(int arr[]) {
		int suma = 0;
		for(int i = 0; i <arr.length; i++) {
			suma += Math.pow(arr[i], 2);
		}//for
		System.out.println("La suma de los cuadrados de los valores es: " + suma);
	}//run
}//class
