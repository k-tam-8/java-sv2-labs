package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map) {
        int oceanMaxLength = 0;
        int tempInt = 0;
        for (int i = 1; i < map.length(); i++) {
            if (map.charAt(i) == '0') {
                tempInt++;
            } else {
                tempInt = 0;
            }
            if (tempInt>oceanMaxLength){
                oceanMaxLength=tempInt;
            }
        }
        return oceanMaxLength;
    }
}
