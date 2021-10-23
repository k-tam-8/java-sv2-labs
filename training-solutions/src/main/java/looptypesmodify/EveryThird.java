package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public int[] changeToZero (int[] numbers){
    for (int i= numbers.length-1;i>=0;i-=3) {
        numbers[i] = 0;
    }
    return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {5,9,8,7,1,5,4,9,5,7,5,8,6,3,14,5,4};
        EveryThird everyThird = new EveryThird();
        everyThird.changeToZero(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
