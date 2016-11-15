/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.javaBasics.herencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erlang
 */
public class byZero {

    public static void main(String[] args) {
        int d = 0;
        try {            
            int i = 1 / (d * doIt());
        } catch (Exception ex) {
            Logger.getLogger(byZero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static int doIt() throws Exception {
        throw new Exception();
    }
}
