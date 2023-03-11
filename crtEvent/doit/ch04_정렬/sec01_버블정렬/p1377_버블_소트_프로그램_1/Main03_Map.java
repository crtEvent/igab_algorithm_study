package doit.ch04_정렬.sec01_버블정렬.p1377_버블_소트_프로그램_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main03_Map {

    // Map을 활용하여 해결
    // - 1272ms

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> A = new LinkedHashMap<>();
        for(int i = 0; i < N; i++) {
            A.put(i, Integer.parseInt(br.readLine()));
        }

        List<Map.Entry<Integer, Integer>> sortedA = A.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toList());

        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < sortedA.get(i).getKey() - i) {
                max = sortedA.get(i).getKey() - i;
            }
        }
        System.out.println(max + 1);
    }
}
