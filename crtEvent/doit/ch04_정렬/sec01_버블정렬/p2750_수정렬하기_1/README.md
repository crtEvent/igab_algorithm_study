# p2750 수 정렬하기 1

## 버블 정렬 과정
```text
N: 5
arr: [5, 2, 3, 4, 1]

i: 0, N-1-i: 4
 j: 0 - [2, 5, 3, 4, 1]
 j: 1 - [2, 3, 5, 4, 1]
 j: 2 - [2, 3, 4, 5, 1]
 j: 3 - [2, 3, 4, 1, 5]
i: 1, N-1-i: 3
 j: 0 - [2, 3, 4, 1, 5]
 j: 1 - [2, 3, 4, 1, 5]
 j: 2 - [2, 3, 1, 4, 5]
i: 2, N-1-i: 2
 j: 0 - [2, 3, 1, 4, 5]
 j: 1 - [2, 1, 3, 4, 5]
i: 3, N-1-i: 1
 j: 0 - [1, 2, 3, 4, 5]

결과: [1, 2, 3, 4, 5]

```

## Stream의 sorted() 는 무슨 정렬 알고리즘을 사용할까? - TimSort
- 삽입(Insertion) 정렬과 병합(Merge) 정렬을 결합하여 만든 정렬
  - 최선의 시간 복잡도: $O(n)$
  - 평균 시간 복잡도: $O(nlogn)$
  - 최악의 시간 복잡도: $O(n\log{n})$
- 삽입정렬은 시간 복잡도가 $O(n^{2})$ 이지만 n이 매우작을때는 $O(n\log{n})$보다 빠르다
- 병합정렬은 $O(nlogn)$, 메모리 공간이 많이 사용되는 단점
- TimSort 방식은 전체를 작은 부분으로 잘라 각각 Insertion sort로 정렬한 뒤 병합하여 개선

[병합 정렬 예시](https://www.daleseo.com/sort-merge/)<br>
[TimSort 설명](https://d2.naver.com/helloworld/0315536)<br>
[Stream의 sorted()가 TimSort 쓴다는 내용](https://stackoverflow.com/questions/38943309/which-algorithm-use-sorted-method-in-stream-interface)<br>

## Arrays.sort() 는 무슨 정렬 알고리즘을 사용할까? - 듀얼피봇 퀵정렬(Dual-Pivot QuickSort)
- 일반적인 퀵정렬과는 다르게 피봇을 2개를 두고 3개의 구간을 만들어 퀵정렬을 진행
- 랜덤 데이터에 대해서 평균적으로 퀵소트 보다 좋은 성능을 낸다

[Arrays와 Collections의 정렬 알고리즘](https://sabarada.tistory.com/138)<br>
[java의 arrays.sort 메서드는 어떤 정렬을 사용할까요?](https://codingdog.tistory.com/entry/java의-arrayssort-메서드는-어떤-정렬을-사용할까요)<br>