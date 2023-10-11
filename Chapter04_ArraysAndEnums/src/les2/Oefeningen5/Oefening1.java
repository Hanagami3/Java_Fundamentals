package Oefeningen5;

import java.util.Arrays;

public class Oefening1 {

    public static void main(String[] args) {

        String str;
        int[][][] array = 
        {{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}},
         {{26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40}, {41, 42, 43, 44, 45}, {46, 47, 48, 49, 50}},
         {{51, 52, 53, 54, 55}, {56, 5, 58, 59, 60}, {61, 62, 63, 64, 65}, {60, 67, 68, 69, 70}, {71, 72, 73, 74, 75}},
         {{76, 77, 78, 79, 80}, {81, 82, 83, 84, 85}, {86, 87, 88, 89, 90}, {91, 92, 93, 94, 95}, {96, 97, 98, 99, 100}},
         {{101, 102, 103, 104, 105}, {106, 107, 108, 109, 110}, {111, 112, 113, 114, 115}, {116, 117, 118, 119, 120}, {121, 122, 123, 124, 125}}};
        String strdeep = Arrays.deepToString(array);
        System.out.println(strdeep);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                str = Arrays.toString(array[i][j]);
                System.out.print(str + ",");
                if (j == 4)
                    System.out.println();
            }
        }

        int [][][] array1 = new int [5][5][5];


        int a = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++){
                    a++;
                    array1[i][j][k] = a;
                }
            }
        }
        System.out.println();
        String strDeep = Arrays.deepToString(array1);
        System.out.println(strDeep);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                str = Arrays.toString(array1[i][j]);
                System.out.println(str);
            }
        }

    }
}
