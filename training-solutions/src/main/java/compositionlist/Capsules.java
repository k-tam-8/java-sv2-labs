package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> capsules = new ArrayList<>();

    public void addLast(String capsule){
        this.capsules.add(capsule);
    }
    public void addFirst(String capsule){
        this.capsules.add(0,capsule);
    }
    public void removeFirst(){
        this.capsules.remove(0);
    }
    public void removeLast(){
        this.capsules.remove(capsules.size()-1);
    }
    public List<String> getColors(){
        return capsules;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addFirst("fekete");
        capsules.addFirst("fehér");
        capsules.addFirst("barna");
        capsules.addFirst("lila");
        capsules.addLast("piros");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
