//Joaquín Devige.
//Legajo: 114638.

package patróntemplatemethodcomportamiento;


public class ReporteErrores extends GeneradorReporte{
    
    @Override
    protected void escribirCuerpo(){
        System.out.println("[ERROR] NullPointerException en línea 42");
        System.out.println("[WARN]  Memoria al 85%");
    }
    
}
