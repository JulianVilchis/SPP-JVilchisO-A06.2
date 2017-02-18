
package spp.jvilchiso.a06.pkg2;
import java.util.Scanner;
/**
 *
 * @author Julian
 */
public class SPPJVilchisOA062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    solicitarDato();
    
    }
    
    public static void solicitarDato(){
        int numero, suma;
        suma = 0;
        do {
            System.out.println("Introduce un numero:");
            Scanner entradaDato = new Scanner(System.in);
            numero = entradaDato.nextInt();
            if (numero < 0){
                System.out.println("La suma total de los numero positivos ingresados es: " + suma);
             System.exit(0);
            } else {
            suma = suma + numero;
            }
        } while (numero >= 0);
        System.out.println("La suma total de los numeros positivos es : " + suma);
        }
    
}