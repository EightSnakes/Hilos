package hilos2;

public class Media extends Thread{
	
	public Media(int arr[]) {
		run(arr);
	}//media
	public void run(int arr[]) {
		float suma = 0;
		for(int i = 0; i <arr.length; i++) {
			suma += arr[i];
		}//for
		suma = suma/arr.length;
		System.out.println("La media de los valores es: " + suma);
	}//run
	
}//class
