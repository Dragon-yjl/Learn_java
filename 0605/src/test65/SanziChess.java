package test65;
import java.util.Scanner;
public class SanziChess {
    public static void main(String[] args) {
        Game.printChessBord();
        Game.player();
        Game.gameover();
    }
}




class Game {

    //char类型的二维数组，chessbord表示棋盘
    static char[][] chessbord = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    static int[] arr = new int[2];

    /**
     * 棋盘的打印
     */
    public static void printChessBord() {
        System.out.println("-------");
        for (int i = 0; i < chessbord.length; i++) {
            for (int j = 0; j < chessbord[i].length; j++) {
                System.out.print("|");
                System.out.print(chessbord[i][j]);
            }
            System.out.print("|" + "\n");
            System.out.print("-------" + "\n");
        }
    }

    /**
     * 玩家的轮换
     */
    public static void player() {
        for (int i = 1; i < 11; i++) {
            if (i == 10) {
                System.out.println("游戏平局");
            } else {
                if (i % 2 == 1) {
                    System.out.println("玩家1出");
                    chooseAdd();
                    if (chessbord[arr[0]][arr[1]] == ' ') {
                        chessbord[arr[0]][arr[1]] = 'X';
                        printChessBord();
                    } else {
                        printChessBord();
                        System.out.println("该位置已存在棋子，请重新输入");
                        i--;
                    }
                } else {
                    System.out.println("玩家2出");
                    chooseAdd();
                    if (chessbord[arr[0]][arr[1]] == ' ') {
                        chessbord[arr[0]][arr[1]] = 'O';
                        printChessBord();
                    } else {
                        printChessBord();
                        System.out.println("该位置已存在棋子，请重新输入");
                        i--;
                    }
                }
            }
        }
    }

    /**
     * 玩家输入要下的位置坐标
     *
     * @return
     */
    public static void chooseAdd() {
        System.out.println("请依次输入横纵坐标位置，用空格分隔");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    /**
     * 游戏结束的判断
     */
    public static void gameover() {
        int i = 0;
        for (int j = 0; j < chessbord.length; j++) {
            if (chessbord[0][0] == 'X' && chessbord[1][1] == 'X' && chessbord[2][2] == 'X'
                    || chessbord[0][0] == 'O' && chessbord[1][1] == 'O' && chessbord[2][2] == 'O') {
                System.out.println("你赢了，游戏结束");
                System.exit(0);
            } else {
                if (chessbord[j][i] == 'X' && chessbord[j][i + 1] == 'X' && chessbord[j][i + 2] == 'X'
                        || chessbord[j][i] == 'O' && chessbord[j][i + 1] == 'O' && chessbord[j][i + 2] == 'O') {
                    System.out.println("你赢了，游戏结束");
                    System.exit(0);
                }
                if (chessbord[i][j] == 'X' && chessbord[i + 1][j] == 'X' && chessbord[i + 2][j] == 'X'
                        || chessbord[i][j] == 'O' && chessbord[i + 1][j] == 'O' && chessbord[i + 2][j] == 'O') {
                    System.out.println("你赢了，游戏结束");
                    System.exit(0);
                }
            }
        }
    }
}