package references.parameters;

public class ReferenceMain {
    public static void main(String[] args) {
        //Deklarálj a ReferencesMain osztály main() metódusában két Person típusú változót!
        Person person = new Person("X", 28);
        Person person2 = new Person("Y", 32);
        //Példányosíts egy új Person objektumot, és add értékül az első változónak!
        Person person3 = new Person("Z", 35);
        person=person3;
        //A második változónak add értékül az elsőt!
        person2=person;
        //Módosítsd a második változón át az objektum name attribútumát!
        person2.setName("ZS");
        //Írd ki mindkét változó tartalmát a képernyőre!
        System.out.println(person.getName() +" " + person.getAge());
        System.out.println(person2.getName() +" " + person2.getAge());
        System.out.println(person3.getName() +" " + person3.getAge());

        int x=24 ;
        int y=x;
        y++;
        System.out.println(x + " " +y);

        Person person4 = new Person("T",53);
        person = person4;
        System.out.println(person.getName() +" " + person.getAge());
        System.out.println(person4.getName() +" " + person4.getAge());
    }
}
