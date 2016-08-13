package hometask2.person;

/* Это моя реализация методов в классе Person
*/

public class Person {
    private final String name;
    private final boolean isMan;
    private Person spouse;

    public Person(String name, boolean isMan) {
        this.isMan = isMan;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (this.isMan != person.isMan) {
            if (this.spouse != null) {
                System.out.println("У " + this.name + " уже есть супруг/супруга, нужно сначала развестись");
                this.divorce();
                this.marry(person);
            } else {
                if (person.spouse != null) {
                    person.marry(this);
                } else {
                    this.spouse = person;
                    System.out.println("Поздравляем Вас, " + this.name + "! теперь " + this.spouse.name + " ваш супруг/супруга");
                    person.spouse = this;
                    System.out.println("Поздравляем Вас, " + person.name + "! теперь " + person.spouse.name + " ваш супруг/супруга");
                }
            }

            return true;
        } else {
            System.out.println("Однополые браки в этой стране запрещены");
            return false;
        }
    }

    public boolean divorce() {
        if (this.spouse != null) {
            spouse.spouse = null;
            System.out.println("Поздравляем Вас, " + spouse.name + "! Теперь вы свободный человек");
            this.spouse = null;
            System.out.println("Поздравляем Вас, " + this.name + "! теперь вы свободный человек");

            return true;
        } else {
            System.out.println("У " + this.name + " и так нет супруга/супругии");
            return false;
        }
    }

    public static void main(String[] args) {
        Person vasia = new Person("Vasia", true);
        Person vova = new Person("Vova", true);
        Person vitya = new Person("Vitya", true);
        Person venya = new Person("Venya", true);
        Person katya = new Person("Katya", false);
        Person kris = new Person("Kris", false);
        Person klava = new Person("Klava", false);
        Person klara = new Person("Klara", false);

        vasia.marry(venya);
        vasia.marry(katya);
        klara.marry(klava);
        kris.marry(vitya);

        vasia.divorce();
        vova.divorce();
        katya.divorce();

        vitya.marry(klara);
    }
}
