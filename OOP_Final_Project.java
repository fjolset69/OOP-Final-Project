package com.mycompany.oop_final_project;

import java.util.Scanner;

abstract class atm{
	void withdraw() {}
	void deposit() {}
	void display() {}
}

class accounts{
	private int cardn, p, Cardnum, pin, balance;
	}

class bank extends atm{
	Scanner s = new Scanner(System.in);
	accounts ac = new accounts();
	private int balance;
	bank(){}
}


class LandBank extends bank{
	int cardn;
        int p; 
        int Cardnum = 11002232;
        int pin = 1234;
        int balance = 500000;
        Scanner s = new Scanner(System.in);
	@Override void withdraw() {
		System.out.print("Enter amount to withdraw: ");
		int amt = s.nextInt();
		balance -= amt;
		System.out.println("Withdraw Successfully.");
		System.out.println("New Balance: "+balance);
	}
	@Override void deposit() {
		System.out.print("Enter amount to deposit: ");
		int amt = s.nextInt();
		balance += amt;
		System.out.println("Deposited Successfully.");
		System.out.println("New Balance: "+balance);
	}
	@Override void display() {
		System.out.println("Balance: "+balance);
	}
}

class LBVerify extends LandBank{
	LBVerify(int cardn, int p) {
		if(cardn!=Cardnum)
                    do{
                        System.out.println("Account does not exist");
                        System.out.print("Enter Card Number Again: ");
                        cardn = Integer.parseInt(s.nextLine());
                    }while(cardn!=Cardnum);
                
                    
		if(p!=pin) {
			do {
				System.out.println("Wrong PIN");
				System.out.print("Enter PIN again: ");
				p = s.nextInt();
			}while(p!=pin);
		
	}System.out.println("Login Successfully");
		}
}

class RuralBank extends bank{
	int cardn;
        int p; 
        int Cardnum = 22100455;
        int pin = 1111;
        int balance = 900000;
        Scanner s = new Scanner(System.in);
	@Override void withdraw() {
		System.out.print("Enter amount to withdraw: ");
		int amt = s.nextInt();
		balance -= amt;
		System.out.println("Withdraw Successfully.");
		System.out.println("New Balance: "+balance);
	}
	@Override void deposit() {
		System.out.print("Enter amount to deposit: ");
		int amt = s.nextInt();
		balance += amt;
		System.out.println("Deposited Successfully.");
		System.out.println("New Balance: "+balance);
	}
	@Override void display() {
		System.out.println("Balance: "+balance);
	}
	}

class RBVerify extends RuralBank{
	RBVerify(int cardn, int p) {
		if(cardn!=Cardnum)
                    do{
                        System.out.println("Account does not exist");
                        System.out.print("Enter Card Number Again: ");
                        cardn = Integer.parseInt(s.nextLine());
                    }while(cardn!=Cardnum);
		if(p!=pin) {
			do {
				System.out.println("Wrong PIN");
				System.out.print("Enter PIN again: ");
				p = s.nextInt();
			}while(p!=pin);
		
	}System.out.println("Login Successfully");
		}
}

class BDO extends bank{
      	int cardn;
        int p; 
        int Cardnum = 22100455;
        int pin = 1111;
        int balance = 900000;
        Scanner s = new Scanner(System.in);
	@Override void withdraw() {
		System.out.print("Enter amount to withdraw: ");
		int amt = s.nextInt();
		if(amt>balance)System.out.println("Amount is greater than the balance");
                else balance -= amt;
		System.out.println("Withdraw Successfully.");
		System.out.println("New Balance: "+balance);
	}
	@Override void deposit() {
		System.out.print("Enter amount to deposit: ");
		int amt = s.nextInt();
		balance += amt;
		System.out.println("Deposited Successfully.");
		System.out.println("New Balance: "+balance);
	}
	@Override void display() {
		System.out.println("Balance: "+balance);
	}
	}
	
class BDVerify extends BDO{
	BDVerify(int cardn, int p) {
		if(cardn!=Cardnum)
                    do{
                        System.out.println("Account does not exist");
                        System.out.print("Enter Card Number Again: ");
                        cardn = Integer.parseInt(s.nextLine());
                    }while(cardn!=Cardnum);
		if(p!=pin) {
			do {
				System.out.println("Wrong PIN");
				System.out.print("Enter PIN again: ");
				p = s.nextInt();
			}while(p!=pin);
		
	}System.out.println("Login Successfully");
		}
}

public class OOP_Final_Project {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("""
					Choose Bank
					[1] LandBank
					[2] Rural Bank
					[3] BDO
					""");
		int ch = Integer.parseInt(s.nextLine());
		switch(ch) {
			case 1 -> System.out.println("You have chosen LandBank");
			case 2 -> System.out.println("You have chosen Rural Bank");
			case 3 -> System.out.println("You have chosen BDO");
			default -> System.exit(0);
		}
		bank selected = null;
		System.out.print("Enter Card Number: ");
		int n = Integer.parseInt(s.nextLine());
		System.out.print("Enter PIN: ");
		int pn = Integer.parseInt(s.nextLine());
		switch(ch) {
			case 1 -> {selected = new LandBank(); new LBVerify(n,pn);}
			case 2 -> {selected = new RuralBank(); new RBVerify(n,pn);}
			case 3 -> {selected = new BDO(); new BDVerify(n,pn);}
		}
		int choice = 0; 
		do {
		System.out.println("""
				[1] Deposit
				[2] Withdraw
				[3] Check Balance
				[4] Exit
				""");
		choice = Integer.parseInt(s.nextLine());
                switch(ch) {
		case 1 -> {
			if(choice==1) {selected.deposit();}
			else if(choice==2) {selected.withdraw();}
			else if(choice==3) {selected.display();}
			else System.exit(0);
		}
		case 2 -> {
			if(choice==1) {selected.deposit();}
			else if(choice==2) {selected.withdraw();}
			else if(choice==3) {selected.display();}
			else System.exit(0);
		}
		case 3 -> {
			if(choice==1) {selected.deposit();}
			else if(choice==2) {selected.withdraw();}
			else if(choice==3) {selected.display();}
			else System.exit(0);
		}
		}
		}while(choice!=4);
	}
}
