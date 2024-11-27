package Taller1;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() { 
    this("Nombre Desconocido", 0);
    this.curso = "Curso Desconocido"; 
    }

    public Estudiante(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.curso="Matematicas";
        
    }

    public Estudiante(String nombre,int edad,String curso){
        this(nombre,edad);
        this.curso=curso;
    }

    @Override 
    public String toString() {
     return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + "]";
    }
}
