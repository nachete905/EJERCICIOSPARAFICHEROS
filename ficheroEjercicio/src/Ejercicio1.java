import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    /*/*Ejercicio 1
    Crea un fichero de texto con el nombre y contenido que tú desees. Por ejemplo, Ejercicio1.txt
    Realiza un programa en Java que lea el fichero <<Ejercicio1.txt>> carácter a carácter y muestre su contenido por pantalla  sin espacios.*/

    public void leerFichero(){
        final String nomFichero = "C:\\quijote.txt";

        try {
            FileReader fichero = new FileReader(nomFichero);

            int valor = fichero.read();
            while (valor != -1){
                if (valor != 32){//el 32 es de la tabla ASCII para comprobar los espacios en blanco
                    System.out.println((char) valor);//con esto, los caracteres en blanco se imprimirán por pantalla
                }
                valor = fichero.read();
            }
        } catch (IOException e) {
            System.out.println("Fichero no existe o la ruta está mal puesta" + e);
        }
    }
}


