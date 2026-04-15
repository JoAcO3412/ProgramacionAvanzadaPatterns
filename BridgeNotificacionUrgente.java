//Joaquín Devige.
//Legajo: 114638.
//Patrón: Bridge (Estructural).

package patrónbridgeestructural;


public class NotificacionUrgente extends Notificacion{
    
     public NotificacionUrgente(MedioEnvio medio){
        super(medio);
    }

    @Override
    public void notificar(String contenido){
        medio.enviar(" URGENTE: " + contenido);
    }
}
