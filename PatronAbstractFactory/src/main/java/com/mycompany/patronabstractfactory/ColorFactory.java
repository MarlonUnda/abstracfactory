/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @Marlon
 */
public class ColorFactory implements AbstractFactory {

    @Override
    public Figura crearFigura() {
       return null;  
    }

    @Override
    public Color RellenardeColor() {
        return new Rojo();
    }
    
}
