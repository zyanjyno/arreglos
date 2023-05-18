/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg13.pkg3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     En este trabajo, también utilizamos la clase Scanner para obtener el valor de n desde la entrada del usuario.
     * Luego, creamos un vector llamado numeros de tamaño n.
     * Utilizamos un bucle for para recorrer el vector y asignar los números del 1 hasta n a cada elemento del vector.

Después de almacenar los números en el vector, utilizamos otro bucle for para imprimir el contenido del vector. 
* En cada iteración, imprimimos el valor del elemento del vector seguido de un espacio en blanco.

Al ejecutar este programa, te pedirá ingresar el valor de n.

Después de ingresar el valor, mostrará el contenido del vector, 
es decir, los números del 1 hasta n, separados por espacios. Por ejemplo, si ingresas 5, mostrará: 1 2 3 4 5.
* 
* 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Contenido del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    


    }
    
}
