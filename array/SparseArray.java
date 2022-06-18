package array;

public class SparseArray {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][4] = 2;
        /*for (int[] row : array){
            for (int i : row){
                System.out.print(" "+i);
            }
            System.out.println();
        }*/

        //计算二维数组中有效数据的个数
        int count = 0;
        for(int i = 0; i< array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if(array[i][j] != 0){
                    count+=1;
                }
            }
        }

        //定义稀疏数组
        int[][] sparesArray = new int[count+1][3];
        sparesArray[0][0] = 11;
        sparesArray[0][1] = 11;
        sparesArray[0][2] = count;
        //已存储数据条数
        int sum = 0;
        for(int i = 0; i< array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if(array[i][j] != 0){
                    sum+=1;
                            //值
                    sparesArray[sum][0]=array[i][j];
                    //列
                    sparesArray[sum][1]=j;
                    sparesArray[sum][2]=i;

                }
            }
        }

        for (int[] row : sparesArray){
            for (int i : row){
                System.out.print(" "+i);
            }
            System.out.println();
        }

        //把稀疏数组转换为原始二维数组
        int [][] oldArray = new int[sparesArray[0][0]][sparesArray[0][1]];
        for(int i = 1; i <= count; i++){
            oldArray[sparesArray[i][0]][sparesArray[i][1]] = sparesArray[i][2];
        }
        for (int[] row : oldArray){
            for (int i : row){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
