package hilos2;

public class Cuadrados extends Thread{
	
	static int arr1[];
	public Cuadrados(int arr[]) {
		arr1= arr;
	}//cuadrados
	
	public void run() {
		int suma = 0;
		for(int i = 0; i <arr1.length; i++) {
			suma += Math.pow(arr1[i], 2);
		}//for
		System.out.println("La suma de los cuadrados de los valores es: " + suma);
	}//run
}//class
