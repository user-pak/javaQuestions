package sava.tutorial.inheritance;

public class Run {
	
	class Book {
		
		String ISBN;
		
		Book(String ISBN) {
			
			this.ISBN = ISBN;
		}
		
		String getISBN() {
			
			return ISBN;
		}
		
		
		public boolean equals(Object obj) {
			
			if(obj instanceof Book) {
				
				return getISBN().equals(((Book) obj).getISBN());
			}else {
				
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run run = new Run();
		Book book1 = run.new Book("12345");
		Book book2 = run.new Book("12345");
		
		if(book1.equals(book2)) 
			System.out.println("objects are equal");
		else
			System.out.println("objects are not equal");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
	}

}
