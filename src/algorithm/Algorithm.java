package algorithm;

public class Algorithm {
    public static void main(String[] args) {
        int[] exampleArray = {64, 34, 25, 12, 22, 11, 90};
        SortAlgorithm sortAlgorithm = new SortAlgorithm();

        // 선택 정렬
        // 가장 작은(또는 가장 큰)요소를 선택하여 앞쪽부터 순서대로 정렬
//        printArray(sortAlgorithm.selectionSort(exampleArray));

        // 버블 정렬
        // 왼쪽은 큰거를 오른쪽으로 보냄. 오른쪽은 작은거를 왼쪽으로 보냄
//        printArray(sortAlgorithm.bubbleSort(exampleArray, "left"));
//        printArray(sortAlgorithm.bubbleSort(exampleArray, "right"));

        // 삽입 정렬
//        printArray(sortAlgorithm.insertionSort(exampleArray));
          printArray(sortAlgorithm.shellSort(exampleArray));
    }

    // 배열 출력을 위한 함수
    public static void printArray(int[] array){
        System.out.print("Sorted array : ");
        // 배열의 모든 요소 출력
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
