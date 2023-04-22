
public class Book {
	private String title;
	private String isbn;
	private int numPages;
	private boolean onLoan;

	public Book(String title, String isbn, int numPages) {
		this.title = title;
		this.isbn = isbn;
		this.numPages = numPages;
		this.onLoan = false;
	}
	public boolean isOnLoan() {
		return onLoan;
	}
	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}
	public String getTitle() {
		return title;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getNumPages() {
		return numPages;
	}
	public String toString() {
		return title + ": " +
				isbn + ", " +
				numPages + " pages, " +
				"on loan:" + onLoan;
	}
}










