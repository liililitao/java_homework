
class Book {
	private String bookname, author;
	private int sales;
	Book() {
		
	}
	Book(String bookname, String author, int sales) {
		this.bookname = bookname;
		this.author = author;
		this.sales = sales;
	}
	void setBook(String bookname, String author, int sales) {
		this.bookname = bookname;
		this.author = author;
		this.sales = sales;
	}
	void printBook() {
		System.out.println("这本书的书名是：" + bookname);
		System.out.println("这本书的作者是：" + author);
		System.out.println("这本书的月销售量是：" + sales);
	}
}
