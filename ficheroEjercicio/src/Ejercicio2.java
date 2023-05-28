import javax.swing.*;
import java.io.*;

public class Ejercicio2 {
    /*Ejercicio 2
Realiza un programa en Java donde introduzcas la ruta de un fichero por teclado y un texto que queramos a escribir en el fichero con JOptionPane.showInputDialog

Posteriormente, muestra el contenido del fichero.*/

    public void ruta(){
        String ruta = JOptionPane.showInputDialog("Escriba la ruta");
        String texto = JOptionPane.showInputDialog("Escriba el texto que desee");

        try {
            FileReader leerFich = new FileReader(ruta);
            int valor = leerFich.read();
            while (valor != -1){// si el valor es distinto de -1, entonces lee el fichero
                valor = leerFich.read();
            }


        } catch (IOException e){
            System.out.println("Nombre de fichero no encontrado o mal introducido" + e.getMessage());
        }

        try {
            FileWriter leerTexto = new FileWriter(texto);
            leerTexto.write(texto);
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero" +e.getMessage());
        }

    }
}

