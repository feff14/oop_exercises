package ch.hslu.sw07;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Objects;

public class Person implements Comparable<Person>{
    @Immutable
    private final long Id;

    private  String lastname;
    private  String forname;
    private static long lastId = 0;


    public Person(String lastname, String forname){
        this.lastname = lastname;
        this.forname = forname;
        Id = lastId + 1;
        lastId += 1;
    }

    public long getId() {
        return Id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getForname() {
        Person test = new Person("","");
        return forname;
    }

    @Override
    public final boolean equals(Object obj) {
        if(obj == this)
        {
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        final Person other = (Person)obj;
        return (other.Id == this.Id);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.Id);
    }

    @Override
    public String toString() {
        return "Person{ \nid = "+this.Id + "\nlastname = " + this.lastname + "\nforname = "+this.forname + "\n}";
    }

    @Override
    public int compareTo(Person o) {
        return Long.compare(this.Id, o.Id);
    }
}
