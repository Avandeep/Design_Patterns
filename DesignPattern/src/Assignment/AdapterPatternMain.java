package Assignment;

interface PaymentProcessor {
	void pay(int dollars);
}

class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		// TODO Auto-generated method stub
		System.out.println(dollars);
	}

}

class PaymentAdapter {

	public void pay(int rupees) {

		int dollars = rupees / 75;

		PaymentProcessor pp = new PaymentProcessorImpl();

		pp.pay(dollars);
	}
}

class PaymentApp {
	public void pay(int rupees)
 
	{
	 PaymentAdapter pa=new PaymentAdapter();
	 pa.pay(rupees);
	}
}

public class AdapterPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentApp pa=new PaymentApp();
		pa.pay(150);
	}

}
