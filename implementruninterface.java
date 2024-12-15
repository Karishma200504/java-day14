class a implements Runnable{
    public void run()
    {
        System.out.println("hello iam thread");
    }
}
public class implementruninterface{
    public static void main(String args[]){
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.run();
    }
}