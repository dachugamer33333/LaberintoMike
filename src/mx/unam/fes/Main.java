package mx.unam.fes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Laberinto laberinto = new Laberinto();
        laberinto.leerArchivo("archivo.csv");
        laberinto.imprimirLaberinto();
    }

}