public class D0514Queen {
    public static void main(String[] args) {
        Queen q = new Queen();
        int map[][] = new int[8][8];
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 1;}
        }
        System.out.println("ÆåÅÌ");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        // q.test();


    }
}
class Queen{
    public boolean test(int i,int j,int map[][]){
        for (int k = 0; k < map.length; k++) {
            if(map[i][k]==1){
                return 0;
            }
        }
        for (int k = 0; k < map.length; k++) {
            if(map[k][j]==1){
                return 0;
            }
        }
        for (int k = 0; k < map.length; k++) {
            if(map[i][k]==1){
                return 0;
            }
        }
        for (int k = 0; k < map.length; k++) {
            if(map[k][i]==1){
                return 0;
            }
        }
    }
}