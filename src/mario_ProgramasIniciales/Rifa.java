/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario_ProgramasIniciales;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Rifa {

    String nombre;
    int carton[] = new int[5];
    int cartonGanador[] = new int[5];

    ArrayList<Rifa> baseDatos = new ArrayList<Rifa>();

    public Rifa() {
    }

    public Rifa(String nombre) {
        this.nombre = nombre;
        for (int i = 0; i < carton.length; i++) {
            carton[i] = (int) (Math.random() * 100 + 1);
        }
    }

    public void IniciarRifa() {
        int opcionRifa;
        Scanner ScannerInt = new Scanner(System.in);

        do {
            System.out.println(
                    "\nPulsa:\n\t1. Añadir Jugador."
                    + "\n\t2. Empezar Rifa.");
            System.out.printf("Escribe un número del menú: ");
            opcionRifa = ScannerInt.nextInt();
            switch (opcionRifa) {
                case 1:
                    AñadirJugador();

                    System.out.println("Nombre: " + baseDatos.get(0).nombre);
                    for (int i = 0; i < baseDatos.get(0).carton.length; i++) {
                        System.out.print(baseDatos.get(0).carton[i] + " ");
                    }

                    break;
                case 2:
                    GenerarPremiados();
                    ContarAciertos();
                    RepartirPremio();
                    break;
                default:
                    System.out.println("Opcion icorrecta, lea atentamente.");
                    break;
            }
        } while (opcionRifa != 2);
    }

    public void AñadirJugador() {
        Scanner ScannerString = new Scanner(System.in);

        System.out.println("\nComo te llamas?");
        String nombreAuxiliar = ScannerString.nextLine();

        //        Rifa jugador = new Rifa(nombreAuxiliar);
        baseDatos.add(new Rifa(nombreAuxiliar));
    }

    public void GenerarPremiados() {
        for (int i = 0; i < cartonGanador.length; i++) {
            cartonGanador[i] = (int) (Math.random() * 100 + 1);
        }
    }

    public void ContarAciertos() {
        int cont = 0;
        for (int i = 0; i < baseDatos.size(); i++) {
            for (int j = 0; j < cartonGanador[j]; j++) {
                for (int k = 0; k < baseDatos.get(k).carton[k]; k++) {
                    cont++;
                }
            }
        }
    }

    public void RepartirPremio() {

    }

}
