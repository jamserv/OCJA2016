/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.workingConstructors;

/**
 *
 * @author erlang
 */
public class foo extends bar{
    int i;
    
//    public foo(int y) {
//        super(y*2);
//        i = y;
//    }
    
    public foo(int i, int j) {
        super(j);       
        this.i = i;
    }
    
    public foo(int ip) {
        this(ip, ip);
    }

    public int getI() {
        return i;
    }

    @Override
    public int getJ() {
        return super.getJ(); 
    }  
    
    public static void main(String[] args) {
        foo fu = new foo(9);
        System.out.println(fu.getI());
        System.out.println(fu.getJ());
    }
}
