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

    private static void readingNumber(int son) {
        boolean isOne = true;
        boolean isTen = false;
        boolean isHundred = false;
        String result = "";
        for(int i = 1; i <= 3; i++) {
            if (isOne) {
                result = one(son % 10) + " " + result;
                isTen = true;
                isOne = false;
                son /= 10;
            }
            if (isTen) {
                result = ten(son % 10) + " " + result;
                isHundred = true;
                isTen = false;
                son /= 10;
            }
            if (isHundred) {
                result = ten(son % 10) + " yuz " + result;
                isHundred = false;
                isOne = true;
                son /= 10;
            }
        }
        out.println(result);
    }

    private static String one(int i) {
        String numResult = "";
        switch(i){
            case 1: numResult = "bir";
            case 2: numResult = "ikki";
            case 3: numResult = "uch";
            case 4: numResult = "to'rt";
            case 5: numResult = "besh";
            case 6: numResult = "olti";
            case 7: numResult = "yetti";
            case 8: numResult = "sakkiz";
            default:numResult = "to'qqiz";
        }
        return numResult;
    }
    private static String ten(int i) {
        int son = i;
        String numResult = "";
        switch(son){
            case 1: numResult = "o'n";
            case 2: numResult =  "yigirma";
            case 3: numResult =  "o'ttiz";
            case 4: numResult =  "qirq";
            case 5: numResult =  "ellik";
            case 6: numResult =  "oltmish";
            case 7: numResult =  "yetmish";
            case 8: numResult =  "sakson";
            default:numResult =  "to'qson";
        }
        final var numResult1 = numResult;
        return numResult1;
    }
    private static String hundred(int i) {
        String numResult = "";
        switch(i){
            case 1: numResult = "bir";
            case 2: numResult = "ikki";
            case 3: numResult = "uch";
            case 4: numResult = "to'rt";
            case 5: numResult = "besh";
            case 6: numResult = "olti";
            case 7: numResult = "yetti";
            case 8: numResult = "sakkiz";
            default:numResult = "to'qqiz";
        }
        return numResult;
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
