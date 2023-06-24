import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the array size in n: ");
        GenerateMatrix matrix = new GenerateMatrix(input.nextInt());
        System.out.println("the random array is ");
        matrix.printMatrix();
        System.out.print("the large column index: ");
        for (Integer col : matrix.maxColumn()) {
            System.out.print(col + " ");
        }
        System.out.println();
        System.out.print("the large row index: ");
        for (Integer row : matrix.maxRow()) {
            System.out.print(row + " ");
        }
    }
}

class GenerateMatrix {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

    GenerateMatrix(int x) {
        Random r = new Random();
        for (int i = 0; i < x; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < x; j++) {
                row.add(r.nextBoolean() ? 1 : 0);
            }
            matrix.add(row);
        }
    }

    void printMatrix() {
        for (ArrayList<Integer> arrayList : matrix) {
            for (Integer i : arrayList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    Integer[] maxRow() {
        int[] matrixRow = new int[matrix.size()];
        for (int i = 0; i < matrix.size(); i++) {
            for (Integer item : matrix.get(i)) {
                matrixRow[i] += item;
            }
        }

        int maxInt = matrixRow[0];
        ArrayList<Integer> max = new ArrayList<Integer>();
        for (int i = 0; i < matrixRow.length; i++) {
            if (matrixRow[i] > maxInt) {
                maxInt = matrixRow[i];
                max = new ArrayList<Integer>();
                max.add(i);
            } else if (matrixRow[i] == maxInt) {
                max.add(i);
            }
        }
        return max.toArray(new Integer[max.size()]);
    }

    Integer[] maxColumn() {
        int[] matrixColumn = new int[matrix.size()];
        for (ArrayList<Integer> array : matrix)
            for (int i = 0; i < array.size(); i++)
                matrixColumn[i] += array.get(i);

        int maxInt = matrixColumn[0];
        ArrayList<Integer> max = new ArrayList<Integer>();
        for (int s = 0; s < matrixColumn.length; s++) {
            if (matrixColumn[s] > maxInt) {
                maxInt = matrixColumn[s];
                max = new ArrayList<Integer>();
                max.add(s);
            } else if (matrixColumn[s] == maxInt) {
                max.add(s);
            }
        }
        return max.toArray(new Integer[max.size()]);
    }
}