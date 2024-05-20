/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_practica_mayo_juan_antonio_ona_tijeras;

/**
 *@author Juan Antonio Oña Tijeras
 *@version API 1.5
 *@since 1.5
 */
public class Circulo {

    /**
     * @return the radio
     */
    /**
     * Constructores y parametros.
     * @param radio
     * @param color 
     */
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    /**
     * Devuelve el radio
     * @return 
     */

    public double getRadio() {
        return radio;
    }

    /** Metodo set para introduccion del radio
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /** Devuelve color
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /** Metodo set para indicar el color
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Devuelve numero de circulos.
     * @return the numCirculos
     */
    public static int getNumCirculos() {
        return numCirculos;
    }

    /** Metodo para establecer el numero de circulos.
     * @param aNumCirculos the numCirculos to set
     */
    public static void setNumCirculos(int aNumCirculos) {
        numCirculos = aNumCirculos;
    }
/**
    *Variables de clase
    */
    private double radio;
    private String color;
    private static int numCirculos;
    
    /**
     * Metodo que calcula el area del circulo
     * @return 
     */
    public double calculoArea(){
        if (this.getRadio()<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(getRadio(), 2)*Math.PI);
    }
    /**
     * Metodo que devuelvo el perimetro
     * @return
     * Excepcion incluida si el radio es negativo, o muy grande
     * @throws Exception 
     */
    public double calculoPerimetro()throws Exception{
        if (this.getRadio()<0)
            throw new Exception ("Radio negativo");
        else if(getRadio()>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.getRadio());
    }
    /**
     * Metodo que devuelve si el color es valido o no.
     * @return
     * Excepcion que se introduce si el volor no existe.
     * @throws Exception 
     */
    public boolean colorAceptable() throws Exception {
        if(getColor().length()>20){
            return false;
        }
        else{
            if(getColor().length()<=0){
                throw new Exception ("Color no existente");
            }
            return true;
        }       
    }
    
    
}
