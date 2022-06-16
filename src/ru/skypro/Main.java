package ru.skypro;

public class Main {

    public static void main(String[] args) {
       // Задание 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;


        double[] numbers = {1.57, 7.654, 9.986};

        int[] num = new int[3];
        num[0] = 5;
        num[1] = 10;
        num[2] = 15;

        //Задание 2

        System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2] + " ");
        System.out.println();
        System.out.print(numbers[0] + ", "+ numbers[1] + ", " + numbers[2] + " ");
        System.out.println();
        System.out.println(num[0] + ", " + num[1] + ", " + num[2]);

        //Задание 3

        System.out.print(arr[2] + ", " + arr[1] + ", " + arr[0] + " ");
        System.out.println();
        System.out.print(numbers[2] + ", "+ numbers[1] + ", " + numbers[0] + " ");
        System.out.println();
        System.out.println(num[2] + ", " + num[1] + ", " + num[0]);

        // Задание 4

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = arr[i] + 1;
                System.out.print(arr[i] + " ");

            }
        }
    }
}
