/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivoobjetos;

import escritura.escribirArchivo;
import lectura.lecturaArchivo;

/**
 *
 * @author HP
 */
public class ArchivoObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       escribirArchivo eA= new escribirArchivo();
       lecturaArchivo lA= new lecturaArchivo();
eA.escribir();
    lA.leer();
    }
    
}
