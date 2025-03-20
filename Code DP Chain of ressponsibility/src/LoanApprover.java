public abstract class LoanApprover {
    protected LoanApprover nextApprover;

        public void SetNextApprover(LoanApprover nextApprover)
        {
            this.nextApprover = nextApprover;
        }

        public abstract void ApproveLoan(Loan i);
}
