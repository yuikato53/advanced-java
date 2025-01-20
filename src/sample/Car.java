package sample;

public class Car {

    private int speed;

    public void run(int i) throws Exception{   //runというメソッドは呼び出し元に返す可能性あり　（throws）
        
        if(speed>=180 || speed > 0){
            this.speed=speed;
            System.out.println("スピードが"+speed+"km/hになりました");
        }
        
        else{throw new OverSpeedException("スピードの出しすぎです");}

    }
}
