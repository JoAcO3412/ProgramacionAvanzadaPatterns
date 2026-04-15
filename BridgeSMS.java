//Joaquín Devige.
//Legajo: 114638.
//Patrón: Bridge (Estructural).

package patrónbridgeestructural;


public class SMS implements MedioEnvio{
    
    @Override
    public void enviar(String mensaje){
        System.out.println(" SMS: " + mensaje);
    }
}
