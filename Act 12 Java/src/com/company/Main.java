package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        create crear = new create();
        list listar = new list();
        delete borrar = new delete();
        Scanner input = new Scanner(System.in);
        int Continuar = 1;

        do {
            System.out.println("Agenda telefónica");
            System.out.println("1: Lista de contactos");
            System.out.println("2: Ingresar nuevo contacto");
            System.out.println("3: Borrar contacto");
            int Proceso = input.nextInt();

            try {
                switch (Proceso) {
                    case 1:
                        listar.lista();
                        break;
                    case 2:
                        crear.crear();
                        break;
                    case 3:
                        borrar.eliminar();
                        break;
                    default:
                        System.out.println("Valor no valido");
                }
            } catch (Exception e) {
                System.out.println("Valor no valido");
            } finally {

                System.out.println();
                System.out.println("Desea hacer otro proceso?");
                System.out.println("1 -> Si");
                System.out.println("2 -> No");
                Continuar = input.nextInt();
            }
        }
        while (Continuar == 1) ;
    }
}















