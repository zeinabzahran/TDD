import java.util.ArrayList;
import java.util.List;

public class Cart{
	private int count;
	private double totalPrice;
	private List<Book> book = new ArrayList<>();
	public int getCount() {
		return book.size();
		}
	public void addBook(Book book) {
		this.book.add(book);	
	}
	public double getTotalPrice() {
		if (book.size() > 0) {
			for (Book b : book) {
				totalPrice = totalPrice +  b.getPrice();
			}
		}
		return totalPrice;	
		}
}
