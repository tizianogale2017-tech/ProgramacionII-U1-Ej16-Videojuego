package Ejercicio16_videojuego;

public class Main {
    public static void main(String[] args) {
        Videojuego zelda = new Videojuego("Zelda: Breath of the Wild", "Aventura", 48.0);
        Videojuego fifa = new Videojuego("FIFA 24", "Deportes", 10.5);

        zelda.registrarSesion(4.5);
        fifa.registrarSesion(2.0);

        Videojuego[] juegos = {zelda, fifa};
        for (Videojuego juego : juegos) {
            String estado = juego.esJuegoProlongado() ? "es un juego prolongado" : "no es un juego prolongado";
            System.out.println(juego.getNombre() + " (" + juego.getGenero() + "): "
                    + juego.getHorasJugadas() + " h -> " + estado);
        }
    }
}
