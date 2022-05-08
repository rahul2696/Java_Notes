class MultiThreading
{
    public static void main(String args[]) throws InterruptedException
    {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        t.setPriority(9);
        System.out.println(t.getPriority());

        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            t.sleep(1000);
        }
    }
}