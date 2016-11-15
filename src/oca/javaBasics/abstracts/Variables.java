/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.javaBasics.abstracts;

/**
 *
 * @author erlang
 */
public class Variables {
    private Mock mock = new Mock();
    
    public void makeItNull(Mock mock) {
        mock = null;        
        System.out.println("::"+mock);
    }
    
    public void makeThisNull() {
        mock.setId(9984);
        makeItNull(mock);
    }
    
    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.makeThisNull();
    }
}
