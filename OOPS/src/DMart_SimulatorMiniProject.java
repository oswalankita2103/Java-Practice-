import java.util.Scanner;

class MyDmartMain{
	static int custid=0;
	String passcode;
	String name;
	String surname;
	long phone;
	double mymoney;
	double finalbill=0;
	MyDmartMain(){
		custid++;
	}
	static {
		System.out.println("----------------------------W-E-l-C-O-M-E------T-O-------D-M-A-R-T-----------------------");
		}
	static void list() {
		System.out.println("-------------------------------:LIST:-------------------------------");
		System.out.println("S.no\t Name\t Price(1Kg)\t\tS.no\t Name\t Price(1Kg)");
		System.out.println("1.\t Sugar\t\t 49\t\t16.\t Shampoo\t 135");
		System.out.println("2.\t Salt\t\t 20\t\t17.\t Toothpaste\t 89");
		System.out.println("3.\t Rice\t\t 75\t\t18.\t Toothbrush\t 25");
		System.out.println("4.\t Wheat Flour\t 280\t\t19.\t Dish Wash\t 45");
		System.out.println("5.\t Cooking Oil\t 130\t\t20.\t Phenyl\t\t 60");
		System.out.println("6.\t Tea Powder\t 95\t\t21.\t Floor Cleaner\t 95");
		System.out.println("7.\t Coffee\t\t 155\t\t22.\t Coconut Oil\t 80");
		System.out.println("8.\t Milk\t\t 52\t\t23.\t Hair Oil\t 70");
		System.out.println("9.\t Bread\t\t 28\t\t24.\t Talcum Powder\t 65");
		System.out.println("10.\t Butter\t\t 60\t\t25.\t Deodorant\t 120");
		System.out.println("11.\t Eggs(10Pcs)\t 70\t\t26.\t Face Wash\t 99");
		System.out.println("12.\t Biscuits\t 30\t\t27.\t Hand Wash\t 55");
		System.out.println("13.\t Maggi\t\t 14\t\t28.\t SanitaryNapkins 85");
		System.out.println("14.\t DetergentPowder 110\t\t29.\t Paper Napkins\t 40");
		System.out.println("15.\t Soap\t\t 38\t\t30.\t Mineral Water\t 20");
		System.out.println("--------------------------------------------------------------------");
	}
	void getMyDetails(){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR BENIFICIARY DETAILS");
		System.out.println("********************************************");
		System.out.print("Enter Your Name : ");
		name=sc.next();
		System.out.print("Enter Your Surname : ");
		surname=sc.next();
		System.out.print("Enter Your Phone Number : ");
		phone=sc.nextLong();
		System.out.print("Create Your One Time UPI PASSWORD: ");
		passcode= sc.next();
		System.out.print("Enter Amount You Have In Your Account : ");
		mymoney=sc.nextDouble();
	}
	void showMyDetails() {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\t\tUserID: D-MART@"+name+custid);
		System.out.println("\t\tName: "+name+" "+surname);
		System.out.println("\t\tPhone Number: "+phone);
	}
	
	void showBillInformation(){
		System.out.println("\t\tBill: "+finalbill);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	
	double shop() {
		Scanner sc= new Scanner(System.in);
		int ch=1;
		int itemno;
		int itemqnty;
		double bill1 = 0, bill2 = 0, bill3 = 0, bill4 = 0, bill5 = 0, bill6 = 0, bill7 = 0, bill8 = 0, bill9 = 0, bill10 = 0, bill11 = 0, bill12 = 0, bill13 = 0, bill14 = 0, bill15 = 0, bill16 = 0, bill17 = 0, bill18 = 0, bill19 = 0, bill20 = 0,bill21 = 0, bill22 = 0, bill23 = 0, bill24 = 0, bill25 = 0, bill26 = 0, bill27 = 0, bill28 = 0, bill29 = 0, bill30 = 0;

		while(ch==1){
			
			System.out.println("---------------------------SELECT YOUR SHOPPING ITEMS-------------------");
			
			System.out.print("Enter Your Item Number:");
			itemno=sc.nextInt();
			
			System.out.print("Enter How Many Qnatity: ");
			itemqnty=sc.nextInt();
			if(itemno==1) 
			{
				double initialprice=49;
				bill1=initialprice*itemqnty;
				System.out.println("-------------------------------------");
				System.out.println("Name\t     Quantity\t     TotalPrice");
				System.out.println("Sugar: \t\t"+itemqnty+"KG \t\t"+bill1+"/-");
				System.out.println("-------------------------------------");
			}
			else if(itemno==2) 
			{
				double initialprice=20;
				bill2=initialprice*itemqnty;
				System.out.println("-------------------------------------");
				System.out.println("Name\t     Quantity\t     TotalPrice");
				System.out.println("Sugar: \t\t"+itemqnty+"KG \t\t"+bill2+"/-");
				System.out.println("-------------------------------------");
			}
			else if(itemno==3) {
			    double initialprice = 75;
			    bill3 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Rice: \t\t" + itemqnty + "KG \t\t" + bill3 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==4) {
			    double initialprice = 280;
			    bill4 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Wheat Flour: \t\t" + itemqnty + "KG \t\t" + bill4 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==5) {
			    double initialprice = 130;
			    bill5 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Cooking Oil: \t\t" + itemqnty + "KG \t\t" + bill5 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==6) {
			    double initialprice = 95;
			    bill6 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Tea Powder: \t" + itemqnty + "KG \t\t" + bill6 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==7) {
			    double initialprice = 155;
			    bill7 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Coffee: \t" + itemqnty + "KG \t\t" + bill7 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==8) {
			    double initialprice = 52;
			    bill8 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Milk: \t" + itemqnty + "KG \t\t" + bill8 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==9) {
			    double initialprice = 28;
			    bill9 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Bread: \t" + itemqnty + "KG \t\t" + bill9 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==10) {
			    double initialprice = 60;
			    bill10 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Butter: \t" + itemqnty + "KG \t\t" + bill10 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==11) {
			    double initialprice = 70;
			    bill11 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Eggs(10pcs): \t" + itemqnty + "KG \t\t" + bill11 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==12) {
			    double initialprice = 30;
			    bill12 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Biscuits :\t\t" + itemqnty + "Pcs \t\t" + bill12 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==13) {
			    double initialprice = 14;
			    bill13 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Maggi: " + itemqnty + "Pcs \t\t" + bill13 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==14) {
			    double initialprice = 110;
			    bill14 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Detergent Powder: " + itemqnty + "Pcs \t\t" + bill14 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==15) {
			    double initialprice = 30;
			    bill15 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Soap: \t\t" + itemqnty + "Ltr \t\t" + bill15 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==16) {
			    double initialprice = 135;
			    bill16 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Shampoo: \t\t" + itemqnty + "Pcs \t\t" + bill16 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==17) {
			    double initialprice = 89;
			    bill17 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("ToothPaste: \t\t" + itemqnty + "Pcs \t\t" + bill17 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==18) {
			    double initialprice = 25;
			    bill18 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("ToothBrush: \t" + itemqnty + "Pcs \t\t" + bill18 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==19) {
			    double initialprice = 45;
			    bill19 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Dishwash: \t" + itemqnty + "Pcs \t\t" + bill19 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==20) {
			    double initialprice = 60;
			    bill20 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Phenyl: \t" + itemqnty + "Pcs \t\t" + bill20 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==21) {
			    double initialprice = 95;
			    bill21 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("FloorCleaner: \t\t" + itemqnty + "Pcs \t\t" + bill21 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==22) {
			    double initialprice = 80;
			    bill22 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Coconut Oil: \t" + itemqnty + "Pcs \t\t" + bill22 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==23) {
			    double initialprice = 70;
			    bill23 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Hair Oil: \t" + itemqnty + "Pcs \t\t" + bill23 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==24) {
			    double initialprice = 75;
			    bill24 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("TalcumPowder: \t" + itemqnty + "KG \t\t" + bill24 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==25) {
			    double initialprice = 120;
			    bill25 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Deodarant: \t" + itemqnty + "Ltr \t\t" + bill25 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==26) {
			    double initialprice = 99;
			    bill26 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("FaceWash: \t\t" + itemqnty + "Pcs \t\t" + bill26 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==27) {
			    double initialprice = 55;
			    bill27 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("HandWash: \t" + itemqnty + "Pcs \t\t" + bill27 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==28) {
			    double initialprice = 85;
			    bill28 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("SanitoryNapkins: \t" + itemqnty + "Pcs \t\t" + bill28 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==29) {
			    double initialprice = 40;
			    bill29 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Paper Napkins: \t" + itemqnty + "Bottle \t" + bill29 + "/-");
			    System.out.println("-------------------------------------");
			}
			else if(itemno==30) {
			    double initialprice = 20;
			    bill30 = initialprice * itemqnty;
			    System.out.println("-------------------------------------");
			    System.out.println("Name\t     Quantity\t     TotalPrice");
			    System.out.println("Mineral Water: \t" + itemqnty + "Pcs \t\t" + bill30 + "/-");
			    System.out.println("-------------------------------------");
			}


			
			finalbill = bill1 + bill2 + bill3 + bill4 + bill5 + bill6 + bill7 + bill8 + bill9 + bill10 + bill11 + bill12 + bill13 + bill14 + bill15 + bill16 + bill17 + bill18 + bill19 + bill20 + bill21 + bill22 + bill23 + bill24 + bill25 + bill26 + bill27 + bill28 + bill29 + bill30;

			System.out.println("TOTAL BILL TO PAY:"+finalbill);
			
			System.out.print("Press 1 TO ADD ANOTHER ITEM TO CART....");
			ch=sc.nextInt();
			
		}
		
		return finalbill;
	}
	
	
	
	
	void payment(double finalbill1) {
		if(mymoney<finalbill1) {
			System.out.println("ARE BHIKARI KAHI KE AAYA BADA ONLINE SHOPPING KARNE PEHLE ACCOUNT ME PESE TO RAKHLE");
		}
		else {
			Scanner sc= new Scanner(System.in);
			String password;
			System.out.println("ENTER YOUR PASSWORD");
			password=sc.nextLine();
			if(password.equals(passcode)){
				mymoney=mymoney-finalbill1;
				System.out.println("PAYMENT SUCCESSSFULLY DONE");
				System.out.println("AVAILABLE BALANCE: "+mymoney);
			}
		}
	}
}
public class DMart_SimulatorMiniProject {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		MyDmartMain.list();
		MyDmartMain c1= new MyDmartMain();
		c1.getMyDetails();
		double finalbill=c1.shop();
		c1.payment(finalbill);
		int n;
		System.out.println("Press 1 for Generate Bill");
		n=sc.nextInt();
		if(n==1) {
			c1.showMyDetails();
			c1.showBillInformation();
		}
		else {
			System.out.println("Exiting The Code............");
		}
		
	}
}