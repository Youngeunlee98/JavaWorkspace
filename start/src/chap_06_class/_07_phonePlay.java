package chap_06_class;

import chap_06_class.phone.PhoneInfo;

import java.util.Scanner;

public class _07_phonePlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneInfo phone = new PhoneInfo();



            //switch~case문에서 break; 시 switch~case만 종료되기
            //때문에 while문을 종료시킬 플래그
            boolean isExit = false;

            while(true) {
                System.out.println("-----연락처 목록-----");
                System.out.println("1. 정보 입력");
                System.out.println("2. 모든 정보 출력");
                System.out.println("3. 인덱스로 정보 검색");
                System.out.println("4. 종료");

                //nextInt는 enter 값을 처리하지 못하기 때문에
                //숫자 입력 후 엔터를 누르면 엔터값이 남아있다.
                int userInput = sc.nextInt();

                switch(userInput) {
                    case 1:
                        System.out.print("이름을 입력하세요. : ");
                        String name = sc.next();
                        sc.nextLine();
                        System.out.print("번호를 입력하세요. : ");
                        String phoneNum = sc.nextLine();

                        PhoneInfo.insertPhoneNum(name, phoneNum);
                        break;
                    case 2:
                        PhoneInfo.printAllPhoneNum();
                        break;
                    case 3:
                        while(true) {
                            System.out.print("조회하고 싶은 번호를 입력하세요.(1~100)");
                            int index = sc.nextInt();

                            if(index < 1 || index > 100) {
                                System.out.println("1~100 안의 값을 입력하세요.");
                                continue;
                            } else {
                                PhoneInfo.printPhoneNum(index);
                                break;
                            }
                        }
                        break;
                    case 4:
                        isExit = true;
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                        continue;
                }

                if(isExit) {
                    break;
                }
            }

            sc.close();
        }


    }




















       /* System.out.println("전화번호를 입력하세요: ");
        String number = sc.nextLine();
        phone.insertPhoneNum(name,number);

        System.out.println("조회하고 싶은 번호를 입력하세요.");
        int num = sc.nextInt();
        phone.printPhoneNum(num);

        System.out.println("모든 정보를 확인하시겟습니까? 네 = 0, 아니오 = 1");
        String keep = sc.nextLine();
        phone.printAllPhoneNum();

        */


