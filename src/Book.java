
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
		System.out.println("�Ȿ��������ǣ�" + bookname);
		System.out.println("�Ȿ��������ǣ�" + author);
		System.out.println("�Ȿ������������ǣ�" + sales);
	}
}
