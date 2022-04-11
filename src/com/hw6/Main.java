package com.hw6;



public class Main {


    /// Задание 1,2,3

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        int max = getMax(arr);
        int min = getMin(arr);
        double average;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        average = (double) sum / arr.length;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + min
                + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.\n\n");


        /// Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;

    }
}
