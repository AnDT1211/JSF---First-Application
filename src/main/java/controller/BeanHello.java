package controller;

public class BeanHello {
    String name;
    int age;

    public BeanHello() {
        name = "mr. Bean";
        age = 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
