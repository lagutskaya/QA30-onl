package HomeWorks.HW7.AdditionalTasks;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    private char[][] table;
    private char currentPlayer;

    public TicTacToeGame() {
        table = initializeTable();
        currentPlayer = 'X';
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            getInitialMSG();

            if (scanner.nextLine().equalsIgnoreCase("y")) {
                System.out.println("********************************************");
                getRules();
                System.out.println("********************************************\n");
                System.out.println("Давайте решим, кто сделает первый шаг?!\n");

                int randomNumber = random().nextInt(100);

                if (randomNumber < 50) {
                    currentPlayer = 'X';
                    System.out.println("Вы ходите первым и Ваше игровое значение - X.\n");
                    readTable(table);
                } else {
                    currentPlayer = 'O';
                    System.out.println("ИИ будет ходить первым и его игровое значение - O.\n");
                    makeAIMove();
                    System.out.println("Ход ИИ: ");
                    readTable(table);
                    currentPlayer = 'X';
                }


                while (true) {
                    if (currentPlayer == 'X') {
                        System.out.println("Ход игрока: ");
                        makeUserMove(); // Ход игрока
                    } else {
                        System.out.println("Ход ИИ:");
                        makeAIMove(); // Ход ИИ
                    }

                    readTable(table);

                    if (checkWin()) {
                        System.out.println("Игрок " + currentPlayer + " выиграл!\n");
                        break;
                    }

                    if (isBoardFull()) {
                        System.out.println("Игра закончилась вничью!\n");
                        break;
                    }

                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }

                System.out.print("Хотите сыграть еще раз? (y/n): ");
                if (!scanner.nextLine().equalsIgnoreCase("y")) {
                    System.out.println("Вы решили не продолжать игру. ПРОЩАЙТЕ!\n");
                    break;
                } else {
                    table = initializeTable();
                    currentPlayer = 'X';
                }
            } else {
                System.out.println("Вы решили не продолжать игру. ПРОЩАЙТЕ!\n");
                break;
            }
        }
        scanner.close();
    }

    public void makeAIMove() {
        Random rand = new Random();
        while (true) {
            int row = rand.nextInt(3);
            int col = rand.nextInt(3);
            if (table[row][col] == '*') {
                table[row][col] = currentPlayer;
                break;
            }
        }
    }

    public void makeUserMove() {
        Scanner scanner = input();
        int row, col;

        while (true) {
            System.out.print("Введите координаты (строка и столбец от 1 до 3): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && table[row][col] == '*') {
                table[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Некорректный ввод, попробуйте еще раз.\n");
            }
        }
    }

    public boolean checkWin() {
        return checkRows() || checkColumns() || checkAxes();
    }

    public boolean checkRows() {
        for (int row = 0; row < 3; row++) {
            if (table[row][0] == currentPlayer && table[row][1] == currentPlayer && table[row][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumns() {
        for (int col = 0; col < 3; col++) {
            if (table[0][col] == currentPlayer && table[1][col] == currentPlayer && table[2][col] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    public boolean checkAxes() {
        return (table[0][0] == currentPlayer && table[1][1] == currentPlayer && table[2][2] == currentPlayer) ||
                (table[0][2] == currentPlayer && table[1][1] == currentPlayer && table[2][0] == currentPlayer);
    }

    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (table[row][col] == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public void getRules() {
        System.out.println("Вы решили сыграть в игру.\n" +
                "Вот правила. У вас есть таблица 3x3.\n" +
                "Вы будете играть против ИИ.\n" +
                "Чтобы сделать ход, вам нужно ввести координаты x и y.\n" +
                "X - строки, y - столбцы. Первая колонка в первой строке равна 1, 1.\n");
    }

    public void getInitialMSG() {
        System.out.println("********************************************");
        System.out.println("Добро пожаловать в игру Крестики-нолики.");
        System.out.println("Вы должны играть против ИИ.");
        System.out.println("Хотите сыграть в ИГРУ? (y/n)");
        System.out.println("********************************************");
    }

    public char[][] initializeTable() {
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'},
        };
    }

    public void readTable(char[][] table) {
        for (char[] outer : table) {
            for (char inner : outer) {
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Scanner input() {
        return new Scanner(System.in);
    }

    public Random random() {
        return new Random();
    }
}