package chapter02;
/**
 * i와 j의 위치에 있는 값을 바꿉니다
 */
public class SelectionSort
{
    public static void swapElements(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        // 모든 연산이 상수 시간이므로 전체 메서드가 상수 시간(입력 크기에 의존하지 않음)
    }

    /**
     * start로부터 시작하는 최솟값의 위치를 찾고 (start 포함) 배열의 마지막 위치로 갑니다.
     */
    public static int indexLowest(int[] array, int start){
        int lowIndex = start;
        for (int i = start; i < array.length ; i++){
            if(array[i] < array[lowIndex])
                lowIndex = i;
        }
        return lowIndex;
        //start 인자에 따라 반복문 즉 n-1회의 실행이 되기 때문에 선형
    }

    /**
     * 선택 정렬을 사용하여 요소를 정렬합니다.
     */
    public static void selectionSort(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
        //반복문*반복문 > 이차
    }
}

// 빅오 표기법
// 상수 시간 알고리즘은 O(1) 이라는 집합에 속함
// 선형 알고리즘은 O(n) 이라는 집합에 속함
// 이차 알고리즘은 O(n^2) 이라는 알고리즘에 속함