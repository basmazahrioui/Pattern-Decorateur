/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author pc
 */
public class Application {
    
     public static void main(String[] args) {
         
         Boisson boisson = new Espresso();
         
         System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
         
         boisson = new Deca();
         System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
         
         boisson = new Sumatra();
         System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
    }
}
