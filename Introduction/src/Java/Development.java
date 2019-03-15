package Java;

public class Development implements BankingClient, DomainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Development d = new Development();
		d.Login();
		d.PayCreditCard();
		d.TakeLoan();
		d.TransferMoney();
		d.Logout();
		
		BankingClient bc = new Development();
		bc.PayCreditCard();
		bc.PayDebitCard();
		
		DomainClient dc = new Development();
		dc.Login();
		dc.Logout();
	}

	@Override
	public void PayCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("Pay Credit Card");

	}

	@Override
	public void PayDebitCard() {
		// TODO Auto-generated method stub
		System.out.println("Pay Debit Card");

	}

	@Override
	public void TakeLoan() {
		// TODO Auto-generated method stub
		System.out.println("Take Loan");

	}

	public void TransferMoney() {
		// TODO Auto-generated method stub
		System.out.println("Transfer Money");
	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Login");

	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout");

	}
}