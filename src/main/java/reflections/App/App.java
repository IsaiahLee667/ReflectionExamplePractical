package reflections.App;

import reflections.Entity.Cat;
import reflections.Entity.Dog;
import reflections.Entity.Person;

public class App {
    public static void main(String[] args) {
        Person Isaiah = new Person(1,"Isaiah", "Lee", 25);
        Isaiah.setAge(24);
        Isaiah.setFname("Isaiahz");

        Dog Spot = new Dog();
        Spot.setName("Spot");
        Spot.setNameOfOwner("Isaiah");

        System.out.println("Hello");

        Cat Meowth = new Cat();


    }
}
