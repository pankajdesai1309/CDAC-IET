package exam.booklist;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookUser {

	public static void main(String[] args) throws IOException 
	{
		
		ArrayList<Book> booklist = new ArrayList<Book>();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("---------------------------");
			System.out.println("Enter your choice");
			System.out.println("1.Add Book to list"); 
			System.out.println("2.Remove Book from list"); 
			System.out.println("3.Show all Books"); 
			System.out.println("4.Show all Books in sorted order using cost"); 
			System.out.println("5.Find a Book with book name"); 
			System.out.println("6.Save all book details into file"); 
			System.out.println("7.Quit");
			
			choice= sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter book name");
				String name= sc.next();
				System.out.println("Enter book cost");
				double cost= sc.nextDouble();
				System.out.println("Enter author name");
				String authorname= sc.next();
				
				booklist.add(new Book(name,authorname,cost));
				
			    break;
			    
			case 2:
				System.out.println("Enter Book name to remove from list:");
				String remname=sc.next();
				int i=0;
				boolean flag=false;
				
				for(i=0;i<booklist.size();i++)
				{
					if(booklist.get(i).getBookName().equalsIgnoreCase(remname))
					{
						flag=true;
						break;
					}
				}
				if(flag==true)
				{
					booklist.remove(i);
					System.out.println("Book is removed from list");
				}
				else
				{
					System.out.println("Entered name not found in the list.");
				}
			    break;
			    			    
			case 3:
				for(int j=0;j<booklist.size();j++)
				{
					System.out.println(booklist.get(j));
					System.out.println("-------xxx-------");
				}
				break;
				
			case 4:
				System.out.println("Books sorted by Cost:");
				Collections.sort(booklist, new CostComparator());
				break;
				
			case 5:
				System.out.print("Enter Book name to search: ");
				String bookname=sc.next();
				findBook(booklist,bookname);
				break;
				
			case 6:
				FileOutputStream fout= new FileOutputStream("F:\\CoreJavaExam\\BookMenuDriven");
				PrintWriter objout = new PrintWriter(fout);
				
				for(int k=0;k<booklist.size();k++)
				{
					objout.println(booklist.get(k));
					objout.println("-----------------------------");
				}
				objout.flush();
				objout.close();
				break;
				
			default:
				System.out.println("Please Enter valid choice!!!");
				break;
			}
			
		}while(choice!=7);
		 
		sc.close();
		
	}//end of main
	
	public static void findBook(ArrayList<Book> booklist,String name) 
	{
		for(Book b : booklist)
		{
			if(b.getBookName().equalsIgnoreCase(name))
				System.out.println(b);
		}
	}

}//end of class

class CostComparator implements Comparator<Book>{    

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getBookCost()>o2.getBookCost()) return 1;
		if(o1.getBookCost()<o2.getBookCost()) return -1;
		else return 0;
	}
	
}


