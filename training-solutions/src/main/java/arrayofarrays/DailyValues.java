package arrayofarrays;

public class DailyValues {
    public int[][] getValues() {
        int[][] dailyArr = new int[12][];
        dailyArr[0]=new int [31];
        dailyArr[1]=new int [28];
        dailyArr[2]=new int [31];
        dailyArr[3]=new int [30];
        dailyArr[4]=new int [31];
        dailyArr[5]=new int [30];
        dailyArr[6]=new int [31];
        dailyArr[7]=new int [31];
        dailyArr[8]=new int [30];
        dailyArr[9]=new int [31];
        dailyArr[10]=new int [30];
        dailyArr[11]=new int [31];
        return dailyArr;
    }

    public static void main(String[] args) {
        DailyValues dailyValues=new DailyValues();
        int[][] dailyArr= dailyValues.getValues();
        for (int i = 0; i < dailyArr.length; i++) {
            for (int f = 0; f < dailyArr[i].length; f++) {
                System.out.print(dailyArr[i][f]);
            }
            System.out.println();
        }
    }
}
