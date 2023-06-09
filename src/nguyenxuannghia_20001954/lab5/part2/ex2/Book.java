package nguyenxuannghia_20001954.lab5.part2.ex2;

public class Book {

    private String name;
    private double price;
    private int qty;
    private Author[] authors;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();

        for (Author author : authors) {
            build.append("Book[name = ")
                .append(name)
                .append(", authors={")
                .append(author)
                .append("}")
                .append(", price = ")
                .append(price)
                .append(", qty = ")
                .append(qty)
                .append("\n");
        }
        return build.toString();
    }
}
