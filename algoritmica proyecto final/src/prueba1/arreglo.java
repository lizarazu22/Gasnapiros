package prueba1;

public class arreglo {

	public static void main(String[] args) {
		int[] miarreglo = new int[80000000];
		for (int i = 60000000; i < miarreglo.length; i++) {
			if (miarreglo[i] == miarreglo.length) {
				break;
			} else {
				miarreglo[i] = i;
			}
		/*String[] arreglo = new String [79999999];
		for(int i =60000000 ;i==arreglo.length;i++) {
		 arreglo[i]= "i";
		 System.out.println(arreglo[i]);
		}*/

	}

}
}
