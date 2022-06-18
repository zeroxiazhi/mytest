package array;

public class LinkedArray {
    private ArrayNode head=new ArrayNode(0,0,0);

    public LinkedArray() {
    }
    //统计数组有效数据个数
    public int sum(int[][] array){
        int count = 0;
        for (int i = 0; i < array.length;i++){
            for (int j =0; j < array[i].length; j++ ){
                if (array[i][j] != 0){
                    count+=1;
                }
            }
        }
        return count;
    }


    //转化为稀疏数组的方法
    public void toLink(int[][] array){
        head = new ArrayNode(array.length,array[0].length,sum(array));
        ArrayNode temp = head;
        for (int i = 0; i < array.length;i++){
            for (int j =0; j < array[i].length; j++ ){
                if (array[i][j] != 0){
                    temp.setNext(new ArrayNode(i,j,array[i][j]));
                    temp = temp.getNext();
                }
            }
        }
    }

    //遍历稀疏数组
    public void list(){
        ArrayNode temp = head;
        while(true){
            System.out.println(temp);
            if(temp.getNext() == null){
                System.out.println("遍历完毕");
                break;
            }else {
                temp = temp.getNext();
            }
        }
    }


    //将稀疏数组还原成原二维数组
    public int[][] auto(){
        int[][] array = new int[head.getNode()[0]][head.getNode()[1]];
        ArrayNode temp = head.getNext();
        while(true) {
                array [temp.getNode()[0]][temp.getNode()[1]]=temp.getNode()[2];
                if(temp.getNext() == null){
                    break;
                }
                temp = temp.getNext();
        }
        return array;
    }
}
