package methodstructure.bmi;

public class BodyMass {
    private int weightInKg;
    private double heightInM;

    public int getWeightInKg() {
        return weightInKg;
    }

    public double getHeightInM() {
        return heightInM;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public void setHeightInM(double heightInM) {
        this.heightInM = heightInM;
    }

    public double getBodyMassIndex() {
        double i = weightInKg / (heightInM * heightInM);
        return (double) weightInKg / (heightInM * heightInM);
    }

    public BmiCategory getBody() {
        if (getBodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        } else if (getBodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass other) {
        return this.getBodyMassIndex() < other.getBodyMassIndex();
    }

}
