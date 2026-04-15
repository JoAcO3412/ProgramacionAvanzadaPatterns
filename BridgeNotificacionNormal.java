//Joaquín Devige.
//Legajo: 114638.
//Patrón: Bridge (Estructural).

package patrónbridgeestructural;


public class NotificacionNormal extends Notificacion{
    
    public NotificacionNormal(MedioEnvio medio){
        super(medio);
    }

    @Override
    public void notificar(String contenido){
        medio.enviar(" Info: " + contenido);
    }
    
}
