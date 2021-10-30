package topic2;
class Account {
	private long acc_no;
	private String name,address;
	private float amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no ) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public float getAmount() {
		return amount;
		
	}
	public void setAmount(float amount) {
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
		System.out.println(a1.getAcc_no());
		System.out.println(a1.getName());
		System.out.println(a1.getAddress());
		System.out.println(a1.getAmount());

	}

}
