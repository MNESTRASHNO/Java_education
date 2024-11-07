package src.myLittleUbojestvo.OOP;

public class Rectangle {
    int length;
    int width;

    void setSide(int length, int width){
        this.length = length;
        this.width = width;
    }
    void showSquare(){
        System.out.println(length * width);
    }
}
