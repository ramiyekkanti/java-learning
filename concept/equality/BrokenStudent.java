package concept.equality;

public class BrokenStudent {
    private final int id;
    private final String name;

    public BrokenStudent(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null || this.getClass() != obj.getClass()) 
            return false;

        BrokenStudent other = (BrokenStudent) obj;
        return this.id == other.id;
    }

    @Override
    public String toString(){
        return "Student[" + id + ", " + name + "]";
    }
}
