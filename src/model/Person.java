package model;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String lastName, int age, String firstName) {
        this.lastName = lastName;
        this.age = age;
        this.firstName = firstName;
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

    // toString method

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }

}
