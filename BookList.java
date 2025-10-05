package activities;

import java.util.Scanner;

class Book{
	
	Scanner input = new Scanner(System.in); 
	String [] title;
	String [] author;
	 int [] date;
	 int [] count;
	 
	Book(String [] t,String [] a, int [] d, int [] c)
	{
	   
		title = t;
		author = a;
		date = d;
		count= c;
		
	 }
	
	void displayDetails() {
		
	 System.out.println("\nMy Booklist : \n");
	 for (int i=0; i<5; i++) 
		  {	
			System.out.println("Title: "+title[i]+", Author: "+author[i]+", Year: "+date[i]+", Current Page: "+count[i]); }
		  }
	
	int[] changePage(int [] nc) {
		System.out.println("Put the order number of a book(0-4): ");	
		while(!input.hasNextInt())
			{
				System.out.println("Thats not a number! Try Again.");
					input.nextLine();   
			}
			
			int f,s,t; 
			f = input.nextInt();	
	while(true) {
		
		
	
			if (f>=0&&f<=4) 
				{  
				System.out.println("You chosen the book: "+title[f]);
				System.out.println("\nInput Page Number: ");
				nc[f] = input.nextInt();
				System.out.println("\nChoose Another Book? Type 'y'(if yes), else type anykey... ");
				String r = input.next();
				if (r.equalsIgnoreCase("y")) {}
				else { System.out.println("Title: "+title[f]+", Current Page: "+count[f]); return nc;}
				
				System.out.println("Put the order number of a book(0-4): ");	
				s = input.nextInt();
				System.out.println("You chosen the book: "+title[s]);
				System.out.println("\nInput Page Number: ");
				nc[s] = input.nextInt();
				System.out.println("\nChoose Another Book? Type 'y'(if yes), else type anykey... ");
				r = input.next();
				if (r.equalsIgnoreCase("y")) {}
				else { 
					System.out.println("Title: "+title[f]+", Current Page: "+count[f]);
					System.out.println("Title: "+title[s]+", Current Page: "+count[s]); 
					return nc;}
				
				System.out.println("Put the order number of a book(0-4): ");	
				t = input.nextInt();
				System.out.println("You chosen the book: "+title[t]);
				System.out.println("\nInput Page Number: ");
				nc[t] = input.nextInt();
				System.out.println("\nResult: ");
				

				System.out.println("Title: "+title[f]+", Current Page: "+count[f]);
				System.out.println("Title: "+title[s]+", Current Page: "+count[s]);
				System.out.println("Title: "+title[t]+", Current Page: "+count[t]);
				return nc;
				}
			
			else {
				System.out.println("Error Book Number(0-4 only), Try again! "); 
				f = input.nextInt(); 
				}
			
			  } 
		}
	String [] changeAuthor(String []ac){ 
		
		System.out.println("Put the order number of a book(0-4): ");
		
	while(!input.hasNextInt()){
		System.out.println("Thats not a number! Try Again.");
			input.nextLine();   
			
			
	}
		
		int inc = input.nextInt();
		input.nextLine();
	
	while(true) {
		if(inc>=0&&inc<=4) {	
			System.out.println("You chosen the book: "+title[inc]);
			System.out.println("\nWhat will be the new author name?: ");	
			ac[inc] = input.nextLine();
			System.out.println("\nNew Author of: "+title[inc]+", is "+author[inc]+".");
			return ac;
			}
		else{
			  System.out.println("Invalid Book Order Number! Try again (0-4).");
			  inc = input.nextInt();
			  }
	}
		}
	
		void yearSorter() { 
		
		System.out.println("The  books published after 2010 are: \n");
		for (int i = 0; i<=4; i++) {
		if(date[i] >= 2010) { 
			
			System.out.println("Title: "+title[i]+", "+date[i]+".");} 
		}
		
	}
 	
}

public class BookList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String [] titles = {"Rich Dad Poor Dad","The Power of Habit","Atomic Habits","Java Programming","Favorite Book"};
		String [] authors= {"Robert Kiyosaki","Charles Duhigg","James Clear","John Doe","Maximus Lord"};
		int [] dates = {1997,2012,2018,2020,2025};
		int [] counts = new int[5];
		Book listb = new Book(titles,authors,dates,counts);
		listb.displayDetails();
		System.out.println();
		
while(true)	{	
		System.out.println("________________________________________");
		for (int i= 0; i<=4; ++i) {System.out.println("Book order list#: "+i+"."+titles[i]);}
		System.out.println("________________________________________");
		System.out.println("OPTIONS: \n");
		System.out.println("1.Change the current Page of a Book");
		System.out.println("2.Change the current Author of a Book");
		System.out.println("3.Sort all Book");
		System.out.println("4.Display All Book");
		
		
		String uoption = input.next();
		switch (uoption) {
			
		case "1": listb.changePage(counts);
				break;
		case "2": listb.changeAuthor(authors);
				break;
		case "3": listb.yearSorter();
				break;
		case "4": listb.displayDetails();
				break;		
		default: System.out.println("\nError!");
		}
		
  } 
	}
}
