package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix="Hello ";
        String name="John Doe";
        String message = prefix+name;
        message=message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(prefix +" "+ name+" "+ message +" "+ b +" "+c);
        String empty="";
        System.out.println(empty + empty);
        System.out.println(empty.length());
        System.out.println("Abcde".length());
        //System.out.println("Abcde".substring(0,1) + ", " + "Abcde".substring(2,3));
        System.out.println("Abcde".charAt(0) + ", " + "Abcde".charAt(2));
        System.out.println("Abcde".substring(0,3));



    }
}
