package programmers.week2;

public class bubbleAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 4};
        int[] answer = new int[4];
        int tmp = 0;
//      버블 정렬
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i++]) {
                tmp = arr[i];
                arr[i] = arr[i++];
                arr[i++] = tmp;
//                i++;
            }
//            최종 결과
            for(i = 0; i < answer.length; i++) {
                answer[i] = arr[i];
                System.out.printf("%d ", answer[i]);
            }
        }
    }
}
