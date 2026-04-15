//Joaquín Devige.
//Legajo: 114638.

package patróntemplatemethodcomportamiento;


public class ReporteVentas extends GeneradorReporte{
    
    @Override
    protected void escribirCuerpo(){
        System.out.println("Producto A: $1500");
        System.out.println("Producto B: $3200");
        System.out.println("Total: $4700");
    }
    
}
