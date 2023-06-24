class App {
    public static void main(String[] args) {
        ComplexNumber[][] m1 = createMatrix(3);
        ComplexNumber[][] m2 = createMatrix(3);

        ComplexMatrix matrix = new ComplexMatrix();
        ComplexMatrix.printResult(m1, m2, matrix.addMatrix(m1, m2), '+');
    }

    public static ComplexNumber[][] createMatrix(int size) {
        ComplexNumber[][] m1 = new ComplexNumber[size][size];
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[i].length; j++)
                m1[i][j] = new ComplexNumber(Math.random() * 10, Math.random() * 10);
        return m1;
    }
}
