package prueba1;
import java.util.Scanner;
public class prueba2 {

	public static int main( int[] arreglo , int busqueda, int inicio , int fin) {
		Scanner teclado = new Scanner(System.in);
		String[] miarreglo = new String [79999999];
		for(int i =60000000 ;i==miarreglo.length;i++) {
		 miarreglo[i]= "i";
		}
		System.out.println("introdusca el numero");
		int telefono =teclado.nextInt();
		if (inicio > fin) {
			return -1;
		}
		int indiceDelElementoMid = (int) Math.floor((inicio + fin) / 2);
		int elementoMid = arreglo[indiceDelElementoMid];
		if(elementoMid == busqueda) {
		return indiceDelElementoMid;
		}
		if (busqueda < indiceDelElementoMid ) {
			fin = indiceDelElementoMid - 1;
			return main(arreglo, busqueda , inicio, fin );
		}else {
			inicio = indiceDelElementoMid + 1;
			return main(arreglo, busqueda , inicio, fin );
		}
	}

}
/*int[] numeros = {12,45,67,27,89,84,65,21,44};
int numberToSearch = 44;
if (Arrays.binarySearch(numeros, numberToSearch)>0)
System.out.println("El número " + numberToSearch + " está en el Array");
else 
System.out.println("El número " + numberToSearch + " NO está en el Array");*/