/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import modelo.AutosProyect;

/**
 *
 * @author HP
 */
public class lecturaArchivo {

    FileInputStream inFi = null;
    ObjectInputStream oIS = null;

    public void leer() {

        try {
            inFi = new FileInputStream(new File("C:\\Users\\HP\\Documents\\objetos\\objetoarchivo.txt"));
            oIS = new ObjectInputStream(inFi);
            AutosProyect autoPro = new AutosProyect();
            
            
          
              
                do{
                      autoPro = (AutosProyect) oIS.readObject();
                System.out.println(autoPro);
                }while(oIS!=null);
                
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (inFi != null) {
                    inFi.close();
                }
            } catch (Exception e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }
    }
}
