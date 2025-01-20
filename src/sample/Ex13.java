package sample;

public class Ex13 {
    public static void main(String[] args) {
        try { Class.forName("java.lang. java.lang.NotFoundClass"); 
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("クラスが見つかりません");
        }
           
    } 
 }
    


