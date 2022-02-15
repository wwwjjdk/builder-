public class PersonBuilder implements Builder {
    private Person person;

    public  PersonBuilder(){
        person = new Person();
    }

    @Override
    public PersonBuilder setAge(int age) throws AgeException {
        if(age ==0 || age<0){
            throw new AgeException("неверное число");
        }
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        person.lastName = lastName;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
