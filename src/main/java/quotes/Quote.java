package quotes;

public class Quote {
    String author;
    String text;

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }
    public String toString() {
        return String.format("Author: %s \nQuote: %s ", author, text);
    }
    public String getAuthor() {
        return author;
    }
    public String getText() {
        return text;
    }
public static Quote randomQuoteGenerator (Quote [] quotes){
    int randomNumber = (int) Math.floor(Math.random() *  quotes.length);
    return quotes[randomNumber];
}
}
