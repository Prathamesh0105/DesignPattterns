public class Director extends LoanApprover{
    public void ApproveLoan(Loan i)
        {
            if (i.getAmount() <= 1000000)
                System.out.println("Loan amount of " + i.getAmount() + " approved by the Director"); 
            else
                nextApprover.ApproveLoan(i);
        }
}
