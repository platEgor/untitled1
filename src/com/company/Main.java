package com.company;

public class Main {

    public static void main(String[] args) {
	    int c = 3;
        int d = 4;
        int a = 3;
        int b = 25;
        int r = 1;

        int nod = c;
        int d1 = d;
        while(r>0){
            r = nod%d1;
            nod = d1; d1 = r;
        }
        int nok = c*d/nod;

        int x;
        if(a == c) x = a;
        else x = c - a%c + a;
        System.out.println(x);

        int y;
        if(b==c) y = b;
        else y = b - b%c;
        System.out.println(y);

        int s1 = (x+y)*((y-x)/c+1)/2;
        System.out.println(s1);

        int x1;
        if(x==nok) x1=x;
        else x1 = nok - x%nok + x;
        System.out.println(x1);

        int y1;
        if(y==nok) y1 = y;
        y1 = y - y%nok;
        System.out.println(y1);
        int s2 = (x1+y1)*((y1-x1)/nok+1)/2;
        System.out.println(s2);
        System.out.println(s1-s2);
    }
}