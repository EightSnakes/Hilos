package hilos2;

public class Suma extends Thread{
	public Suma(int arr[]) {
		run(arr);
	}//suma
	
	public void run(int arr[]) {
		int suma = 0;
		for(int i = 0; i <arr.length; i++) {
			suma += arr[i];
		}//for
		System.out.println("La suma de los valores es: " + suma);
	}//run
}//class
