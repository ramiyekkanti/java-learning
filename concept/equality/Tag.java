package concept.equality;

public class Tag {
    private int n;

    public Tag(int n){
        this.n = n;
    }

    public void setN(int n){
        this.n = n;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null || this.getClass() != obj.getClass()) return false;
        Tag t = (Tag) obj;
        return this.n == t.n;
    }

    @Override
    public int hashCode(){
        return this.n;
    }
}
