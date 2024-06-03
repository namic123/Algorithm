package algorithm;

public class SortAlgorithm {

    /* 버블 정렬 알고리즘 */
    /* 버블 정렬은 인접한 두 요소를 비교하여 순서가 맞지 않으면 교환하는 방식으로 배열을 정렬 */
    public int[] bubbleSort(int[] array, String direction) {
        System.out.println("Bubble Sort Algorithm");
        System.out.print("Unsorted array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        int n = array.length; // 배열의 길이

        if (direction.equals("left")) {
            // 배열의 왼쪽 -> 오른쪽 순회 (큰거를 오른쪽으로 보냄)
            for (int i = 0; i < n - 1; i++) {
                // 마지막 i개의 요소는 이미 정렬되어 있으므로 제외
                for (int j = 0; j < n - i - 1; j++) {
                    // 현재 요소가 다음 요소보다 크면 두 요소를 교환
                    if (array[j] > array[j + 1]) {
                        // 요소 교환
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
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
