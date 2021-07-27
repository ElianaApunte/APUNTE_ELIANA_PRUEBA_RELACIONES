
package Dominio;

public class Universidad {
    public Facultad tad [];
    
    public Universidad(){
        tad = new Facultad [3];
        tad[0] = new Facultad ("Faculdad de Economia");
        tad[1] = new Facultad ("Faculdad de Ingenieria");
        tad[2] = new Facultad ("Faculdad de Ciencias Sociales");
    }
}
