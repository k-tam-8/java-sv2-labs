package cmdarguments.flowers;

public class CmdMain {
    public static void main(String[] args) {
        System.out.println(args.length);
        int i=1;
        for (String outs: args) {
            System.out.println(i + ". elem: " + outs);
            i++;
        }
    }
}
