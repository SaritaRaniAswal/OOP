package exeptionPack;
// Java program to demonstrate
// built-in Exception


class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "exeptionPack.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class ExceptionDemo {
/*
    Modify code to handle the exception which may occur in the program.
*/

    public static void main(String args[])
    {
        Person p1=new Person(args[0],Integer.parseInt(args[1]));
        System.out.println(p1);
    }
}
