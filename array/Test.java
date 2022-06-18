package array;

public class Test {
    public static void main(String[] args) {
        LinkedArray linkedArray = new LinkedArray();
        int[][] array = new int[11][11];
        array[5][9]=4;
        array[3][2]=9;
        array[7][3]=3;
        linkedArray.toLink(array);
        linkedArray.list();
        int[][] array2 = linkedArray.auto();
        for (int[] row : array2){
            for (int i : row){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
