package com.company;

    public class Main {
        private static final int[] ARRAY1 = {10, 20, 30, 40, 50};
        static int[][] ARRAY2 = new int[][]{
                {10, 30, 30, 50, 40, 40, 30, 40, 50, 30},
                {30, 30, 50, 40, 20, 50, 40, 30, 30, 50},
                {40, 40, 40, 60, 30, 60, 50, 40, 20, 50},
                {50, 50, 60, 20, 50, 60, 60, 60, 30, 30},
                {40, 60, 70, 30, 30, 70, 30, 70, 50, 30},
                {20, 40, 80, 40, 40, 80, 20, 80, 60, 40},
                {30, 30, 30, 50, 30, 90, 30, 50, 40, 50},
                {30, 30, 40, 40, 40, 30, 30, 20, 30, 30},
                {40, 40, 40, 30, 30, 40, 30, 30, 40, 40},
                {20, 50, 50, 40, 30, 40, 30, 40, 30, 30}
        };

        public static void main(String[] args) {
            System.out.println("Test eKreative QA");
            int sum;
            //TODO Во всех заданиях нужно написать решение для массивов любого размера.
            // Так, чтобы решения работали и на массивах с другим количеством элементов.

            //TODO 1) Посчитать сумму элементов массива ARRAY1 с помощью цикла for

            sum = 0;
            for (int i = 0; i < ARRAY1.length; i++) {
                sum = sum + ARRAY1[i];
            }
            System.out.println("Task1: " + sum);

            //TODO 2) Посчитать сумму элементов массива ARRAY1 с помощью цикла while

            sum = 0;
            int i = 0;
            while (i<ARRAY1.length){
                sum = sum+ARRAY1[i];
                i++;
            }
            System.out.println("Task2: " + sum);

            //TODO 3) Посчитать сумму элементов массива ARRAY1 с непарной позицией с помощью цикла for
            // Например, для массива {1,13,15,14,16,1,2} это будет 1+15+16+2=34

            sum = 0;
            i = 0;
            for (i = 0; i<ARRAY1.length; i++ ){
                if (i % 2 == 0){
                    sum += ARRAY1[i];
               }
            }
            System.out.println("Task3: " + sum);

            //TODO 4) Посчитать сумму элементов двумерного массива ARRAY2 с помощью циклов
            // В этом задании массив одинаковый по ширине и высоте.

            sum = 0;
            i = 0;
            int j = 0;
            for (i = 0; i < ARRAY2.length; i++) {
                for (j = 0; j < ARRAY2[i].length; j++) {
                    sum += ARRAY2[i][j];
                }
            }
            System.out.println("Task4: " + sum);

            //TODO 5) Посчитать сумму элементов двумерного массива ARRAY2, которые расположены
            // по диагонали от левого верхнего до правого нижнего элемента с помощью циклов
            // В этом задании массив одинаковый по ширине и высоте.

            sum = 0;
            i = 0;
            j = 0;
            for (i = 0; i < ARRAY2.length; i++) {
                for (j = 0; j < ARRAY2[i].length; j++){
                    if (i == j) {
                        sum += ARRAY2[i][j];
                    }
             }
            }
            System.out.println("Task5: " + sum);
        }
    }
