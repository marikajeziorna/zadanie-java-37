public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age) {
        if (firstName == null && lastName == null) {
            throw new NameUndefinedException("First Name and Last Name can't be null.");
        }
        if (firstName.length() < 2 && lastName.length() < 2) {
            throw new NameUndefinedException("First Name and Last Name should longer than 1 character.");
        }
        if (age < 1) {
            throw new IncorrectAgeException("Wrong age, It can't be less than 1.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }
}
