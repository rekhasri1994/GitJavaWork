package banking;

public class Services
{
    private int accountno,cibilscore,period,rateofinterest;

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public int getCibilscore() {
		return cibilscore;
	}

	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getRateofinterest() {
		return rateofinterest;
	}

	public void setRateofinterest(int rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
    
    public void display()
    {
    	System.out.println("these are services");
    }
}