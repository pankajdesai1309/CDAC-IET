package exam.booklist;

public class Book implements Comparable<Book>{
	
	private String bookName,authorName;
	private double bookCost;
	
	//parameterless constructor
	public Book() {}
	
	//parameterized constructor with author name hardcoded
	public Book(String bookName, double bookCost) {
		super();
		this.bookName = bookName;
		this.bookCost = bookCost;
		authorName= "Pablo Escobar";
	}

	//parameterized constructor with user entered value
	public Book(String bookName, String authorName, double bookCost) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookCost = bookCost;
	}
	
	//getter for Book Name
	public String getBookName()
	{
		return bookName;
	}

	//setter for Book Name
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}

	//getter for Author Name
	public String getAuthorName() 
	{
		return authorName;
	}

	//setter for Author Name
	public void setAuthorName(String authorName) 
	{
		this.authorName = authorName;
	}

	//getter for Book Cost
	public double getBookCost()
	{
		return bookCost;
	}

	//setter for Book Cost
	public void setBookCost(double bookCost) 
	{
		this.bookCost = bookCost;
	}

	@Override
	public String toString() {
		return "Book\nBookName:"+bookName+"\nAuthorName:"+authorName+"\nBookCost:"+bookCost;
	}//toString override

	@Override
	public int compareTo(Book o) {
		return  this.bookName.compareTo(o.bookName);
	}//method override

}
