package hometask6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Petrovich", true);
        Person person = new Person("Gennadii", "Crockodil", true, false);

        System.out.println("Cat before:");
        cat.printAllInf();
        System.out.println("Person before:");
        person.printAllInf();

        BeanUtils.assign(cat, person);

        System.out.println("Cat after:");
        cat.printAllInf();
        System.out.println("Person after:");
        person.printAllInf();
    }
}
