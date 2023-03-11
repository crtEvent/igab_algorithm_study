# [BOJ] 버블 소트 프로그램 1 / 1377 / 골드2
- https://www.acmicpc.net/problem/1377

## `cout << i << '\n';` 뭘 뜻하는 걸까? - 출력
- cout은 문자열, 수, 문자 등 다양한 데이터형을 서식문자 없이 자동으로 출력
  - printf의 %d나 %f 처럼 출력타입을 지정해주지 않아도 된다는 뜻
- cout에서 << 표시는 삽입 연산자
  - << 연산자 뒤에 자신이 출력할 대상을 넣어 준다
- 개행을 할 때에는 조정자 endl나 '\n'을 사용

## sort() 메서드를 사용할 수 있는 것들
- `Arrays.sort(Object[] obj)`
- `Collection.sort(List<T> list)`

## Comparator 쉽게 쓰는 법
- `Comparator.comparing(Function keyExtractor)`
- `Comparator.comparingInt(Function keyExtractor)`
- `Comparator.comparingLong(Function keyExtractor)`
- `Comparator.comparingDouble(Function keyExtractor)`
- 내림차순은 뒤에 `.reversed()`만 붙여주면 된다

## LinkedHashMap() 활용법
- Map을 value에 값을 넣고 value를 기준으로 정렬한다!
  - 정렬 방법이 복잡해서 비추천.
- key는 중복이 안되기 때문에 사용 불가
