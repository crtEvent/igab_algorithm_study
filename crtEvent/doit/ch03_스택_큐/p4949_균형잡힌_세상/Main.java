package doit.ch03_스택_큐.p4949_균형잡힌_세상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    // https://www.acmicpc.net/problem/4949
    // 1. (, [만 남기고 다 지우기 - 어떻게 하느지 모름
    // 2. 스택에 순서대로 넣기
    // 3. 넣으면서 이전 값과 비교하기
    // 4. 매칭되는 것이 있으면 넣지 않고 stack에서 제거
    // 5. stack size가 0이면 yes

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String sentence = br.readLine();

            if(sentence.equals(".")){
                System.out.println(sb.toString());
                System.exit(0);
            }

            logic(sentence, sb);
        }

    }

    public static void logic(String sentence, StringBuilder sb) {
        char[] arr = sentence.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < arr.length; i++) {
            switch(arr[i]) {
                case '(':
                case '[':
                    stack.addFirst(arr[i]);
                    break;
                case ')':
                    if(stack.isEmpty()){
                        sb.append("no"+System.lineSeparator());
                        return;
                    } else if(stack.peekFirst() == '(') {
                        stack.removeFirst();
                    } else {
                        stack.addFirst(arr[i]);
                    }
                    break;
                case ']':
                    if(stack.isEmpty()){
                        sb.append("no"+System.lineSeparator());
                        return;
                    } else if(stack.peekFirst() == '[') {
                        stack.removeFirst();
                    } else {
                        stack.addFirst(arr[i]);
                    }
                    break;
            } // end - switch

        } // end - for

        if(stack.isEmpty()) {
            sb.append("yes"+System.lineSeparator());
        } else {
            sb.append("no"+System.lineSeparator());
        }
    }
}
