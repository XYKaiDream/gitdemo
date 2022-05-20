public class D0513MIG {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 8; i++) {
            if(i<7){
                map[0][i] = 1;
                map[7][i] = 1;
            }
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][2] = 1;
        map[3][1] =1;
        map[2][2] =1;
 // 杈撳嚭
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        T t1 = new T();
        t1.finWay(map, 1, 1);
        System.out.println("情况如下");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
class T{
    public boolean finWay(int[][] map,int a,int b){
        if(map[6][5] == 2){
            return true;
        }
        else{
            if(map[a][b] == 0){
                map[a][b] = 2;
                if(finWay(map, a+1, b)){
                    return true;
                }
                else if(finWay(map, a, b+1)){
                    return true;
                }
                else if(finWay(map, a-1, b)){
                    return true;
                }
                else if(finWay(map, a, b-1)){
                    return true;
                }
                else{
                    map[a][b] = 3;
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }
}