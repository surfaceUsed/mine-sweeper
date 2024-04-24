package application;

import application.game.MineController;

import java.util.Scanner;

class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input number of mines in game: ");
        MineController controller = new MineController(scanner.nextInt());
        controller.playGame();
        scanner.close();

    }
}