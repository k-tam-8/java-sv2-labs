package introexceptionthrowjunit4;

public class Tank {
    private int angle=80;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber){
        this.angle+=angleNumber;
        if (this.angle<0 || this.angle>160){
            throw new IllegalArgumentException("Illegal movement!");
        }
    }
}
