//Joaquín Devige.
//Legajo: 114638.

package patróntemplatemethodcomportamiento;


public abstract class GeneradorReporte {
    //El Template Method: define el orden de los pasos (es final: no se sobreescribe).
    public final void generar(){
        abrirArchivo();
        escribirEncabezado();
        escribirCuerpo();              //Cada subclase lo implementa a su forma.
        escribirPie();
        cerrarArchivo();
    }

    private void abrirArchivo(){ 
    System.out.println("Abriendo archivo..."); 
    }
    private void cerrarArchivo(){  
    System.out.println("Cerrando archivo.\n"); 
    }

    protected void escribirEncabezado(){
        System.out.println("=== REPORTE ===");
    }
    protected void escribirPie(){
        System.out.println("=== FIN ===");
    }

    //Paso variable: cada subclase define su propio contenido.
    protected abstract void escribirCuerpo();
}

