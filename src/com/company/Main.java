package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        openMainMenu();
    }

    public static void openMainMenu(){
        Scanner scanner = new Scanner(System.in);

        int number = -1;

        while(number != 0){
            System.out.println("1. Open ship menu");
            System.out.println("2. Open container menu");
            System.out.println("0. Exit");

            number = scanner.nextInt();

            if(number == 1){
                openShipMenu();
            }
            else if(number == 2){
                //Open container menu
            }
        }

    }

    public static void openShipMenu(){
        List<String> ships = new ArrayList<>();
        ships.add("Evergreen");
        ships.add("Titanic");
        ships.add("Fade");
        Scanner scanner = new Scanner(System.in);

        int number = -1;

        while(number != 0){
            for(int i = 0; i < ships.size(); i++){
                System.out.println((i + 1) + ". " + ships.get(i));
            }
            System.out.println("0. Exit");

            number = scanner.nextInt();

            if(number > 0 && number < ships.size()){
                System.out.println("You chose " + ships.get(number - 1));
            }
        }
    }
}
