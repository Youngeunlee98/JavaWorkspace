package _0323;

public class Middle {
    /*
    1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.

    2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
         사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.

    3. 처음에 은행에 맡긴 돈은 10000원입니다
       금리는 연 10%입니다
       복리이자로 계산했을 때 10년후 얼마가 될까요?

    4. 재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.


     */

    public static void main(String[] args) {
        // 1

        StringBuffer sb1 = new StringBuffer(30); //크기 30 지정
        sb1.append("hello"); //문자열 담음

        int length = sb1.length();

        while (length < 30) {
            if (length % 3 == 0) {
                sb1.append('b');
            } else if (length % 3 == 1) {
                sb1.append('i');
            } else {
                sb1.append('t');
            }
            length++;
        }
        System.out.println(sb1.toString());
    }


    }


