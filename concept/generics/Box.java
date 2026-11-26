package concept.generics;

public class Box <T>{
    private T value;

    public Box(T value){
        this.value = value;
    }
    public Box(){

    }
    public boolean isEmpty(){
        if(value == null) return true;
        return false;
    }
    public T get(){
        return value;
    }
    public void set(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return (value != null) ? "Box["+value+"]" : "Box[empty]";
    }
}
