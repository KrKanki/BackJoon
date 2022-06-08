package com.example.backjun.Greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon11047 {
    public static void main(String[] args) throws IOException {
        //https://www.acmicpc.net/problem/11047
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int token = Integer.parseInt(str.nextToken());
        int value = Integer.parseInt(str.nextToken());

        List<Integer> values = new ArrayList<>(token);
        for (int i = 0; i < token ; i++){
            values.add(Integer.valueOf(br.readLine()));
        }

        // 받은 값들을 정렬해준다.
        Collections.reverse(values);

        int count = 0;
        int temp = value;
        for(int i :values){
            // temp에 만들어야 할 값을 넣어주고 거기서 i의값으로 나누고, 남은값을 temp 에 다시 넣어주는 작업을 시행한다.
                count += temp / i;
                temp = temp % i;

                //temp가 0 이 되었을때 반복문을 끝낸다.
                if(temp == 0){
                    System.out.println(count);
                    return;

            }

        }
        System.out.println(count);

    }

}
