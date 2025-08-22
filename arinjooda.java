class Arinjooda {
    public static void main(String args[]) {

        String[][] Names = {
            {"SHADIL", "SANDHIYA", "LINCITTAH"},
            {"AVINASH", "NISTHUALLA", "VANISHA"},
            {"VINAYAK", "SALAI", "NOBODY"}};
            System.out.println("Name List of Dravidian Techies are given below:");
            for (int i = 0; i < Names.length; i++) {
            for (int j = 0; j < Names[i].length; j++) {
            System.out.println(Names[i][j]); } }


        int[][] A = {{2, 3}, {3, 5}};
        int[][] B = {{4, 5}, {6, 7}};
        int[][] sum = new int[2][2];
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
        sum[i][j] = A[i][j] + B[i][j];}}
               System.out.println("\nSum of matrices:");
               for (int i = 0; i < 2; i++) {
               for (int j = 0; j < 2; j++) {
               System.out.print(sum[i][j] + " ");}
               System.out.println();}

        int[][] mul = new int[2][2];
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
        mul[i][j] = 0;
        for (int k = 0; k < 2; k++) {
        mul[i][j] += A[i][k] * B[k][j]; }}}
               System.out.println("\nMultiplication of matrices:");
               for (int i = 0; i < 2; i++) {
               for (int j = 0; j < 2; j++) {
               System.out.print(mul[i][j] + " "); }
               System.out.println();}}}
