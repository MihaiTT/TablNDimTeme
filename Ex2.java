import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int matrixSize=sc.nextInt();
        int[][] a=new int[matrixSize][matrixSize];
        int[][] b=new int[matrixSize][matrixSize];
        int[][] c=new int[matrixSize][matrixSize];
        //adunare
        for(int i=0;i<matrixSize;i++)
            for(int j=0;j<matrixSize;j++)
            c[i][j]=a[i][j]+b[i][j];
        //scadere
        for(int i=0;i<matrixSize;i++)
            for(int j=0;j<matrixSize;j++)
            c[i][j]=a[i][j]-b[i][j];
        //inmultire cu scalar
        int scalar=sc.nextInt();
        for(int i=0;i<matrixSize;i++)
            for(int j=0;j<matrixSize;j++)
                a[i][j]=a[i][j]*scalar;
        //inmultire 2 matrici
        for(int i=0;i<matrixSize;i++)
        {
            for(int r=0;r<matrixSize;r++)
            {
                for(int j=0;j<matrixSize;j++)
                    c[i][r]+=a[i][j]*b[j][r];
            }
        }


    }
}
