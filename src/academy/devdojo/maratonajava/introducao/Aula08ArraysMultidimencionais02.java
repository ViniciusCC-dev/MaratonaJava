    package academy.devdojo.maratonajava.introducao;

    public class Aula08ArraysMultidimencionais02 {
        static void main() {
            int[] array = {1,2,3};

            int[][] arrInt = new int[3][0];

            arrInt[0] = new int[2];
            arrInt[1] = array;
            arrInt[2] = new int[]{1,2,3,4,5,6};

            int[][] arrInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

            for (int[] arrayBase: arrInt ) {
                System.out.println("\n-----");
                for (int num : arrayBase ) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("saltao ------------------------");
            for (int[] arrayBase: arrInt2 ) {
                System.out.println("\n-----");
                for (int num : arrayBase ) {
                    System.out.print(num + " ");
                }
            }
        }
    }
