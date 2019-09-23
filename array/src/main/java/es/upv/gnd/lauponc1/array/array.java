package es.upv.gnd.lauponc1.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class array {
    public static void main(String[] main) {
        ArrayList<Persona> p = new ArrayList<>();
        p.add(new Persona("Laura", 18));
        p.add(new Profesor("Javier", 35, "IOT"));
        p.add(new Alumno("Pepa", 22, 2));
        for(Persona x:p){
            x.mostrar();
        }

        /*
        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("mundo");
        for(String x:lista){
            System.out.println(x);
        }
        for(int i=0; i< lista.size(); i++){
            String n = "<"+lista.get(i)+">";
            lista.set(i,n);
        }
        lista.forEach(System.out::println);
        //Otro modo de hacerlo
        String b[] = { "Hola", "mundo"};

        for(int i=0; i< b.length; i++){
            System.out.println(b[i]);
        }
        System.out.println(lista);
        */
        //aleatorios

        Random r = new Random();

        ArrayList<Double> listaAleatoria = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            //Generar número aleatorio
            listaAleatoria.add(r.nextDouble());
        }
        System.out.println(listaAleatoria);
        Collections.sort(listaAleatoria);
        listaAleatoria.sort((x,y) -> x.compareTo(y));
        System.out.println(listaAleatoria);

    }
}
