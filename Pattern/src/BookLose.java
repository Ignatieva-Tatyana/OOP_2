public class BookLose implements Book{
    @Override
    public void bookState() {
        System.out.println("Книга утеряна или списана");
    }
}
