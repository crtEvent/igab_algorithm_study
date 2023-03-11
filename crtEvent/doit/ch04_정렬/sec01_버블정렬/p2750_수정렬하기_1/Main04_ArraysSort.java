package doit.ch04_정렬.sec01_버블정렬.p2750_수정렬하기_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main04_ArraysSort {

    // Arrays.sort() 로 정렬
    // 176ms

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(arr);

        // 출력
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }

}
