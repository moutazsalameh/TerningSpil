/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.Game;
import java.util.ArrayList;

/**
 *
 * @author MouNj
 */
public class Result   {

    private int plyaer;
    private int huset;
    private ArrayList<Player> P;
    private String result;
    private Game g;

    public int getPlyaer() {
        return plyaer;
    }

    public void setPlyaer(int plyaer) {
        this.plyaer = plyaer;
    }

    public int getHuset() {
        return huset;
    }

    public void setHuset(int huset) {
        this.huset = huset;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" + "plyaer=" + plyaer + ", huset=" + huset + ", P=" + P + ", result=" + result + ", g=" + g + '}';
    }

  

  


}
