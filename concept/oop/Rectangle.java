package concept.oop;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }
    void setWidth(int width){
        this.width = width;
    }
    void setHeight(int height){
        this.height = height;
    }

    int area(){
        return width * height;
    }

    int perimeter(){
        return 2 * width + 2 * height;
    }

    @Override
    public String toString(){
        return "Rectangle " + width + "x" + height;
    }
}
