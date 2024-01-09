package BOOK;

import java.util.Arrays;
import java.util.Scanner;

/*推箱子*/
public class comprehensive_exercise_20 {
    public static void main(String[] args) {
        char[][] map = new char[8][10];
        Scanner sc = new Scanner(System.in);
        int x = 1, y = 1;
        boolean finish = false;
        //创造围墙
        show_wall(map, x, y);

        while (true) {
            System.out.println("--------------------");
            for (char[] row : map) {
                for (char column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
            System.out.println("--------------------");

            if (finish) {
                break;
            }

            System.out.println("A左移，D右移，W上移，S下移，请输入你的指令:");
            String code = sc.nextLine();

            switch (code.toLowerCase()) {
                case "a" -> {
                    if (map[x][y - 1] == 0) {//判断要移动的方向是否无障碍
                        map[x][y] = 0;//原来的位置为空
                        map[x][y - 1] = '&';//没推箱子后自己的位置
                        y--;
                    } else if (map[x][y - 1] == 'o') {//判断自己的左边是不是箱子
                        if (map[x][y - 2] != 'H') {//判断箱子的左边不是墙
                            if (map[x][y - 2] == '*') {//判断箱子左边是终点时
                                finish = true;//结束游戏
                            }
                            map[x][y] = 0;//原来的位置为空
                            map[x][y - 1] = '&';//推了箱子后自己的位置
                            map[x][y - 2] = 'o';//推了箱子后箱子的位置
                            y--;
                        }
                    }
                }
                case "d" -> {
                    if (map[x][y + 1] == 0) {
                        map[x][y] = 0;
                        map[x][y + 1] = '&';
                        y++;
                    } else if (map[x][y + 1] == 'o') {
                        if (map[x][y + 2] != 'H') {
                            if (map[x][y + 2] == '*') {
                                finish = true;
                            }
                            map[x][y] = 0;
                            map[x][y + 1] = '&';
                            map[x][y + 2] = 'o';
                            y++;
                        }
                    }
                }
                case "w" -> {
                    if (map[x - 1][y] == 0) {
                        map[x][y] = 0;
                        map[x - 1][y] = '&';
                        x--;
                    } else if (map[x - 1][y] == 'o') {
                        if (map[x - 2][y] != 'H') {
                            if (map[x - 2][y] == '*') {
                                finish = true;
                            }
                            map[x][y] = 0;
                            map[x - 1][y] = '&';
                            map[x - 2][y] = 'o';
                            x--;
                        }
                    }
                }
                case "s" -> {
                    if (map[x + 1][y] == 0) {
                        map[x][y] = 0;
                        map[x + 1][y] = '&';
                        x++;
                    } else if (map[x + 1][y] == 'o') {
                        if (map[x + 2][y] != 'H') {
                            if (map[x + 2][y] == '*') {
                                finish = true;
                            }
                            map[x][y] = 0;
                            map[x + 1][y] = '&';
                            map[x + 2][y] = 'o';
                            x++;
                        }
                    }
                }
                default -> System.out.println("请输入标准指令:");
            }
        }
        System.out.println("感谢游玩");
        sc.close();
    }

    public static void show_wall(char[][] map, int x, int y) {
        for (int i = 0; i < map.length; i++) {
            if (i == 0 || i == 7) {
                Arrays.fill(map[i], 'H');
            } else {
                map[i][0] = 'H';
                map[i][9] = 'H';
            }
        }
        map[1][3] = 'H';//单独赋值
        map[2][3] = 'H';
        map[3][3] = 'H';
        map[2][5] = 'H';
        map[3][5] = 'H';
        map[3][6] = 'H';
        map[3][8] = 'H';
        map[4][8] = 'H';
        map[6][4] = 'H';
        map[5][4] = 'H';
        map[5][5] = 'H';
        map[5][6] = 'H';
        map[x][y] = '&';
        map[2][2] = 'o';
        map[6][5] = '*';
    }
}

