package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MouNj
 */
public class Player {

    private String playersNavn;
    private int antalPoint;

    public Player(String playersNavn, int antalPoint) {
        this.playersNavn = playersNavn;
        this.antalPoint = antalPoint;
    }

    public String getPlayersNavn() {
        return playersNavn;
    }

    public int getAntalPoint() {
        return antalPoint;
    }

    public void setPlayersNavn(String playersNavn) {
        this.playersNavn = playersNavn;
    }

    public void setAntalPoint(int antalPoint) {
        this.antalPoint = antalPoint;
    }

}
