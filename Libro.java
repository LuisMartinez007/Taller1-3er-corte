package Taller1;

public class Libro {
   String autor;
   String titulo;
   int numeroPaginas;
    
    public Libro(){
    
        this.titulo="Desconocido";
        this.autor="Desconocido";
        this.numeroPaginas=0;
    }

    public Libro(String titulo, String autor, int numeroPaginas ){
       
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }

    public void mostrarDetalles() { 

        System.out.println("Título: " + this.titulo); 
        System.out.println("Autor: " + this.autor); 
        System.out.println("Número de páginas: " + this.numeroPaginas);
     }

     @Override 
     public String toString() {
         return "Libro [Título=" + titulo + ", Autor=" + autor + ", Número de páginas=" + numeroPaginas + "]";
         }
}
