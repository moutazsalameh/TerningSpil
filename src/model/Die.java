/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author MouNj
 */
public class Die {

    private int terningenSider;
    Random ran = new Random();

    public Die(int TerningenSider) {
        this.terningenSider = TerningenSider;
    }

    public int throwDie() {

        int min = 1;
        return ran.nextInt(this.terningenSider - min) + 1;
    }

}
