import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
    ATM atm = new ATM("Near Karachi");
    ThreadAtm at=new ThreadAtm();
    String location;





        Map<Double, String> ministmt = new HashMap<>();
        @Override
        public void viewBalance () {
            System.out.println("Available Balance is : " + atm.getBalance());

        }


        @Override
        public void withdrawAmount ( double withdrawAmount){
            if (withdrawAmount % 500 == 0) {
                if (withdrawAmount <= atm.getBalance()) {
                    ministmt.put(withdrawAmount, " Amount Withdrawn");
                    System.out.println("Collect the Cash " + withdrawAmount);
                    if (withdrawAmount < 0) {
                        atm.setBalance(atm.getBalance() + withdrawAmount);
                        viewBalance();
                    }
                    else{
                        atm.setBalance(atm.getBalance() - withdrawAmount);
                        viewBalance();
                    }
                } else {
                    System.out.println("Insufficient Balance !!");
                    at.run();
                }


            }


            else {
                System.out.println("Please enter the amount in multipal of 500");
            }

        }

        @Override
        public void depositAmount ( double depositAmount){
            ministmt.put(depositAmount, " Amount Deposited");
            System.out.println(depositAmount + " Deposited Successfully !!");
            atm.setBalance(atm.getBalance() + depositAmount);
            viewBalance();

        }

        @Override
        public void viewMiniStatement () {
            for (Map.Entry<Double, String> m : ministmt.entrySet()) {
                System.out.println(m.getKey() + "" + m.getValue());
            }

        }
    }

