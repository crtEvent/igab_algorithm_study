package doit.ch04_정렬.sec01_버블정렬.p1377_버블_소트_프로그램_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main04_PracticeComparator {

    // Comparator 부분을 더 쉽게 할 수 없을까?
    // 1800ms
    // 오름차순: Comparator.comparingInt(Data::getValue)
    // 내림차순: Comparator.comparingInt(Data::getValue).reversed()

    static class Data {
        private int value;
        private int index;

        public Data(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Data[] A = new Data[N];
        for(int i = 0; i < N; i++) {
            A[i] = new Data(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(A, Comparator.comparingInt(Data::getValue));

        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < A[i].getIndex() - i) {
                max = A[i].getIndex() - i;
            }
        }
        System.out.println(max + 1);
    }
}
