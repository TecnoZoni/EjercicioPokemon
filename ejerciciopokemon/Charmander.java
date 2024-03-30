package ejerciciopokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    public Charmander(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmader y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Charmader y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Charmader y estoy atacando con Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmader y estoy atacando con Punio Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmader y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmader y estoy atacando con Lanzallamas");
    }

}
