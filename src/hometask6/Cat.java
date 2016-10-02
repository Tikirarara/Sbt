package hometask6;

public class Cat {
    private Integer age;
    private String name;
    private boolean hasHome;
    private boolean sex;
    private String owner;

    public Cat(String name, boolean sex) {
        this.age = 1;
        this.name = name;
        this.hasHome = false;
        this.sex = sex;
        this.owner = "nobody";
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHasHome(boolean hasHome) {
        this.hasHome = hasHome;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void printAllInf() {
        System.out.println("name: " + name
                + ", age: " + age + ", sex: "
                + sex + ", hashome: " + hasHome
                + ", owner: " + owner);
    }
}
