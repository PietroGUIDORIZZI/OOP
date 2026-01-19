package model;

public class Cat extends Pet{
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void meow() {
        System.out.println("meow meow");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat [name=" + getName() + ", color=" + color + "]";
    }
}
