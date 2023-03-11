package doit.ch04_정렬.sec02_선택정렬.p1427_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {

    // GTP가 알려준 String 문자열을 숫자 배열로 바꾸는 방법
    // 120ms

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = Character.getNumericValue(input.charAt(i));
        }

        for(int i = 0; i < arr.length; i++) {
            int max = 0;
            int maxIndex = i;
            for(int j = i; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            arr[maxIndex] = arr[i];
            arr[i] = max;
        }

        StringBuilder sb = new StringBuilder(input.length());
        for(int num : arr) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}
