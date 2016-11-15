/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.herencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erlang
 */
public class Soccer extends Game {        

    @Override
    public void play() {
        List<Integer> integers = new ArrayList<>();
        
        System.out.println("Playing soccer now..!");
    }    

    public static void main(String[] args) {
        Game game = new Soccer();
        try {
            game.play();
        } catch (Exception ex) {
            System.err.print("Error : " + ex.getMessage());
        }
    }
}
