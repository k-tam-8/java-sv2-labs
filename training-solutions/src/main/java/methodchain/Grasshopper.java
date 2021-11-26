package methodchain;

public class Grasshopper {
    private int position;

    public void moveFromZeroToThreeWithFiveHops(){
      //  Grasshopper gh = new Grasshopper().
                hopOnce(Direction.POSITIVE).
                hopOnce(Direction.POSITIVE).
                hopOnce(Direction.NEGATIVE).
                hopOnce(Direction.POSITIVE).
                hopOnce(Direction.POSITIVE);
    }

    public Grasshopper hopOnce(Direction direction){
        if (direction.equals(Direction.NEGATIVE)){
            position--;
        } else {
            position++;
        }
        return this;
    }

    public int getPosition() {
        return position;
    }
}
