import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Library ozuLib = new Library("Ozyegin Library", 1232121);
		Library nationalLib = new Library("National Library", 9996666);
		
		ozuLib.addBook(new Book("Deitel's Java", "444-43-2", 305));
		ozuLib.addBook(new Book("Clean Code", "555-42-6", 305));
		ozuLib.addBook(new Book("Discrete Math", "411-78-9", 305));
		ozuLib.addBook(new Book("Calculus", "345-12-0", 305));
		nationalLib.addBook(new Book("Ince Memed", "234-09-9", 987));
		nationalLib.addBook(new Book("Aylak Adam", "123-90-8", 45));
		nationalLib.addBook(new Book("Tutunamayanlar", "987-90-8",748));
		nationalLib.addBook(new Book("Alice in Wonderland","234-854-90-1",457));
		
		System.out.println(ozuLib);
		System.out.println(nationalLib);	
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a title to search (empty to quit):");
			String title = input.nextLine();
			if(title.equals("")) break;
			
			if(ozuLib.contains(title)) {
				System.out.println(title + " exists at OzU Lib.");
			} else if(nationalLib.contains(title)) {
				System.out.println(title + " exists at National Lib.");
			} else {
				System.out.println(title + " not found.");
			}
		}
	}
}
