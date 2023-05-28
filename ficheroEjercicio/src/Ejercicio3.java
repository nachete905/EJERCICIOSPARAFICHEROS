import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    /*
    Ejercicio 3
Realiza un programa en Java donde introduzcas la ruta de un fichero a través del paso de parámetros de Eclipse y te indique si el fichero existe o de lo contrario no existe.
Si faltan argumentos en el main() se debe mostrar un mensaje indicándolo. Posteriormente mostrar el número de caracteres del fichero.
     */
    private boolean existe(File ruta) {//con este método comprobamos que la ruta existe
        return ruta.exists();
    }

    public void rutaPorParametro(String ruta) {


        try {
            FileReader fich v= new FileReader(ruta);


            if (existe(new File(ruta))) {
                System.out.println("Fichero existe");
            } else {
                System.out.println("Fichero no existe");
            }


        } catch (IOException e) {
            System.out.println("ruta mal introducida" + e.getMessage());
        }


    }

    public int contarCaracteres(FileReader fich) throws IOException{
        int charc = 0;
        while ((fich.read()) != -1 )
            charc ++;//con esto se lee caracter a caracter
        return  charc;
    }


}
