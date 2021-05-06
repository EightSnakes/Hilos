package hilos2;

public class Media extends Thread{
	
	static int arr1[];
	public Media(int arr[]) {
		arr1= arr;
	}//media
	public void run() {
		float suma = 0;
		for(int i = 0; i <arr1.length; i++) {
			suma += arr1[i];
		}//for
		suma = suma/arr1.length;
		System.out.println("La media de los valores es: " + suma);
	}//run
	
}//class
