package sample;

public class Ex14 { 
    public static void method1()throws ClassNotFoundException { 
     Class.forName("java.lang.NonExistClass");  
    } 
    
    public static void main(String[] args) { 
        try {method1(); 
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println("クラスが見つかりません");
            e.printStackTrace();
        }
    
    } 
   }