package concept.equality;

import java.util.Objects;

public class Student {
    private final int id;
    private final String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null || this.getClass() != obj.getClass()) 
            return false;

        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "Student[" + id + ", " + name + "]";
    }
}
