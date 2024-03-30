package ejerciciopokemon;

public class EjercicioPokemon {

    public static void main(String[] args) {

        Charmander charmander = new Charmander(1, "Charmander", 4.5, "Masculino", 1, "Fuego");
        Squirtle squirtle = new Squirtle(2, "Squirtle", 7.5, "Masculino", 1, "Agua");
        Bulbasaur bulbasaur = new Bulbasaur(3, "Bulbasur", 3, "Femenino", 1, "Planta");
        Pikachu pikachu = new Pikachu(4, "Pikachu", 3.5, "Femenino", 1, "Electrico");

        System.out.println("Ataques de Charmander: ");
        charmander.atacarArañazo();
        charmander.atacarLanzallamas();
        System.out.println("==============");
        System.out.println("Ataques de Squirtle: ");
        squirtle.atacarMordisco();
        squirtle.atacarBurbuja();
        System.out.println("==============");
        System.out.println("Ataques de Bulbasur: ");
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarHojaAfilada();
        System.out.println("==============");
        System.out.println("Ataques de Pikachu: ");
        pikachu.atacarMordisco();
        pikachu.atacarImpactrueno();
    }

}
