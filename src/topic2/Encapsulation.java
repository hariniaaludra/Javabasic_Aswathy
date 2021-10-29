package topic2;
class Account {
	long acc_no;
	String name,address;
	float amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long ) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
		}
	public String getAddress() {
		return address;
	}
	public void setAddress() {
		this.address=address;
	}
	public float getAmount() {
		return amount;
		
	}
	public void setAmount() {
		this.amount=amount;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAcc_no(1056205458);
		a1.setName("sam");
		a1.setAddress("pune");
		a1.setAmount(50000);
		

	}

}
