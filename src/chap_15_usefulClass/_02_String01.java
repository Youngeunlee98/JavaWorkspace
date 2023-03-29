package chap_15_usefulClass;

public class _02_String01 {
    public static void main(String[] args) {
        //문자열 객체 생성
        String str1 = "bitcamp";
        String str2 = new String("bitcamp");

        char[] chArr = {'b','i','t','c','a','m','p'};

        String str3 = new String(chArr);

        //같은 문자열인지 비교
        if(str1.equals(str3) && str2.equals(str3)){
            System.out.println("str1,2,3은 같은 문자열 입니다.");
        }else {
            System.out.println("str1,2,3은 다른 문자열 입니다.");
        }

        //인덱스의 문자 맞는지 확인하기.
        char ch = str1.charAt(4);
        System.out.println("str1의 index4에 있는 문자는 " + ch + "입니다.");

        //두 문자열 같은지 비교
        if(str1.compareTo(str2) == 0) {
            System.out.println("같습니다.");
        }else {
            System.out.println("다릅니다.");
        }
        //두 문자열 붙이기
        System.out.println(str1.concat(str2));
    }

}
