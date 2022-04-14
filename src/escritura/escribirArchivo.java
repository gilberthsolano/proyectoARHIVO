/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import modelo.AutosProyect;

/**
 *
 * @author HP
 */
public class escribirArchivo {
    Scanner ingreso = new Scanner(System.in);
    AutosProyect aut = new AutosProyect();
    public void escribir(){
        FileOutputStream inFile =null;
        ObjectOutputStream oST= null;
        try {
            inFile= new  FileOutputStream(new File("C:\\Users\\HP\\Documents\\objetos\\objetoarchivo.txt"));//ruta
            oST= new ObjectOutputStream(inFile);//datos se van almacenar como objetos
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese  los datos del auto");
                System.out.println("Ingrese la marca de auto");
                String marcaAuto= ingreso.nextLine();
                aut.setMarcaAuto(marcaAuto);
                System.out.println("Ingrese el modelo del auto");
                String modeloAuto=ingreso.nextLine();
                aut.setModeloAuto(modeloAuto);
                System.out.println("Ingrese el anio de auto");
                int anioAuto=Integer.parseInt(ingreso.nextLine());
                aut.setAnioAuto(anioAuto);
                System.out.println("Ingrese el color del auto");
                String colorAuto= ingreso.nextLine();
                aut.setColorAuto(colorAuto);
                oST.writeObject(aut);
                aut=new AutosProyect();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            
        try{
            if(inFile!=null){
                inFile.close();
            }
        }catch(Exception e){
            System.out.println("No se puede cerrar el archivo");
        }
    }
        
    }
    
}
