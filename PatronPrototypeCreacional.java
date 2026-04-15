//Joaquín Devige.
//Legajo: 114638.
//Patrón: Prototype (Creacional).


package patronprototypecreacional;


public class PatronPrototypeCreacional {

    
    public static void main(String[] args) {
        //Creamos el "molde" base del guerrero.
        Personaje guerreroBase = new Personaje("Guerrero", "Tank", 200, 50);

        //Clonamos en vez de crear objetos nuevos desde cero.
        Personaje jugador1 = guerreroBase.clone();
        jugador1.setNombre("Arthas");

        Personaje jugador2 = guerreroBase.clone();
        jugador2.setNombre("Garen");

        System.out.println("Original: " + guerreroBase);
        System.out.println("Clon 1: " + jugador1);
        System.out.println("Clon 2: " + jugador2);
    }    
}
