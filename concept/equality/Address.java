package concept.equality;

import java.util.Objects;

public class Address {
    private String city;

    public Address(String city){
        this.city = city;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null || this.getClass() != obj.getClass()) 
            return false;
        Address other = (Address) obj;
        return Objects.equals(this.city, other.city); 
    }

    @Override
    public int hashCode(){
        return Objects.hash(city);
    }
}
