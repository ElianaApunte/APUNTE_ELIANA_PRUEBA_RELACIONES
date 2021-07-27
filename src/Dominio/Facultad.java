
package Dominio;

public class Facultad {
    private String facu;
    public Director nomdic []; 

    public Facultad(String facu) {
        this.facu = facu;
    }
    
    public Facultad (){
        nomdic = new Director [1];
        nomdic[0] = new Director("Juan Ramirez");
    }
}
