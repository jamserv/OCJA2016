/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.javaBasics.herencia;

/**
 *
 * @author erlang
 */
public class B {            
    
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("world").insert(1, "caiman ");
        
        System.out.println(builder);                      
    }
}
