import java.util.Scanner;


public class AtmMain {
    public static void main(String[] args) {

        AtmOperationInterf op = new AtmOperationImpl();
        ThreadAtm at=new ThreadAtm();
        loader l=new loader();
        ATM atm=new ATM("Near karachi");



        int atmnumber=12345;
        int atmpin=123;
               Scanner in = new Scanner(System.in);
            System.out.println("       ************Welcome to Automated Teller Machine !!!************");
        System.out.println("location:" +atm.getlocation());
            System.out.println("Enter atm number:");
            atmnumber=in.nextInt();

        System.out.print("Enter Pin: ");
            atmpin = in.nextInt();
            l.run();
            if ((atmnumber ==12345 ) && (atmpin == 123) )
            {

                while (true) {



                    System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                    System.out.println("Enter Choice : ");
                    int ch = in.nextInt();
                    if (ch == 1) {
                        op.viewBalance();

                    } else if (ch == 2) {
                        System.out.println("Enter amount to withdraw ");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);

                    } else if (ch == 3) {
                        System.out.println("Enter Amount to Deposit :");
                        double depositAmount = in.nextDouble();//5000
                        op.depositAmount(depositAmount);


                    } else if (ch == 4) {
                        op.viewMiniStatement();

                    } else if (ch == 5) {
                        System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                        System.exit(0);
                    } else {
                        System.out.println("Please enter correct choice");
                    }
                }
            } else {
                System.out.println("Incorrect Atm Number or pin");
                at.run();
                System.exit(0);
            }



        }
    }