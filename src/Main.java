import java.util.Random;

public class Main {
    public static void main(String[] args) {

        bozoSort();

    }



    public static void bozoSort(){

        Random random = new Random();

        double[] array = new double[10];

        for (int c = 0 ; c < array.length ; c++){
            array[c] = Math.random();
        }

        System.out.println(getArrayToString(array));

        int num1;
        int num2;
        double numA1;
        double numA2;

        int count = 0;
        int correctCount;

        while (true){

            if (isSorted(array)){
                break;
            }

            count++;

            num1 = random.nextInt(0,10);
            num2 = random.nextInt(0,10);

            numA1 = array[num1];
            numA2 = array[num2];

            array[num1] = numA2;
            array[num2] = numA1;

        }

        System.out.println(getArrayToString(array));
        System.out.println("It took " + count + " swaps");

    }

    public static boolean isSorted(double[] array){

        boolean isTrue = false;

        int correctCount = 0;

        for (int c = 0 ; c < array.length ; c++){

            if (c < array.length-1){
                if (array[c] < array[c+1]){

                    correctCount++;

                }
            }
        }

        if (correctCount == array.length-1){
            isTrue = true;
        }

        return isTrue;

    }

    public static String getArrayToString(double[] array){

        String s = "[";

        for (int c = 0 ; c < array.length ; c++){

            if (c < array.length-1){

                s += array[c];
                s += " , ";

            }
            else {

                s += array[c];

            }
        }
        s += "]";
        return s;
    }

}