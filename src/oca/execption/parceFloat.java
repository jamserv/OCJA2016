/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.execption;

import java.util.Objects;

/**
 *
 * @author erlang
 */
public class parceFloat {
    private int edad;
    private String nombre;
 
    public static void main(String[] args) {
        System.out.println(new parceFloat().parcFloat("s"));
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre);
    }       
    
    public float parcFloat(String value) {
        float f = 0.0f;
        try {
            f = Float.valueOf(value);
        } catch (NumberFormatException numberFormatException) {
            System.err.println("Invalid float value " + value);            
            return Float.NaN;
        } finally {
            System.out.println("Finalize parce float");
        }        
        return f;
    }    
}
