package lecture2;

public class Person {
    //Instance variables
    private String name;
    private byte age;
    private String address;


    //Constructor
    public Person(String name, byte age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * print Details about an instance of the class
     * For example if i have an object called John
     * i can call John.printDetails() and get his info
     */
    public void printDetails() {
        System.out.println("Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Address is : " + address);
    }

    void printDetails(boolean shouldPrintAddress) {
        if (shouldPrintAddress == true) {
            this.printDetails();
        } else {
            System.out.println("Name is : " + name
                    + " \n" + "Age is : " + age);

        }
    }

    public static void main(String[] args) {
        Person john = new Person("John", (byte) 25, "Florida");

        System.out.println(john.getName());
        System.out.println(john.getAddress());
        System.out.println(john.getAge());

        john.printDetails();
        System.out.println();
        john.printDetails(false);
    }

}
