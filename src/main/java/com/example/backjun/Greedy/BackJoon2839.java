package com.example.backjun.Greedy;

import java.util.Scanner;

public class BackJoon2839 {
    public static void main(String args[]) {

        // https://www.acmicpc.net/problem/2839 백준 2839번 문제
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int temp = 0; // 나머지 담을 변수
        int count = 0; // 몫을 담을 값

        // 풀이 시작
        count = number / 5;
        temp = number % 5;

        if(temp == 0 ){
            System.out.println(count);
        }else if(temp % 3 == 0){
            count += temp/3;
            System.out.println(count);
        }else{

            // 받은 number값을 5로 나누고, 3으로도 나눳을떄 나머지가 0으로 떨어지지 않을 때
            // number의 값이 5미만일 경우 위에서 계산한 5의 몫을 빼고 다시 나머지에 5를 더하는 식을 못하도록 i값 세팅.
            for(int i = 0 ; i < number / 5; i++) {
                count -= 1;
                temp += 5;
                // 나머지에서 다시 3을 나눠 0이 떨어질때 값 출력 및 메소드 종료
                if(temp % 3 == 0){
                    count += temp / 3;
                    System.out.println(count);
                    return;
                }
            }
            // 위의 방법으로 해결이 안됫을 경우 답은 -1 밖에 없음
            System.out.println(-1);
        }

    }

}
