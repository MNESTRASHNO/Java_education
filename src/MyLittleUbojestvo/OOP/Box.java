package src.MyLittleUbojestvo.OOP;

public class Box {
    double lenght;

    double width;

    double height;

    double getVolume(){
        return height * lenght * width;
    }

    void showVolume(){
        System.out.println(height * lenght * width);
    }
}
