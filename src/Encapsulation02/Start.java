package Encapsulation02;

public class Start {

    public static void main(String[] args) {


        Person person = new Person();

        person.setName("Marco");
        person.setSurname("Setaro");
        person.setHeight(1.75);
        person.setAge(24);

        System.out.println("Name: " + person.getName() + "\n" + "Surname: " + person.getSurname() + "\n" + "Height: " + person.getHeight()+ " m" + "\n" + "Age: " + person.getAge() + " years");




    }
}
