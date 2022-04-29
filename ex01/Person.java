package tut10.ex01;

//super class (parent/base class)
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
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

    public void setAge(int age) throws IllegalArgumentException {
        //validate the value for age
        //if this is an illegal value => throw exception (error)
        if(age < 1) {
            throw new IllegalArgumentException("Age can not be negative.");
        }
        //set value for age after validation
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d", this.getName(), this.getAge()));
        return sb.toString();
    }
}