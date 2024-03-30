package ejerciciopokemon;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }
    
    public Squirtle(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }


    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy atacando con Hidro Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
    }

}
