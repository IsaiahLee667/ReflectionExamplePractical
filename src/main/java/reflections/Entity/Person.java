package reflections.Entity;

import lombok.Data;


//This annotation from Lombok uses Reflection to read your fields and auto-create getters and setters
@Data
public class Person {
    private int id;
    private String fname;
    private String lname;
    private int age;

    public Person() {
    }

    public Person(int id, String fname, String lname, int age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
//Notice how after commenting out all the getters and setters, our functions still work just fine because of the Data annotation
  /*  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
}
