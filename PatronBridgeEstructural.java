//Joaquín Devige.
//Legajo: 114638.
//Patrón: Bridge (Estructural).

package patrónbridgeestructural;


public class PatrónBridgeEstructural {

    public static void main(String[] args) {
        //Combinamos tipos de notificación con medios de envío libremente.
        Notificacion n1 = new NotificacionUrgente(new Email());
        Notificacion n2 = new NotificacionUrgente(new SMS());
        Notificacion n3 = new NotificacionNormal(new Email());

        n1.notificar("El servidor está caído");
        n2.notificar("El servidor está caído");
        n3.notificar("Actualización disponible");
    }
    
}
