public class Main {
    public static void main(String[] args) {
        Book Well = new BookWell();
        Book Lose = new BookLose();
        Book Out = new BookOut();

        Reader.getInstance().setState(Well);
        Reader.getInstance().bookState();

        Reader.getInstance().setState(Lose);
        Reader.getInstance().bookState();

        Reader.getInstance().setState(Out);
        Reader.getInstance().bookState();

    }
}