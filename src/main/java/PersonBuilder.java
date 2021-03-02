public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (age < 0) {
            System.out.println("Age can not be less than zero");
            throw new IllegalArgumentException();
        } else if (surname == null) {
            System.out.println("Not enough data to create new person (missing surname)");
            throw new IllegalStateException();
        } else return new Person(name, surname, age, address);
    }
}
