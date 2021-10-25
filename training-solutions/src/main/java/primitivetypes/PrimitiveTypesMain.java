package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a=2;
        Integer b = 2; //autobox
        Integer c =a; //autobox
        Integer d=b;
        Integer e=Integer.valueOf(2);
        int f=Integer.valueOf(2); //autounbox
        int g=Integer.valueOf(a);//autounbox
        int h = Integer.valueOf(c);
        int i = Integer.parseInt("2");
        Integer j=Integer.parseInt("2"); //autobox
        System.out.println(a+" "+ b+" "+ c+" "+ d+" "
                + e+" "+ f+" "+ g+" "+ h+" "+ i+" "+ j);
        ////////////////////////////////////////////////
        boolean k=true;
        Boolean l=true; //autobox
        boolean m=Boolean.valueOf(true); //autounbox
        Boolean n=Boolean.valueOf(true);
        boolean o=Boolean.parseBoolean("TrUe"); //autounbox
        Boolean p=Boolean.parseBoolean("TrUe");
        boolean q=Boolean.parseBoolean("TreU"); //autobox
        Boolean r=Boolean.parseBoolean("TreU");
        System.out.println(k+" "+ l+" "+ m+" "+ n+" "
                + o+" "+ p+" "+ q+" "+ r);
    }
}
