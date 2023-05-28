import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    private Ejercicio4 RutaDeArchivo;
    /*Ejercicio 4
    Realiza un programa en Java donde introduzcas la ruta de un fichero a través del paso de parámetros de Eclipse y te indique si el fichero existe o de lo contrario no existe.

    Si faltan argumentos en el main() se debe mostrar un mensaje indicándolo.

    Posteriormente mostrar el número de palabras del fichero.*/

    //metodo boolean para comprobar
    public boolean existe(File ruta){
        return ruta.exists();
    }

    public void rutaPorParametro(String ruta){

        try {
            FileReader fich = new FileReader(ruta);
            if (existe(new File(ruta))){
                System.out.println("El fichero existe");
            }else {
                System.out.println("El fichero no existe");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean validarRuta(String ruta) {
        File directorio = new File(ruta);
        return directorio.isDirectory();
    }

    public void validar2(String ruta1){


        if (RutaDeArchivo.validarRuta(ruta1)) {
            System.out.println(ruta1 + " es una ruta de directorio válida.");
        } else {
            System.out.println(ruta1 + " NO es una ruta de directorio válida.");
        }



    }

}
