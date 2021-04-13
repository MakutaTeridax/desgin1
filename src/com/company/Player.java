package com.company;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String username;
    private int level;
    private int hp;
    private int def;
    private int physatk;
    private int mahou;
    private int agile;
    private int luck;



    public Player(String username){
        this.username = username;
        level = 1;
        hp = 500;
        def = 50;
        physatk = 50;
        mahou = 30;
        agile = 10;
        Random rando = new Random();
        luck = rando.nextInt(5);
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", def=" + def +
                ", physatk=" + physatk +
                ", mahou=" + mahou +
                ", agile=" + agile +
                ", luck=" + luck +
                '}';
    }
    public void levelup(){
        boolean okay = false;
        int  a = 0;
        while(!okay) {
            Scanner f = new Scanner(System.in);
            System.out.println("Which stat do you want to level the most? \n 1 is hp, 2 is def, 3 is attack, \n 4 is magic, and 5 is agility.");
            try {
                a = f.nextInt();
                okay = true;
            } catch (Exception e) {
                okay = false;
            }
        }
        switch (a){
            case 1:
                hp = hp + 500;
                def = def + 25;
                physatk = physatk + 15;
                mahou = mahou + 15;
                agile = agile + 5;
                Random rand = new Random();
                int b = rand.nextInt();
                if ( b%4 == 1){
                    luck = luck + 1;
                }
                else  if(b%4 == 2) {
                    luck = luck + 5;
                }
                else if(b%4 == 3) {
                    luck *= luck;
                }
                else{
                    luck -= luck;
                }
            case 2:
                hp = hp + 250;
                def = def + 60;
                physatk = physatk + 10;
                mahou = mahou + 20;
                agile = agile + 2;
                rand = new Random();
                b = rand.nextInt();
                if ( b%4 == 1){
                    luck = luck + 1;
                }
                else  if(b%4 == 2) {
                    luck = luck + 5;
                }
                else if(b%4 == 3) {
                    luck *= luck;
                }
                else{
                    luck -= luck;
                }
            case 3:
                hp = hp + 200;
                def = def + 15;
                physatk = physatk + 75;
                mahou = mahou + 15;
                agile = agile + 5;
                rand = new Random();
                b = rand.nextInt();
                if ( b%4 == 1){
                    luck = luck + 1;
                }
                else  if(b%4 == 2) {
                    luck = luck + 5;
                }
                else if(b%4 == 3) {
                    luck *= luck;
                }
                else{
                    luck -= luck;
                }
            case 4:
                hp = hp + 150;
                def = def + 15;
                physatk = physatk + 10;
                mahou = mahou + 70;
                agile = agile + 8;
                rand = new Random();
                b = rand.nextInt();
                if ( b%4 == 1){
                    luck = luck + 1;
                }
                else  if(b%4 == 2) {
                    luck = luck + 5;
                }
                else if(b%4 == 3) {
                    luck *= luck;
                }
                else{
                    luck -= luck;
                }
            case 5:
                hp = hp + 150;
                def = def + 10;
                physatk = physatk + 25;
                mahou = mahou + 20;
                agile = agile + 20;
                rand = new Random();
                b = rand.nextInt();
                if ( b%4 == 1){
                    luck = luck + 1;
                }
                else  if(b%4 == 2) {
                    luck = luck + 5;
                }
                else if(b%4 == 3) {
                    luck *= luck;
                }
                else{
                    luck -= luck;
                }
            }
        System.out.println("level up success!");
        level++;
        }

    public String getUsername(){
        return username;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getDef() {
        return def;
    }

    public int getPhysatk() {
        return physatk;
    }

    public int getAgile() {
        return agile;
    }

    public int getLuck() {
        return luck;
    }

    public int getMahou() {
        return mahou;
    }

}
