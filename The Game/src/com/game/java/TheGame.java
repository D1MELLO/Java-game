package com.game.java;

import java.util.Scanner;

public class TheGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("THE GAME!\n");
        System.out.println("Press for:\n 1-Play\n 2-Settings\n 3-Credits");
        
        int choice = sc.nextInt();
        
        while (choice < 1 || choice > 3) {
            System.out.println("This option doesn't exist!");
            System.out.println("Press for:\n 1-Play\n 2-Settings\n 3-Credits");
            choice = sc.nextInt();
        }
        
        switch (choice) {
            case 1:
                System.out.println("Starting the game...");
                break;
            case 2:
                System.out.println("Opening settings...");
                break;
            case 3:
                System.out.println("This game was developed by Sérgio Di Mello & Levi (Kobayashi).\n© ALL RIGHTS RESERVED.");
                break;
        }
        
        sc.close();
		
	}

}
