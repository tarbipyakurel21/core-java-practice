class Human {
    private int age;
    private String name;

    public int getAge() {

        return age;
    }

    public void setage(int a) {
        age = a;

    }

    public void setname(String b) {
        name = b;
    }

    public String getName() {
        return name;
    }

}

public class OOP {

    public static void main(String a[]) {

        Human obj = new Human();

        // we are using methods because of the private variables.
        // we are encapsulating the data in methods

        obj.setage(19);
        obj.setname("Tarbi");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }

}
