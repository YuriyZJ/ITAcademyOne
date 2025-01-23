package Lesson08;

//В массиве есть 0 значения. Необходимо создать массив из индексов данного массива.

public class Lesson08H02 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 0, 10, 0, 25, 100, 0, -131, 0, 14};

        int countZero = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                countZero++;
            }
        }

        int index = 0;
        int[] arr1 = new int[countZero];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                    arr1[index] = i;
                    index++;
                }
            }

        for (int j = 0 ; j < countZero; j++){
            System.out.print(arr1[j] + " ");
        }
    }
}
