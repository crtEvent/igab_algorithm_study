package doit.ch04_정렬.sec01_버블정렬.p2750_수정렬하기_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01_BubbleSort {
    // 버블정렬 사용
    //  - 어떤 경우에도 O(n^2)의 시간복잡도를 갖는다.
    // 교재의 설명을 보고 처음 짠 코드

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
                int a = arr[j];
                int b = arr[j+1];
                if(a > b) {
                    int temp = a;
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
