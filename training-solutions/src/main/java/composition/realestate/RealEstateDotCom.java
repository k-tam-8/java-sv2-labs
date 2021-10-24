package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        /*RealEstate realEstate = new RealEstate("Eladó ház", 1_000_000,
                new Details("ez itt a leírás", new Address("Vác",
                        "4322","Ady út",21),54,123));
        RealEstate anotherRealEstate = new RealEstate("Eladó kutyaól", 5000,
                new Details("ez is egy leírás", new Address("Érd",
                        "3456","DC utca",2),4,2));
        System.out.println(realEstate.toString());*/
        Address address = new Address("Vác", "1454","x út",10);
        Details details = new Details("ez a leírás", address, 45,23);
        RealEstate realEstate = new RealEstate("Ház eladó",4500000,details);
        System.out.println(realEstate.toString());
    }
}
