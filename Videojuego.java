package Ejercicio16_videojuego;

public class Videojuego {
    private String nombre;
    private String genero;
    private double horasJugadas;

    public Videojuego(String nombre, String genero, double horasJugadas) {
        if (horasJugadas < 0) {
            throw new IllegalArgumentException("Las horas jugadas no pueden ser negativas.");
        }
        this.nombre = nombre;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }

    public void registrarSesion(double horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas de la sesión deben ser mayores a cero.");
        }
        horasJugadas += horas;
    }

    public boolean esJuegoProlongado() {
        return horasJugadas > 50;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getHorasJugadas() {
        return horasJugadas;
    }
}
