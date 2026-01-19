package model;

public class Dog extends Pet{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;


    }

    public void bark() {
        System.out.println("woof woof");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
       return "Dog [name=" + getName() + ", breed=" + breed + "]";
    }
}
