// Timothy Lafontaine ID :261066866


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {

    public static void main(String[] args) {
        int testNumber1 = 1234;
        int testNumber2 = 9295;

        System.out.println(Arrays.toString(transform(testNumber1)));
        System.out.println(Arrays.toString(transform(testNumber2)));

        int[] arrNumb1 = transform(testNumber1);
        int[] arrNumb2 = transform(testNumber2);

        System.out.println(Arrays.toString(ArraySum(arrNumb1, arrNumb2)));
    }

    // method that receives an integer and trnasforms it 
    
    public static int[] transform(int number) {

        String strNum = Integer.toString(number);

        int[] arrNumb = new int[strNum.length()];

        for (int i = 0; i < strNum.length(); i++){
            arrNumb[i] = Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }

        return arrNumb;
    }

    
    // method that to compute sum of 2 arrays 
    
    public static int[] ArraySum(int[] arrNum1, int[] arrNum2) {
        List<Integer> arrSum = new ArrayList<>();

        int testSumInt = 0;

        for (int i = arrNum1.length - 1; i >=0; i--){
            int sumTest = arrNum1[i] + arrNum2[i] + testSumInt;
            if (sumTest > 9){
                String strNum = Integer.toString(sumTest);
                arrSum.add(Integer.parseInt(String.valueOf(strNum.charAt(1))));
                testSumInt = 1;
            }else {
                arrSum.add(sumTest);
                testSumInt = 0;
            }
        }

        if (testSumInt != 0){
            arrSum.add(1);
        }

        int sizeInt = arrSum.size();
        int[] arrSumFinal = new int[arrSum.size()];

        for (int i = 0; i < sizeInt; i++){
            arrSumFinal[i] = arrSum.get(sizeInt - 1 - i);
        }

        return arrSumFinal;
    }
}

	// thanks for reading my code 