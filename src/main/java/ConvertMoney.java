import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vnd = 23000;
        int usd,result;
        System.out.println("Mời bạn nhập số tiền USD:");
        usd = scanner.nextInt();
        result = usd * vnd;
        System.out.println(usd + " (USD) " + " = " + result + " (VND)");
    }
}
