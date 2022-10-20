public class loader extends Thread{
    public void run(){

        System.out.print("                       ");
    for(int i=0;i<=25;i++){
        System.out.print(" *");
        try{
            sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    System.out.println();

    }
}
