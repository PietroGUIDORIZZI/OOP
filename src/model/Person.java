package model;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private Person spouse;
    private Pet pet;

    public Person(String firstName, String lastName, int age, Address address, Person spouse, Pet pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.spouse = spouse;
        this.pet = pet;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // toString method

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }

}
