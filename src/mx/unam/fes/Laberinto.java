package mx.unam.fes;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Laberinto {
    private String[][] m;

    public void imprimirLaberinto()
    {
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void leerArchivo(String ruta) {
        Path direccion = Paths.get(ruta);
        try {
            List<String> lineas = Files.readAllLines(direccion);
            boolean filaCero = true;
            int filas = 0;
            int columnas = 0;
            for (String l : lineas) {
                String[] token = l.split(",");
                if (filaCero) {
                    int f = Integer.parseInt(token[0]);
                    int c = Integer.parseInt(token[1]);
                    m = new String[f][c];
                    filaCero = false;
                } else {
                    for (String celda : token) {
                        m[filas][columnas] = celda;
                        columnas++;
                    }
                    filas++;
                    columnas = 0;
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}