
public class Book {
	
	String name;
	Author author;
	double price;
	int qty;
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	String getName() { return name;}
	Author getAuthor() { return author;}
	double getPrice() { return price;}
	int getQty() {return qty;}
	void setPrice(double price) {
		this.price = price;
	}
	void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return "'" + name + " ' by " + author;
		}

	public static void main(String[] args) {
		Author x = new Author("Ebenezer Ashong", "eash@gmail.org", 'm');
		System.out.println(x);
        Book y = new Book("Vital Signs",a,20.99,150);
        System.out.println(y);
       
		

	}

}
