package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections() {
        int steps = 1;
        for (int i = 10; i < 361; i += 10 * steps) {
            steps++;
        }
        return steps-1;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections() + " irányváltoztatás");
    }
}
