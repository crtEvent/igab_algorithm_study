package doit.ch04_정렬.sec01_버블정렬.p1377_버블_소트_프로그램_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01_BubbleSort {

    // 예시 코드 그대로 작성
    // 시간 초과

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        boolean changed = false;
        for(int i = 0; i < N - 1; i++) {
            changed = false;
            for(int j = 0; j < N - 1 - i; j++) {
                if(A[j] > A[j+1]) {
                    changed = true;
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
            if(!changed) {
                System.out.println(i+1);
                break;
            }
        }
    }

}
