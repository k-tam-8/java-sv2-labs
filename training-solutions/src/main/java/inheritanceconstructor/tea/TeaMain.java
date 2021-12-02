package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("fekete tea", 430);
        HerbalTea herbalTea = new HerbalTea("lipton", 500);
        System.out.println(tea.getName());
        System.out.println(tea.getPrice());
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}
