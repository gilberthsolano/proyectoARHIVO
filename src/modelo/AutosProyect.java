/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author HP
 */
//para trabajar datos con objetos
public class AutosProyect implements Serializable {
    
       private String marcaAuto="";
    private String modeloAuto="";
    private int anioAuto=0;
    private String colorAuto="";
    public AutosProyect(){
        
    }
    public AutosProyect(String marcaAuto, String modeloAuto, int anioAuto, String colorAuto){
        this.marcaAuto=marcaAuto;
        this.modeloAuto=modeloAuto;
        this.anioAuto=anioAuto;
        this.colorAuto=colorAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public int getAnioAuto() {
        return anioAuto;
    }

    public void setAnioAuto(int anioAuto) {
        this.anioAuto = anioAuto;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(String colorAuto) {
        this.colorAuto = colorAuto;
    }

    @Override
    public String toString() {
        return "AutosProyect{" + "marcaAuto=" + marcaAuto + ", modeloAuto=" + modeloAuto + ", anioAuto=" + anioAuto + ", colorAuto=" + colorAuto + '}';
    }
    
    
}
