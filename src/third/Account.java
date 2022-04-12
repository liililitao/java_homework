package third;

class Account {

	private String id;
	private int balance;
	@Override
	public boolean equals(Object obj) {

	    if (obj == this) {
	        return true;
	    }
	    if (!(obj instanceof Account)) {
	        return false;
	    }

	    Account acc = (Account) obj;
	    return acc.id.equals(this.id);
	}

	@Override
	public int hashCode() {
	    return id.hashCode();
	}
	public Account() {
	}
	public Account(String id, int balance) {
	    super();
	    this.id = id;
	    this.balance = balance;
	}

	public String getId() {
	    return id;
	}

	public void setId(String id) {
	    this.id = id;
	}

	public int getBalance() {
	    return balance;
	}

	public void setBalance(int balance) {
	    this.balance = balance;
	}
}
