import java.util.Scanner;

import static java.lang.System.out;

public class Son {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Son kiriting:");
        int son = sc.nextInt();
        if (son > 0){
            readingNumber(son);
        }
        else if (son == 0) {
            out.println("nol");
        }
        else {
            out.println("manfiy son kiritilgan");
        }
    }

    private static void readingNumber(int n) {
        boolean isOne = true;
        boolean isTen = false;
        boolean isHundred = false;
        String result = "";
        int a;
        for(int i = 1; i <= 3; i++) {
            a = n % 10;
            if (isOne) {
                result = one(a);
                isTen = true;
                isOne = false;
                n /= 10;
            }
            if (isTen) {
                result = ten(a) + " " + result;
                isHundred = true;
                isTen = false;
                n /= 10;
            }
            if (isHundred) {
                result = hundred(a) + " yuz " + result;
                isHundred = false;
                isOne = true;
                n /= 10;
            }
        }
        System.out.println(result);
    }

    private static String one(int i) {
        String numOne = "";
        switch(i){
            case 1-> numOne = "bir";
            case 2-> numOne = "ikki";
            case 3-> numOne = "uch";
            case 4-> numOne = "to'rt";
            case 5-> numOne = "besh";
            case 6-> numOne = "olti";
            case 7-> numOne = "yetti";
            case 8-> numOne = "sakkiz";
            default->numOne = "to'qqiz";
        }
        return numOne;
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







//    private static boolean checking(int son) {
//        boolean check = true;
//        if (son == 0) {
//            System.out.println("nol");
//            check = false;
//        }
//        return check;
//    }
}
