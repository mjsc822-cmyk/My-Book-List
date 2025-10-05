public class MyBookList {
    public static void main(String[] args) {
        // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
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
    	public class BookList {

    			public static void main(String[] args) {
    				
    				Scanner input = new Scanner(System.in);
    				String [] titles = {"Rich Dad Poor Dad","The Power of Habit","Atomic Habits","Java Programming","Favorite Book"};
    				String [] authors= {"Robert Kiyosaki","Charles Duhigg","James Clear","John Doe","Maximus Lord"};
    				int [] dates = {1997,2012,2018,2020,2025};
    				int [] counts = new int[5];
    				Book listb = new Book(titles,authors,dates,counts);

        // 2.) Display the details of each book using the displayDetails method. Below is the sample output
        //     Title: Rich Dad Poor Dad, Author: Robert Kiyosaki, Year: 1997, Current Page: 0
        //     Title: The Power of Habit, Author: Charles Duhigg, Year: 2012, Current Page: 0
        //     Title: Atomic Habits, Author: James Clear, Year: 2018, Current Page: 0
        //     Title: Java Programming, Author: John Doe, Year: 2020, Current Page: 0

    				void displayDetails() {
    					
    					 System.out.println("\nMy Booklist : \n");
    					 for (int i=0; i<5; i++) 
    						  {	
    							System.out.println("Title: "+title[i]+", Author: "+author[i]+", Year: "+date[i]+", Current Page: "+count[i]); }
    						  }
    					
        // 3.) Change the current page of "Rich Dad Poor Dad" to 50 and "Atomic Habits" to 100 using the changePage method. Display the details again for the two books.
    	// 4.) Change the current page of your favorite book to any page number you like. Display the details again for your favorite book.

   /*3 and 4*/		int[] changePage(int [] nc) {
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
    				
        // 5.) Change the author of "Java Programming" to "Jane Smith". Display the details again for the book.

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
        // 6.) Create an array of Book objects to store all the books you created. Loop through the array and display the title of the books published after 2010.
		   		
		   	public class BookList {

    			public static void main(String[] args) {
    				
    				Scanner input = new Scanner(System.in);
    				String [] titles = {"Rich Dad Poor Dad","The Power of Habit","Atomic Habits","Java Programming","Favorite Book"};
    				String [] authors= {"Robert Kiyosaki","Charles Duhigg","James Clear","John Doe","Maximus Lord"};
    				int [] dates = {1997,2012,2018,2020,2025};
    				int [] counts = new int[5];
    				Book listb = new Book(titles,authors,dates,counts);
    				
    		
    	/*Loop through the array and display the title of the books published after 2010.*/	
		   	void yearSorter() { 
				
				System.out.println("The  books published after 2010 are: \n");
				for (int i = 0; i<=4; i++) {
				if(date[i] >= 2010) { 
					
					System.out.println("Title: "+title[i]+", "+date[i]+".");} 
				}
				
			}
		 	
		}
    }
}