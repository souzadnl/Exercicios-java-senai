class Book implements Borrowable {
    private String title;
    private boolean borrowed;

    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("The book '" + title + "' has been borrowed.");
        } else {
            System.out.println("This book is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("This book is not currently borrowed.");
        }
    }
}