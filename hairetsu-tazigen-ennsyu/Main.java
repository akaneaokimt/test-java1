public class Main {
    public static void main(String[] args) {
       int[][] scores = new int [4][3];
       scores [0][0] = 20;
       scores [0][1] = 50;
       scores [0][2] = 60;
       scores [1][0] = 30;
       scores [1][1] = 60;
       scores [1][2] = 70;
       scores [2][0] = 45;
       scores [2][1] = 60;
       scores [2][2] = 80;
       scores [3][0] = 35;
       scores [3][1] = 40;
       scores [3][2] = 50;
       
       for (int i = 0; i < scores.length; i++) {
       for (int j = 0; j < scores[i].length; j++)
       System.out.println("社員" + (i + 1) + "の" + (j + 1) + "回目の点数は" + scores[i][j] + "点です。");
       }
    }
}