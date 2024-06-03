package algorithm;

public class SortAlgorithm {

    /* 선택 정렬 알고리즘 */
    /* 선택 정렬은 배열을 순회하면서 "가장 작은(또는 가장 큰)요소를 선택해서 앞쪽 순서대로 정렬하는 알고리즘 */
    public int[] selectionSort(int[] array){
        int n = array.length;
        int count = 0;
        System.out.println("Selection Sort Algorithm");
        System.out.print("Unsorted array : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        // 배열의 모든 요소를 순회
        for(int i = 0; i < n -1; i++){
            // 현재 부분 배열에서 가장 작은 요소를 찾기
            int minIndex = i;
            for(int j = i +1; j <n; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
                count++;
            }
            // 가장 작은 요소를 현재 위치로 교환
            int temp = array[minIndex];
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
        System.out.print("Unsorted array : ");
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        int n = array.length; // 배열의 길이

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

}
