public class seconds{
    public static void main(String args[]){
        System.out.println("Thread started...");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("thread resumed");
    }
}