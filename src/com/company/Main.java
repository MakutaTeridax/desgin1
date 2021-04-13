package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Player okay = new Player("PinkNyanNyanPunch");
    Player op = new Player("");
        System.out.println(okay);
        System.out.println(op.getUsername() + " " +op.getLevel() +
                " " + op.getHp() + " " + op.getPhysatk() + " " + op.getDef() + " " + op.getMahou() + " " +  op.getAgile() + " "+ op.getLuck());
        okay.levelup();
        okay.levelup();
        okay.levelup();
        for(int i = 0; i < 50; i++){
            op.levelup();
        }
        System.out.println(okay);
        System.out.println(op);
    }

}
