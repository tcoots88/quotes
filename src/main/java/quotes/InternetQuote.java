package quotes;

public class InternetQuote {
    String quoteText;
    String quoteAuthor;
    public InternetQuote(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }    public String toString() {
        return String.format("QuoteText : %s \nQuoteAuthor: %s ", quoteText, quoteAuthor);
    }
}
