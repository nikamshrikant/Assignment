public class MergeArrays1 {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = n - 1; 
        int j = m - n - 1; 
        int k = m - 1; 

        while (i >= 0 && j >= 0) {
            if (Y[i] > X[j]) {
                X[k--] = Y[i--];
            } else {
                X[k--] = X[j--];
            }
        }

        
        while (i >= 0) {
            X[k--] = Y[i--];
        }
    }

    public static void main(String[] args) {
        int[] X = {2, 8, 13, 15, 0, 0, 0, 0}; 
        int[] Y = {18, 21, 27};
        mergeArrays(X, Y);

        System.out.print("Merged Array: ");
        for (int num : X) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}