import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        double[] array = new double[3];

        for (int c = 0 ; c < array.length ; c++){

            array[c] = Math.random();

        }

        System.out.println(getArrayToString(array));


        int num1;
        int num2;

        double numA1;
        double numA2;

        while (true){


            num1 = 0;
            num2 = 0;
            numA1 = 0;
            numA2 = 0;




            num1 = random.nextInt(0,3);
            num2 = random.nextInt(0,3);

            numA1 = array[num1];
            numA2 = array[num2];

            array[num1] = numA2;
            array[num2] = numA1;







            if (array[0] > array[1] && array[1] > array[2]){

                break;


            }


        }

        System.out.println(getArrayToString(array));


    }




    public static String getArrayToString(double[] array){

        String s = "[";

        for (int c = 0 ; c < array.length ; c++){

            s += array[c];
            s += " , ";

        }

        s += "]";

        return s;

    }



}