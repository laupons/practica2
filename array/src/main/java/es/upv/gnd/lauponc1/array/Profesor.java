package es.upv.gnd.lauponc1.array;

public class Profesor extends Persona {
    String asignatura;
    public Profesor(String nombre, int edad, String asignatura){
        super(nombre, edad);
        this.asignatura = asignatura;
    }
    public void mostrar(){
        System.out.println("Me llamo " + nombre + " y soy profesor de " + asignatura + ".");
    }
}
