package by.bsuir.ArabeyDiana.task12.runner;

import by.bsuir.ArabeyDiana.scanner.InputData;
import by.bsuir.ArabeyDiana.task12.classes.Book;

public class Task12Runner {

	public static void main(String[] args) {
		
			Book book1;
			Book book2;
			
			
			System.out.print("Enter book edition: ");
		    Book.setEdition(InputData.inputPositiveInt());
		        
	        try {
	        	
	            System.out.println("Set information about first book");
	            book1 = InputData.setInformationAboutBook();
	            
	            System.out.println("Set information about second book");
	            book2 = InputData.setInformationAboutBook();
	            
	        } catch (IllegalArgumentException e) {
	        	
	            System.out.println( e.getMessage());
	            return;
	        }

	        
	        System.out.println("Books hash codes:");
	        System.out.println("Book 1 hashCode: " + book1.hashCode());
	        System.out.println("Book 2 hashCode: " + book2.hashCode());

	        System.out.println("Are books equal? " + book1.equals(book2));

	        System.out.println("�ompare books: " + book1.compareTo(book2));

	}
	
	
	

}
