# p1427 소트인사이드;
- [https://www.acmicpc.net/problem/1427](https://www.acmicpc.net/problem/1427)

## String 문자열을 숫자 배열로 바꾸는 방법
```java
        /* 책에 있는 방법 */
        String str = "123456";

        int[] A = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }
```
```java
        /* 내가 한 방법 */
        String input = "123456";
        int N = Integer.parseInt(input);
        int[] arr = new int[input.length()];

        for(int i = input.length() - 1; i >= 0; i--) {
            arr[i] = N % 10;
            N = N / 10;
        }
```
```java
        /* GTP가 알려준 방법 */
        String input = "123456";
        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = Character.getNumericValue(input.charAt(i));
        }
```
