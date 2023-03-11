package doit.ch04_정렬.sec02_선택정렬.p1427_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02_Book {

    // 책에 있는 예제 코드
    // 132ms

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] A = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        for (int i = 0; i < str.length(); i++) {
            int Max = i;
            for (int j = i + 1; j < str.length(); j++) {
                if (A[j] > A[Max])  //내림차순이므로 최대 값을 찾음
                    Max = j;
            }
            if (A[i] < A[Max]) { // i의 값과 Max값 중 MAx가 더 크면 swap
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }

        StringBuilder sb = new StringBuilder(str.length());
        for(int num : A) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}
