package _0320;//package edu.exam09.homework;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {


    /*

    class Median {
	static int med3(int a, int b, int c) {
		이 메서드를 완성하세요
		if(a >= b) {
        if(c < b) {
            return b;
        } else if(c < a) {
            return c;
        } else {
            return a;
        }
    } else if(c >= b) {
        return b;
    } else if(a >= c) {
        return a;
    } else {
        return c;
    }
}

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을구합니다.");
        System.out.print("a의 값：");
        int a = stdIn.nextInt();
        System.out.print("b의 값：");
        int b = stdIn.nextInt();
        System.out.print("c의 값：");
        int c = stdIn.nextInt();



        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");

        stdIn.close();
    }
}
*/
    static int med3(int a, int b, int c) {
        int A = a-(a+b+c)/3;
        int B = b-(a+b+c)/3;
        int C = c-(a+b+c)/3;

        if(A<0)
            A = -A;

        if(B<0)
            B = -B;

        if(C<0)
            C = -C;

        if(A<=B && A<=C)  {
            return a;
        }

        else if(B<=A && B<=C) {
            return b;
        }

        else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을구합니다.");
        System.out.print("a의 값：");
        int a = stdIn.nextInt();
        System.out.print("b의 값：");
        int b = stdIn.nextInt();
        System.out.print("c의 값：");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
