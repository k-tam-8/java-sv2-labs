package controlselection.accents;

public class WithouAccents {
    public char accentsCheck(char charact) {
        char krkt;
        switch (charact) {
            case 'á':
                krkt = 'a';
                break;
            case 'é':
                krkt = 'e';
                break;
            case 'í':
                krkt = 'i';
                break;
            case 'ö', 'ő', 'ó':
                krkt = 'o';
                break;
            case 'ü', 'ű':
                krkt = 'u';
                break;
            default:
                krkt = charact;
        }
        return krkt;
    }

    public static void main(String[] args) {
        WithouAccents withouAccents = new WithouAccents();
        System.out.println(withouAccents.accentsCheck('k'));
        System.out.println(withouAccents.accentsCheck('í'));
    }
}
