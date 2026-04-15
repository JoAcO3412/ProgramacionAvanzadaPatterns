//Joaquín Devige.
//Legajo: 114638.
//Patrón: Bridge (Estructural).

package patrónbridgeestructural;


public abstract class Notificacion {
    
     protected MedioEnvio medio;

    public Notificacion(MedioEnvio medio){
        this.medio = medio;
    }

    public abstract void notificar(String contenido);
    
}
