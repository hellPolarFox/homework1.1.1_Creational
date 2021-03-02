public class Main {

    public static void main(String[] args) {

        Person john = new PersonBuilder()
                .setName("John")
                .setSurname("Smith")
                .setAge(32)
                .setAddress("Huston")
                .build();

        System.out.println(john);

        Person johnsNewSon = john.newChildBuilder()
                .setName("David")
                .build();

        System.out.println(johnsNewSon);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
