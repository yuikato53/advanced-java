public class Ex05 {

    public static void main(String[] args) {
        String input  = "阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量大数(むりょうたいすう)";
        String[] bigNumbers = input.split(":");

        
        for(String bigNumber  :  bigNumbers){
            System.out.println(bigNumber+"");

        }
    }
}
