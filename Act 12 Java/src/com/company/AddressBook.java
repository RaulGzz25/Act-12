package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;

public class AddressBook {

    Scanner scanner = new Scanner(System.in);
    private static final HashMap<String,String> Agenda = new HashMap<>();
    public static HashMap<String,String> inicio(){

        return Agenda;
    }

    public void load(){

    }

    public class save {
        AddressBook guardar= new AddressBook();

        public void archivar() throws IOException{
            HashMap<String, String> Agenda = guardar.inicio();
            int cantidad = 30;

            FileWriter entrada;
            BufferedWriter salida;

            entrada = new FileWriter("Act 12 Java/Agenda.txt");
            salida = new BufferedWriter(entrada);

            int count = 0;

            Iterator<HashMap.Entry<String, String>> it = Agenda.entrySet().iterator();

            while (it.hasNext() && count < cantidad) {

                HashMap.Entry<String, String> pairs = it.next();

                salida.write( pairs.getKey() + "," + pairs.getValue() + "\n");
                count++;
            }
            salida.close();
        }

    }

}
class list {
    AddressBook ListaContactos=new AddressBook();

    public void lista(){
        HashMap <String,String> Agenda = ListaContactos.inicio();
        System.out.println("Lista de contactos: ");
        for(HashMap.Entry <String,String>entry: Agenda.entrySet()){
            System.out.println("Numero: " + entry.getKey()+"- Nombre: " + entry.getValue());}
    }
}

class create {
    String Numero;
    String Nombre;
    AddressBook Crear = new AddressBook();

    public void crear(){
        HashMap <String,String> calendario = Crear.inicio();
        Scanner contacto = new Scanner(System.in);
        System.out.println("Ingresa el número de teléfono");
        Numero = contacto.nextLine();
        System.out.println("Ingresa el nombre del contacto");
        Nombre = contacto.nextLine();
        calendario.put( Numero , Nombre);

    }
}

class delete {
    String Numero;
    AddressBook Borrar = new AddressBook();

    public void eliminar(){
        HashMap<String,String> Agenda = Borrar.inicio();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número del contacto a eliminar");
        Numero = teclado.nextLine();
        if (Agenda.containsKey(Numero)){
            System.out.println("El contacto ha sido eliminado");
            Agenda.remove(Numero);
        }
        else{
            Agenda.remove(Numero);
            System.out.println("No se pudo encontrar el contacto señalado");
        }
    }
}