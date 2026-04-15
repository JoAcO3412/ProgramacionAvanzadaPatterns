//Joaquín Devige.
//Legajo: 114638.

package patróntemplatemethodcomportamiento;


public class PatrónTemplateMethodComportamiento {

    
    public static void main(String[] args) {
        
        GeneradorReporte r1 = new ReporteVentas();
        r1.generar();

        GeneradorReporte r2 = new ReporteErrores();
        r2.generar();
        
    }
    
}
