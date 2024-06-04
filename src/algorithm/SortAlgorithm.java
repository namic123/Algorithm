package algorithm;

import java.util.Arrays;

public class SortAlgorithm {

    /* 선택 정렬 알고리즘 */
    /* 선택 정렬은 배열을 순회하면서 "가장 작은(또는 가장 큰)요소를 선택해서 앞쪽 순서대로 정렬하는 알고리즘 */
    public int[] selectionSort(int[] array){
        int n = array.length;

        int[] sortedArray = Arrays.copyOf(array, n);

        int count = 0;
        System.out.println("Selection Sort Algorithm");

        // 배열의 모든 요소를 순회
        for(int i = 0; i < n -1; i++){
            // 현재 부분 배열에서 가장 작은 요소를 찾기
            int minIndex = i;
            for(int j = i +1; j <n; j++){
                if(sortedArray[j] < sortedArray[minIndex]){
                    minIndex = j;
                }
                count++;
            }
            // 가장 작은 요소를 현재 위치로 교환
            int temp = sortedArray[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("count = " + count);
        return array;
    }


    /* 버블 정렬 알고리즘 */
    /* 버블 정렬은 "인접한 두 요소를 비교"하여 순서가 맞지 않으면 교환하는 방식으로 배열을 정렬 */
    public int[] bubbleSort(int[] array, String direction) {
        System.out.println("Bubble Sort Algorithm");
        int count = 0;

        int n = array.length; // 배열의 길이

        int[] sortedArray = Arrays.copyOf(array, n);

        if (direction.equals("left")) {
            // 배열의 왼쪽 -> 오른쪽 순회 (큰거를 오른쪽으로 보냄)
            for (int i = 0; i < n - 1; i++) {
                boolean sorted = true;
                // 마지막 i개의 요소는 이미 정렬되어 있으므로 제외
                for (int j = 0; j < n - i - 1; j++) {
                    // 현재 요소가 다음 요소보다 크면 두 요소를 교환
                    if (array[j] > array[j + 1]) {
                        // 요소 교환
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        count ++;
                    }
                }
            }
            System.out.println("count = " + count);
        }else{
            // 배열의 왼쪽 <- 오른쪽 순회 (작은거를 왼쪽으로 보냄)
            for(int i = 0; i < n-1; i++){
                // 배열의 끝에서 시작하여 첫 번째 요소까지 비고
                for (int j = n-1 ; j > i ; j--) {
                    // 현재 요소가 이전 요소보다 작으면 교환
                    if(array[j] < array[j-1]){
                        int temp = array[j];
                        array[j] = array[j-1];
                        array[j-1] = temp;
                    }
                }
            }
        }

        return array;
    }

    /* 삽입 정렬 */
    /* 삽입 정렬은 배열을 정렬하는 동안 "이미 정렬된 부분 배열을 유지"하면서 정렬되지 않은 요소들을 하나씩 그 위치에 삽입하는 방식 */
    public int[] insertionSort(int[] array){
        int n = array.length;

        System.out.println("Insertion Sort Algorithm");
        int count = 0;

        int[] sortedArray = Arrays.copyOf(array, n);

        // 두 번째 요소부터 시작해서 각 요소를 정렬된 부분 배열에 삽입
        for(int i = 1; i < n ; i ++){
            int key = array[i]; // 현재 삽입할 dyth
            int j = i - 1;

            // 현재 요소보다 큰 요소들을 오른쪽으로 이동
            while (j >= 0 && array[i] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }

            // 현재 요소를 올바른 위치에 삽입
            array[j + 1] = key;
        }
        return array;
    }

    /* 셸 정렬 */
    /* 리스트를 특정 간격으로 나눠서 부분 리스트를 생성하고, 각 부분 리스트를 삽입 정렬을 이용해 정렬한 후, */
    /* 간격을 줄여가며 과정을 반복하여 최종적으로 전체 리스트를 정렬하는 알고리즘 */
    public int[] shellSort(int[] array){
        int n = array.length;

        int[] sortedArray = Arrays.copyOf(array, n);

        // 초기 간격을 n/2로 설정
        for(int gap = n / 2; gap > 0; gap /= 2){
            // 간격에 따른 부분 리스트들을 삽입 정렬
            for(int i = gap; i < n; i++){
                int temp = sortedArray[i];
                int j;
                for(j = i; j >= gap && sortedArray[j - gap] > temp; j -= gap){
                    sortedArray[j] = sortedArray[j - gap];
                    System.out.println("sortedArray[j] = " + sortedArray[j]);
                }
                sortedArray[j] = temp;
            }
        }
        return sortedArray;
    }

    // 배열 출력을 위한 함수
    public static void printUnsortedArray(int[] array){
        System.out.print("Unsorted array : ");
        // 배열의 모든 요소 출력
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
