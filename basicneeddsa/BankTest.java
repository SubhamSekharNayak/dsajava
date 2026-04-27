import java.util.*;
class Bank
{
	private String name;
	private int acc_no;
	private double bal;
	public Bank(String name, int acc_no, double bal)
	{
		this.name=name;
		this.acc_no=acc_no;
		this.bal=bal;

	}
	public void bankDetails()
	{
		System.out.println("name = "+name);
		System.out.println("account number = "+acc_no);
		System.out.println("balance amount = "+bal);
		
	}
	public void deposit(double bal)
	{
		this.bal=this.bal+bal;
		System.out.println("successfully deposited amount: "+bal);


	}
	public void withdrawal(double bal)
	{
		if(this.bal > bal)
		{
			this.bal=this.bal-bal;
			System.out.println("the withdraw amount: "+bal);
		}else{
			System.out.println("insufficient balance!");
		}
	}
	public double showBalance()
	{
		return this.bal;
	}
}
class BankTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name: ");
		String nm=sc.nextLine();
		System.out.println("enter the account number: ");
		int acc=sc.nextInt();
		System.out.println("enter the balance amount: ");
		double ba=sc.nextDouble();

		Bank b=new Bank(nm, acc, ba);
		

		while(true) {
			System.out.println("enter your choice\n1.for details\n2.for deposit\n3.for withdraw\n4.for balance check\n5.to exit");
			int ch=sc.nextInt();


			switch(ch) {
			case 1:
				b.bankDetails();
				break;

			case 2:
				System.out.println("what amount you want to deposit: ");
				ba=sc.nextDouble();
				b.deposit(ba);
				break;

			case 3:
				System.out.println("what amount you want to withdraw: ");
				ba=sc.nextDouble();
				b.withdrawal(ba);
				break;

			case 4:
				System.out.println("the balance is "+b.showBalance());
				break;

			case 5:
				 System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                	System.out.println("invalid entry!");



			}
		}
	}
}