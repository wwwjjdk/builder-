

public class Person {
    protected String name;
    protected String lastName;
    protected int age;
    protected String address;

    public String getName(){return  name;}
    public String getLastName(){return lastName;}
    public int getAge(){return age;}
    public String getAddress(){return address;}

   public int happyBirthday(){
        if(hasAge() == true){
            return age++;
        }
        return this.age;

   }
   public boolean hasAge(){
        if(this.age != 0 && this.age >0){
            return true;
        }
        return false;
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public PersonBuilder  newChildBuilder() throws AgeException {
        PersonBuilder person = new PersonBuilder();
        person.setLastName(this.getLastName());
        person.setAddress(this.getAddress());
        person.setAge(this.getAge());
        return person;
    }
}
