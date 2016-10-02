package hometask6;

public class Person {
    private String name;
    private String secondName;
    private boolean sex;
    private boolean isMarry;
    private Number age;

    public Person(String name, String secondName, boolean sex, boolean isMarry) {
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.isMarry = isMarry;
        this.age = 30;
    }

    public String getName() {
        return name;
    }

    public boolean getSex() {
        return sex;
    }

    public String getSecondName() {
        return secondName;
    }

    public boolean getMarry() {
        return isMarry;
    }

    public Number getAge() {
        return age;
    }

    public void setMarry(boolean marry) {
        isMarry = marry;
    }

    public void printAllInf() {
        System.out.println("name: " + name
                + ", secondName: " + secondName
                + ", age: " + age + ", sex: "
                + sex + ", isMarry: " + isMarry);
    }
}
