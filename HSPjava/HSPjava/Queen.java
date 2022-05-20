public class Queen {
    public static int MAXQUEEN = 8;   //�ʺ������Ҳ������������
    public static int[][] Board = new int[MAXQUEEN][MAXQUEEN];    //��ʼ������
    private static int count;

    public static void startTest(Todo Todo, int row){
        //��0�п�ʼ
        for (int col = 0; col < MAXQUEEN; col++) {
            //���λ���Ƿ���Է�����
            if (Todo.checkBoard(MAXQUEEN, row, col, Board) == 1){
                if (row == MAXQUEEN - 1){
                    count++;
                }
                //�ݹ飬����һ��ǰ��
                if (row < MAXQUEEN - 1){
                    startTest(Todo, ++row);
                    //������һ��ջ
                    --row;
                }
            }
            //���¸�ֵΪ0��������һ���ж�
            Board[row][col] = 0;
        }
    }

    public static void main(String[] args) {
        int row = 0;
        Todo Todo1 = new Todo();
        startTest(Todo1, row);

        System.out.println("�ڷ�һ����" + count + "��");
    }
}

class Todo {
    //�������б�������Ƿ�������
    public static boolean flag = true;
    //�������
    public int checkBoard(int MAXQUEEN, int row, int col, int[][] Board){
        //�з�����
        for (int i = 0; i < MAXQUEEN; i++) {
            if (Board[row][i] == 1){
                return 0;
            }
        }
        //�з�����
        for (int i = 0; i < MAXQUEEN; i++) {
            if (Board[i][col] == 1){
                return 0;
            }
        }
        //���·�����
        for (int i = row, j = col; i < MAXQUEEN && j < MAXQUEEN; i++, j++) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        //���Ϸ�����
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        //���·�����
        for (int i = row, j = col; i < MAXQUEEN && j >= 0; i++, j--) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        //���Ϸ�����
        for (int i = row, j = col; i >= 0 && j < MAXQUEEN; i--, j++) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        if (flag) {
            //�˵����Ҫ�󣬿�����
            Board[row][col] = 1;
            //����Ѿ������һ�У����ӡ����
//            if (row == MAXQUEEN - 1){
//                printBoard(MAXQUEEN, Board);
//            }
            //���Է�
            return 1;
        }
        return 0;
    }
    //��ӡ����
    public static void printBoard(int MAXQUEEN, int[][] Board){
        for (int i = 0; i < MAXQUEEN; i++) {
            for (int j = 0; j < MAXQUEEN; j++){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================");
    }
}
