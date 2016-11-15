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
public class init {

    private static int loop = 15;
    static final int INTERVAL = 10;
    boolean flag;    

    {
        flag = true;
    }
    
    static {
        loop += INTERVAL;
//        INTERVAL = 15; error without final declaration variable
    }
}

