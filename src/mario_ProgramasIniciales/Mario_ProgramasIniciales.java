/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario_ProgramasIniciales;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Mario_ProgramasIniciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ScannerInt = new Scanner(System.in);
        Scanner ScannerString = new Scanner(System.in);

        Rifa rifa = new Rifa("Mario");
//        System.out.println("Nombre: " + rifa.nombre);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(rifa.carton[i] + " ");
//        }

        int opcion;

        do {
            System.out.println(
                    "Pulsa:\n\t1. Juego de Rifa."
                    + "\n\t2. Juego de Aventura."
                    + "\n\t0. Salir.");
            System.out.printf("Escribe un número del menú: ");
            opcion = ScannerInt.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Has escogido la opción 0");
                    System.exit(opcion);
                    break;
                case 1:
                    rifa.IniciarRifa();
                    break;
                case 2:
                    System.out.println("Has escogido la opción 2");
                    break;
                default:
                    System.out.println("Opcion icorrecta, lea atentamente.");
                    break;
            }
        } while (opcion != 0);
    }
}
