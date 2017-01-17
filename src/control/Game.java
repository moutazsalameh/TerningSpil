/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Die;
import model.Player;

/**
 *
 * @author MouNj
 */
public class Game {

    private static String huset;
    private Player spilleren;
    private Player husetsPlayer;
    public int PlayerPoint;
    public int husetPoint;
    private ArrayList<Player> players;
    private Die die;

    public int getPlayerPoint() {
        return this.PlayerPoint;
    }

    public int getHusetPoint() {
        return this.husetPoint;
    }

    public void playGame1(String name) {
        players = new ArrayList<>();
        Die die1 = new Die(6);
        int player = 0;
        int huset = 0;
        for (int i = 0; i < 10; i++) {
            player = die1.throwDie() + player;
            huset = die1.throwDie() + huset;
        }
        spilleren = new Player(name, player);
        this.PlayerPoint = player;
        this.husetPoint = huset;
        husetsPlayer = new Player("huset", huset);
        players.add(spilleren);
        players.add(husetsPlayer);

        System.out.println("Der kastes ti 6-sidede terninger for dig…");
        System.out.println("Dine point:" + player);
        System.out.println("Der kastes ti 6-sidede terninger for huset…");
        System.out.println("Husets point: " + huset);

    }

    public void playGame2(String playerName) {
        players = new ArrayList<>();
        Die die2 = new Die(12);
        Die die3 = new Die(24);

        int sumHuset = 0;
        int sumPlayert = 0;

        for (int i = 0; i < 5; i++) {
            sumHuset += die2.throwDie();
            sumPlayert += die2.throwDie();
        }
        for (int ii = 0; ii < 5; ii++) {
            sumHuset += die3.throwDie();
            sumPlayert += die3.throwDie();
        }
        if (sumHuset % 2 == 0) {
            sumHuset = sumHuset * 2;
        }
        if (sumPlayert % 2 == 0) {
            sumPlayert = sumHuset * 2;
        }
        spilleren = new Player(playerName, sumPlayert);
        husetsPlayer = new Player("huset", sumHuset);
        players.add(spilleren);
        players.add(husetsPlayer);
        this.PlayerPoint = sumPlayert;
        this.husetPoint = sumHuset;
        System.out.println("Der kastes en 6-sidede terninger for dig…");
        System.out.println("Dine point:" + sumPlayert);
        System.out.println("Der kastes en 6-sidede terninger for huset…");
        System.out.println("Husets point: " + sumHuset);
    }

    public void playGame3(String playerName) {
        String ekstraKastHuset = null;
        String ekstraKastPlayer = null;
        Die die1 = new Die(6);
        Die die2 = new Die(12);
        Die die3 = new Die(10);
        int sumHuset = 0;
        int sumPlayert = 0;

        for (int i = 0; i < 1; i++) {
            sumHuset += die1.throwDie();
            sumPlayert += die1.throwDie();
        }
        if (sumHuset <= 3) {
            for (int i = 0; i < 1; i++) {
                sumHuset += die2.throwDie();

            }
            ekstraKastHuset = "og 12-sidetterning";
        } else {
            for (int i = 0; i < 1; i++) {
                sumHuset += die3.throwDie();

            }
            ekstraKastHuset = "og 10-sidetterning";
        }
        if (sumPlayert <= 3) {
            for (int i = 0; i < 1; i++) {
                sumPlayert += die2.throwDie();

            }
            ekstraKastPlayer = "og 12-sidede terning";
        } else {
            for (int i = 0; i < 1; i++) {
                sumPlayert += die3.throwDie();

            }
            ekstraKastPlayer = "og 10-sidede terning";
        }

        husetsPlayer = new Player("Huset", sumHuset);
        spilleren = new Player(playerName, sumPlayert);
        this.PlayerPoint = sumPlayert;
        this.husetPoint = sumHuset;
        System.out.println("Der kastes en 6 sidede  " + ekstraKastHuset + " for dig…");
        System.out.println("Dine point:" + sumPlayert);
        System.out.println("Der kastes en 6-sidede " + ekstraKastPlayer + " for huset…");
        System.out.println("Husets point: " + sumHuset);
    }

}
