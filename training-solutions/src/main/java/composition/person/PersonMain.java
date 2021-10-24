package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person=new Person("XY","PH837");
        Address address=new Address("Hungary","Érd","utca 10","4332");
        person.moveTo(new Address("Hungary","Vác","út 20","3123"));
        System.out.println(person.getAddress().addressToString());
    }
}
