public interface Builder  {
    PersonBuilder setAge(int age) throws AgeException;
    PersonBuilder setName(String name);
    PersonBuilder setLastName(String lastName);
    PersonBuilder setAddress(String address);
    Person build();
}
