public class Chain {
    public static void main(String[] args) {
        {
            LoanApprover a = new Manager();
            LoanApprover b = new Director();
            LoanApprover c = new President();
            a.SetNextApprover(c);
            b.SetNextApprover(c);
            
            
            a.ApproveLoan(new Loan(500000));  //this will be approved by the manager
            a.ApproveLoan(new Loan(1000000));  //this will be approved by the director
            a.ApproveLoan(new Loan(1500000));  //this will be approved by the vice president
        }
    }
    
}
