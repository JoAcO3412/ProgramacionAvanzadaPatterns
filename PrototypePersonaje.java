//Joaquín Devige.
//Legajo: 114638.

package patronprototypecreacional;

class Personaje implements Cloneable{
    
    private String nombre;
    private String clase;
    private int vida;
    private int ataque;

    public Personaje(String nombre, String clase, int vida, int ataque){
        
        this.nombre = nombre;
        this.clase  = clase;
        this.vida   = vida;
        this.ataque = ataque;
    }

    //Se Clona el objeto actual.
    @Override
    public Personaje clone(){
        try{
            return (Personaje) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("No se pudo clonar", e);
        }
    }

    public void setNombre(String nombre){
    this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "[" + clase + "] " + nombre + " | HP: " + vida + " | ATK: " + ataque;
    }
}
