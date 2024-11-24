public class array2 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};
        int[] C = mergeArrays(A, B);

        System.out.print("Merged array: ");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;
        int[] C = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them into C
        while (i < n1 && j < n2) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // Copy remaining elements of A, if any
        while (i < n1) {
            C[k++] = A[i++];
        }

        // Copy remaining elements of B, if any
        while (j < n2) {
            C[k++] = B[j++];
        }

        return C;
    }
}
