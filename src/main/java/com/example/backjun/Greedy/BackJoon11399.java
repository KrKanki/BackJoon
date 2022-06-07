package com.example.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon11399 {
    public static void main(String[] args) throws IOException {
        // https://www.acmicpc.net/problem/11399

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        List<Integer> time = new ArrayList<>();

        // 받아준 값을 List에 넣어주는 작업
        while(str.hasMoreTokens()){
            time.add(Integer.valueOf(str.nextToken()));
        }
        // List 의 값을 소팅한다.
        Collections.sort(time);
        int sum = 0;
        int answer  = 0;

        for (int i : time){
        // 기존에 더한값에 계속 더하고 있음으로 sum에 담아주고 answer에 답을 입력.
            sum += i;
            answer += sum;
        }

        System.out.println(answer);
    }
}
