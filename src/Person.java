public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Question to TA : Should I name it to "person" or "p1"? What would you do?
    // Answer :
    public static boolean isFromLondon(Person p1) {
        return p1.getCity().equalsIgnoreCase("London");
    }

    public static void printName(Person p1) {
        if (p1.getName().length() >= 5)
            System.out.println(p1.getName());
        else
            System.out.println("Name is too short.");
    }
}