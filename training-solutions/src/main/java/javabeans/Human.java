package javabeans;

public class Human {
    private String name;
    private Double weight;
    private int iq;

    public Human(String name, Double weight, int iq) {
        this.name = name;
        this.weight = weight;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public int getIq() {
        return iq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
