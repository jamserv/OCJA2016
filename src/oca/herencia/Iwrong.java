/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.herencia;

/**
 *
 * @author erlang
 */
public interface Iwrong extends Isow, Iware {

    int VALUE = 63;

    @Override
    void cai();

    void cai(int b);
}
