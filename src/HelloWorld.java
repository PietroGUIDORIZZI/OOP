import model.Address;
import model.Dog;
import model.Person;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        Person john = new Person("John", "Doe", 30);


        Person jane = new Person("Jane", "Doe", 29);

        john.setSpouse(jane);

        Dog jack = new Dog("Jack", "German Shepard");
        jack.bark();
        john.setAddress(new Address("Rua JVC", "SJDR", "MG", "36309-537"));
        john.setPet(jack);

        System.out.println(john);


    }
}







