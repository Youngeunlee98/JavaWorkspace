package _0324;

import _0317.Add;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class M {
    /*
    1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
     parse() 메소드를 이용하면 String -> Calendar로 변환가능)

2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.

3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
     시 분 초 형태로 나타내시오.
     */

    public static void main(String[] args) throws ParseException {

        // 사용자로부터 날짜 입력 받기
        String userInput = "2023-03-24";

        // SimpleDateFormat 객체 생성
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 사용자 입력값을 Calendar 객체로 변환
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(userInput));

        // 3일 뒤로 변경
        calendar.add(Calendar.DATE, 3);

        // 변경된 날짜 출력
        String output = sdf.format(calendar.getTime());
        System.out.println(output); // 2023-03-27
    }





    }

