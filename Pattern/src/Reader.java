public class Reader implements Book{
    public static Reader client;
    private Reader(){}
    private Book book;
    public static Reader getInstance(){
        if(client == null) { client = new Reader(); }
        return client;
    }

    public Book getHand() {
        return book;
    }

    public void setState(Book book) {
        this.book = book;
    }

    @Override
    public void bookState() {
        this.book.bookState();
    }
}
