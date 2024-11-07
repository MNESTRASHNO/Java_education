package src.myLittleUbojestvo.OOP;

public class Box {
    private double lenght;

    private double width;

    private double height;

    public void setDiemens(double lenght, double width, double height){
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }


    public Box(double size){
        this(size, size, size);
    }


    public Box(){
        lenght = 10;
        width = 10;
        height = 10;
    }


    public Box(Box duplicate){
        this(duplicate.lenght, duplicate.width, duplicate.height);
    }

    
    public int compare(Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume){
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
    public Box(double lenght, double width, double height){
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public double getVolume(){
        return height * lenght * width;
    }

    public void showVolume(){
        System.out.println(height * lenght * width);
    }

    public   Box copy(){
        return new Box(this);

    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
