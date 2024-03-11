/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronabstractfactory;

/**
 *
 * @Marlon
 */
public class PatronAbstractFactory {

    public static void main(String[] args) {
        // Crear una fábrica de figuras:
        
        AbstractFactory figuraFactory= new FiguraFactory();
        Figura figura= figuraFactory.crearFigura();
        figura.Dibujar();
        
        // Crear una fábrica de colores: 
        
        AbstractFactory colorFactory= new ColorFactory();
        Color color= colorFactory.RellenardeColor();
                color.Pintar();
        
        
    }
}
