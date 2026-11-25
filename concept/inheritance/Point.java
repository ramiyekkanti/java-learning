package concept.inheritance;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point move(int dx, int dy){
        return new Point(dx+x, dy+y);
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y +")";
    }

}
