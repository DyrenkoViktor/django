package lab0;

public class Variant5 {

    public static int integerTask(int A, int B) {
        return A % B;
    }

    public static int[] ifTask(int A, int B, int C) {

        int count1 = 0, count2 = 0;
        int array[] = new int[2];
        if (A < 0) {
            count1++;
        } else if (A > 0) {
            count2++;
        }

        if (B < 0) {
            count1++;
        } else if (B > 0) {
            count2++;
        }

        if (C < 0) {
            count1++;
        } else if (C > 0) {
            count2++;
        }

        array[0] = count1;
        array[1] = count2;
        return array;
    }

    public static float[] forTask(float count) {
        float array[] = new float[10];
        float k = 0;
        k += 0.1;
        for (int i = 0; i < 10; i++) {
            array[i] = count * k;
            k += 0.1;
        }
        return array;
    }

    public static boolean booleanTask(int A, int B) {
        return (A == 0) || (B < -2);
    }

    public static float caseTask(int N, float A, float B) {
        switch (N) {
            case 1:
                return A + B;
            case 2:
                return A - B;
            case 3:
                return A * B;
            case 4:
                return A / B;
            default:
                return 0;
        }

    }

    public static int whileTask(int N) {
        int K = 0;
        while ((Math.pow(2, K) != N) && Math.pow(2, K) < N) {
            K++;
            if (Math.pow(2, K) > N) {
                return -1;
            }
        }

        return K;

    }

    public static int[] arrayTask(int N) {
        int[] array = new int[N];
        array[0] = array[1] = 1;
        for (int i = 2; i < N; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static float[] MinMaxTask(int N, float[][] input) {
        float[] res = new float[2];
        int index = 0;
        float P = input[0][0] / input[0][1];
        for (int i = 1; i < N; i++) {
            if ((input[i][0] / input[i][1]) > P) {
                P = input[i][0] / input[i][1];
                index = i;
            }
        }

        res[0] = index;
        res[1] = P;
        return res;
    }

    public static float[][] MatrixTask(int M, int N, float D, float[] masiv) {
        float[][] Matrix = new float[M][N];
        for (int i = 0; i < M; i++) {
            Matrix[i][0] = masiv[i];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Matrix[j][i] = Matrix[j][i - 1] + D;
            }
        }
        return Matrix;

    }

    public static void main(String args[]) {
    }
}