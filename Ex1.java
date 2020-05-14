import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ok = 0;
        int centerValue = 0;
        int matrixDimension = sc.nextInt();
        int mainDiagValue = sc.nextInt();
        int sndDiagValue = sc.nextInt();
        if (matrixDimension % 2 == 1) {
            centerValue = sc.nextInt();
        } else ok = 1;
        int leftValue = sc.nextInt();
        int upValue = sc.nextInt();
        int rightValue = sc.nextInt();
        int bottomValue = sc.nextInt();
        //array
        int[][] a = new int[matrixDimension][matrixDimension];
        for (int i = 0; i < matrixDimension; i++) {
            a[i][i] = mainDiagValue;
            a[i][matrixDimension - 1 - i] = sndDiagValue;
        }
        if (ok == 0)
            a[matrixDimension / 2][matrixDimension / 2] = centerValue;

        // 1 1 1 1
        // 1 1 1 1
        // 1 1 1 1
        // 1 1 1 1
        for (int i = 0; i < matrixDimension; i++)
            for (int j = 0; j < matrixDimension; j++) {
                if(i==j && i!=matrixDimension/2)
                    a[i][j]=mainDiagValue;
                else if(i+j==matrixDimension-1 && i!=matrixDimension/2)
                    a[i][j]=sndDiagValue;
                else if(matrixDimension%2!=0 && i==j && i==matrixDimension/2)
                    a[i][j]=centerValue;
                else if(i>j && i+j<matrixDimension-1)
                    a[i][j]=leftValue;
                else if(j>i && i+j<matrixDimension-1)
                    a[i][j]=upValue;
                else if(j>i && i+j>matrixDimension-1)
                    a[i][j]=rightValue;
                else a[i][j]=bottomValue;
            }

        // arrayList
        ArrayList<Integer> c;
        ArrayList<ArrayList<Integer>> b = new ArrayList<>(matrixDimension);
        for (int i = 0; i < matrixDimension; i++) {
            c = new ArrayList<>(matrixDimension);
            for (int j = 0; j < matrixDimension; j++) {
                c.add(0);
            }
            b.add(c);
        }
        for (int i = 0; i < matrixDimension; i++) {

            for (int j = 0; j < matrixDimension; j++) {
                if(i==j && i!=matrixDimension/2)
                    b.get(i).set(j,mainDiagValue);
                else if(i+j==matrixDimension-1 && i!=matrixDimension/2)
                    b.get(i).set(j,sndDiagValue);
                else if(matrixDimension%2!=0 && i==j && i==matrixDimension/2)
                    b.get(i).set(j,centerValue);
                else if(i>j && i+j<matrixDimension-1)
                    b.get(i).set(j,leftValue);
                else if(j>i && i+j<matrixDimension-1)
                    b.get(i).set(j,upValue);
                else if(j>i && i+j>matrixDimension-1)
                    b.get(i).set(j,rightValue);
                else b.get(i).set(j,bottomValue);

            }

        }

        System.out.println(b);
    }

}
