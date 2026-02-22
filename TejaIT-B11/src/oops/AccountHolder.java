package oops;

public class AccountHolder {
//sai
	private int accNum;
	private String holdername;// AAA B, Simaha
	private String ifsc;
	private int bal;
	
	public AccountHolder(int accNum, String holdername, String ifsc, int bal) {
		super();
		this.accNum = accNum;
		this.holdername = holdername;
		this.ifsc = ifsc;
		this.bal = bal;
	}

	
	public void setHoldername(String holdername) {//simha, puli
		this.holdername = holdername;
	}
	
	
	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getHoldername() {
		return holdername;
	}



	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

}
