public class Main {
    public static void main(String[] args) throws AgeException {
        Person person = new PersonBuilder()
                .setAge(20)
                .setLastName("Savchenko")
                .setName("Gosha")
                .setAddress("Lenina")
                .build();
        Person son = person.newChildBuilder()
                .setName("Vasya")
                .build();
        System.out.printf("у %s есть ребенок:\n %s",person,son);
    }
}
