package hilos2;

public class Suma extends Thread{
	
	static int arr1[];
	public Suma(int arr[]) {
		arr1= arr;
	}//suma
	
	public void run() {
		int suma = 0;
		for(int i = 0; i <arr1.length; i++) {
			suma += arr1[i];
		}//for
		System.out.println("La suma de los valores es: " + suma);
	}//run
}//class
