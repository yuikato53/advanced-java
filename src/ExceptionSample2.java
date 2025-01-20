public class ExceptionSample2 {
    public static void main(String[] args) {
        
        System.out.println("プログラム開始");
        try {
            Class.forName("java.lang.NotExistClass");  //例外の詳細
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("例外が起きました");
        }
        System.out.println("プログラム終了");

        
    }

}
