package ru.skvrez.stepikalg;

import java.util.Scanner;
class Dic {
    char symbl;
    String code;

    public void setCode(String code) {
        this.code = code;
    }

    public void setSymbl(char symbl) {
        this.symbl = symbl;
    }

    public String getCode() {
        return code;
    }

    public char getSymbl() {
        return symbl;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int l = input.nextInt();
        Dic[] arDic = new Dic[k];
        for (int i=0; i<k; i++) {
            Dic dicEl = new Dic();
            dicEl.setSymbl(input.next().charAt(0));
            dicEl.setCode(input.next());
            arDic[i] = dicEl;
        }
        StringBuilder decodStr = new StringBuilder(input.next());
        StringBuilder outStr = new StringBuilder();
        while (decodStr.length() > 0) {
            for (Dic c: arDic
                 ) {
                if ((c.getCode().length()<=decodStr.length()) && (decodStr.substring(0,c.getCode().length()).contentEquals(c.getCode()))) {
                    outStr.append(c.getSymbl());
                    decodStr.delete(0, c.getCode().length());
                    break;
                }
            }
        }
        System.out.println(outStr);
    }
}
