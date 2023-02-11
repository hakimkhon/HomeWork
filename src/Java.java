import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(one(n));
        System.out.println(result(n));
    }

    private static String result(int a) {
        String natija = "";
        natija = one(a) + " ok";
        natija = ten(a) + " ten";
        return natija;
    }

    private static String one(int i) {
        String natija = "";
        switch (i){
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
    private static String ten(int i) {
        String numTen = "";
        switch(i){
            case 1-> numTen = "o'n";
            case 2-> numTen = "yigirma";
            case 3-> numTen = "o'ttiz";
            case 4-> numTen = "qirq";
            case 5-> numTen = "ellik";
            case 6-> numTen = "oltmish";
            case 7-> numTen = "yetmish";
            case 8-> numTen = "sakson";
            default->numTen = "to'qson";
        }
        return numTen;
    }
    private static String hundred(int i) {
        String numHundred = "";
        switch(i){
            case 1-> numHundred = "bir";
            case 2-> numHundred = "ikki";
            case 3-> numHundred = "uch";
            case 4-> numHundred = "to'rt";
            case 5-> numHundred = "besh";
            case 6-> numHundred = "olti";
            case 7-> numHundred = "yetti";
            case 8-> numHundred = "sakkiz";
//            default->numHundred = "to'qqiz";
        }
        return numHundred;
    }
}
