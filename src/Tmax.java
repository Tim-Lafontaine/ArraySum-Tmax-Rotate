// Timothy Lafontaine ID : 261066866

import java.util.Arrays;
import java.util.Random;

public class Tmax {

    public static void main(String[] args) {

        float[] arr1 = gerRandomArray();
        System.out.println(Arrays.toString(arr1));

        float thirdB = thirdBiggest(arr1);
        System.out.println(thirdB);

    }

    public static float[] gerRandomArray(){
        Random randNum = new Random(System.currentTimeMillis());

        int randIntSize = randNum.nextInt(8) + 2;

        float[] arr = new float[randIntSize];

        for (int i = 0; i < randIntSize; i ++){
            arr[i] = randNum.nextFloat();
        }

        return arr;
    }

    public static float thirdBiggest(float[] arr){
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        if (arr.length > 2)
            return arr[arr.length - 3];
        else
            return arr[1];
    }
}

// Thanks for reading my code 