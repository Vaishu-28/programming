import java.util.Scanner;

class Matrix{
    private int row, col;
    private int[][] data;
    Matrix(){
    
    }
    Matrix(int row, int col){
        this.row = row;
        this.col = col;
        data = new int[row][col];
        System.out.println("Enter the array elements: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }
    public void display(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public bool equal(Matrix m){
        bool isEqual = true;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(this.data[i][j] != m.data[i][j]){
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }
}

public class MatrixDemo{
    public static void main(String[] args){
        Matrix m1 = new Matrix(3,3);
        Matrix m2 = new Matrix(3,3);
        m1.display();
        m2.display();
        if(m1.equal(m2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}