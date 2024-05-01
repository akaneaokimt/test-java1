public class Main {
    public static void main(String[] args) {
        while(true) {
        System.out.println("1～100の整数を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        
        if (input >= 1 && input <= 100) {
        if (input % 7 == 0) {
            System.out.println("処理を終了しました");
            break;
        }
      }else
            System.out.println("1～100の整数を入力してください");
        }
    }    
}