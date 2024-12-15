class TBA implements Runnable{
    int avt=5;
    public void run()
{ 
    String name=Thread.currentThread().getName();
    synchronized(this)
    { 
        System.out.println(name+"you are trying to book the ticket for PUSHPA 2");
        if(avt>0)
        {
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                System.out.println(name+" "+e);
            }
            avt--;
            System.out.println(name+"your ticket is booked for PUSHPA 2");
        }else{
            System.out.println(name+"sorry go and ask Alluarjun");
        }
    }
}
}
class TBA1{
    public static void main(String args[]){
        TBA g=new TBA();
        Thread t1=new Thread(g,"Amar");
        Thread t2=new Thread(g,"Akbar");
        Thread t3=new Thread(g,"antony");
        Thread t4=new Thread(g,"charlie");
        Thread t5=new Thread(g,"bob");
        Thread t6=new Thread(g,"sueez");
        Thread t7=new Thread(g,"kittu");
        Thread t8=new Thread(g,"lucky");
        Thread t9=new Thread(g,"Aman");
        Thread t10=new Thread(g,"Ayu");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    

    }
}
    
