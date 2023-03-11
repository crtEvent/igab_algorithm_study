package doit.ch04_정렬.sec01_버블정렬.p2750_수정렬하기_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02_BubbleSort_2 {

    // 약간의 리팩토링
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        for(int i = 0; i < N-1; i++) {
            for(int j = 0; j < N-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 출력
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }
}
