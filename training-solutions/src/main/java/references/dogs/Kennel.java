package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogList= new ArrayList<>();
        Dog dog1 = new Dog("kutya1",2,"fekete");
        Dog dog2 = new Dog("kutya2",1,"fehér");
        Dog dog3 = new Dog("kutya3",4,"barna");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        System.out.println(dogList);
        Dog dog4 = dogList.get(1);
        dog4.setColour("szürke");
        System.out.println(dogList);
        Dog dog5 =new Dog("kutya5",3,"ezüst");
        System.out.println(dog5.toString());
        dog5=dogList.get(1);
        System.out.println(dog5.toString());
        dogList.add(dog5);
        System.out.println(dogList);
        Dog dog6=dog4;
        dog6.setColour("arany");
        System.out.println(dogList);
        List<Dog> dogList2 =dogList;
        Dog dog7 =dog4;
        dog7.setColour("lila");
        System.out.println(dogList2);
        dog2.setColour("piros");
        System.out.println(dogList2);
        dog2=null;
        System.out.println(dogList2);
        Dog dog8 = dogList.get(1);
        dog8=null;
        System.out.println(dogList2);
        Dog dog9=dogList.get(1);
        dog9.setColour("fekehér");
        System.out.println(dogList2);
    }
}
