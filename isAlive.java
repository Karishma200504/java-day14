public class isAlive{
    public static void main(String args[]){
        Runnable r=()->System.out.println("Iam new from java 8 version");
        Thread t=new Thread(r);
       // t.start();
        System.out.println(t.isAlive());
    }
}