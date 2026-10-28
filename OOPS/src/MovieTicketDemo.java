import java.util.Scanner;

class MovieTicket{
	
    int movieId;
	String movieName;
	String language;
	double price;
	
	MovieTicket(int id,String name,String language,double price)
	{
		movieId = id;
		movieName = name;
		this.language = language;
		this.price = price;
		
		
	}
	
	void displayInfo()
	{
		System.out.println("Movie ID : "+movieId);
		System.out.println("Movie Name : "+movieName);
		System.out.println("Movie Language : "+language);
		System.out.println("Movie Price : "+price);
		System.out.println("---------------------------------------------------------------------------------");
		
	}
	
	void getDetailsUser() {
		Scanner sc= new Scanner(System.in);
		String name;
		long phone;
		System.out.println("Enter Your Name");
		name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Your Phone Number: ");
		phone=sc.nextLong();
	}
}
public class MovieTicketDemo {

	public static void main(String[] args) {
		  int id; int quntity;double total;
         Scanner sc = new Scanner(System.in);
         
         MovieTicket[] movies = new MovieTicket[7];
         movies[0] = new MovieTicket(1001,"HouseFull","English",300);
         movies[1] = new MovieTicket(1002,"HouseFull2","Hindi",350);
         movies[2] = new MovieTicket(1003,"HouseFull3","English",400);
         movies[3] = new MovieTicket(1004,"HouseFull5","Hindi",400);
         movies[4] = new MovieTicket(1005,"Sun of Sardaar","English",400);
         movies[5] = new MovieTicket(1006,"Baahubali2","Tamil",400);
         movies[6] = new MovieTicket(1007,"Taare Jaami par","Talgu",400);
         
         System.out.println("Available Movie : ");
         for(MovieTicket m : movies) {
        	   m.displayInfo();
        	  
         }
         
         
         System.out.println("Enter Movie ID to book : ");
         id = sc.nextInt();
         boolean found = false;
         
         for(MovieTicket m : movies) 
         {
          	 if(m.movieId == id)
          	 {
          		 System.out.println("Enter number of tickets :");
          		 quntity = sc.nextInt();
          		 total = quntity * m.price;
          		 
          		System.out.println("Booking Confirm!.....");
                m.displayInfo();
                System.out.println("Tickts : "+quntity);
                System.out.println("Total Cost : "+total);
                found = true;
                break;
          	 }
          	 
          	 
         }
         
         
         if(!found) {
        	 System.out.println("Movie ID not Found!");
         }
         
         sc.close();
         
	}

}

