package src.myLittleUbojestvo.finalAndPrivate;

public class MyMath {

    static final double PI = 3.14;


    static int square(int f, int s){
        return f * s;
    }


    static double square(double f, double s){
        return f * s;
    }

    static int sum(int... numbers){
        int sum = 0;
        for(int numb : numbers){
            sum += numb;
        }
        return sum;
    }

    static double sum(double... numbers){
        double sum = 0;
        for(double numb : numbers){
            sum += numb;
        }
        return sum;
    }
}
