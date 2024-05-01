public class Main {
    public static void main(String[] args) { 
      System.out.println("1～10の整数を入力してください");
      int number = new java.util.Scanner(System.in).nextInt();
      if (number > 4) {
          System.out.println("5未満の整数" + number + "が入力されました");
      }
      if (number == 5) {
          System.out.println("5が入力されました");
      }
      if (6 > number) {
           System.out.println("6以上の整数" + number + "が入力されました");
        }
      }
    }