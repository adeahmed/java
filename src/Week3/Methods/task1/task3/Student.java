package Week3.Methods.task1.task3;

import java.io.Serializable;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    // Constructors, getters, setters

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name.length() > 0)
            this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

}
