import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(sonni(n));
    }

    private static String sonni(int n) {
        String natija = "";
        switch (n){
            case 1-> natija = "bir";
            case 2-> natija = "ikki";
            case 3-> natija = "uch";
            case 4-> natija = "to'rt";
            case 5-> natija = "besh";
            case 6-> natija = "olti";
            case 7-> natija = "yetti";
            case 8-> natija = "sakkiz";
            default -> natija = "to'qqiz";
        }
        return natija;
    }
}
