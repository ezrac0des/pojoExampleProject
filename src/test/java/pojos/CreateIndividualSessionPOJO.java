package pojos;

public class CreateIndividualSessionPOJO {

    //1. private fieldlarimizi olusturulim
    private String title;
    private int price;
    private int showPrice;
    private int duration;
    private int blockBefore;
    private int blockAfter;
    private int paymentRequired;
    private int bookable;
    private String description;
    private boolean success;

    //2. getter ve setterlar olusturalim
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(int showPrice) {
        this.showPrice = showPrice;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBlockBefore() {
        return blockBefore;
    }

    public void setBlockBefore(int blockBefore) {
        this.blockBefore = blockBefore;
    }

    public int getBlockAfter() {
        return blockAfter;
    }

    public void setBlockAfter(int blockAfter) {
        this.blockAfter = blockAfter;
    }

    public int getPaymentRequired() {
        return paymentRequired;
    }

    public void setPaymentRequired(int paymentRequired) {
        this.paymentRequired = paymentRequired;
    }

    public int getBookable() {
        return bookable;
    }

    public void setBookable(int bookable) {
        this.bookable = bookable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    //3. constructor
    public CreateIndividualSessionPOJO(){

    }

    public CreateIndividualSessionPOJO(String title, int price, int showPrice, int duration, int blockBefore, int blockAfter, int paymentRequired, int bookable, String description) {
        this.title = title;
        this.price = price;
        this.showPrice = showPrice;
        this.duration = duration;
        this.blockBefore = blockBefore;
        this.blockAfter = blockAfter;
        this.paymentRequired = paymentRequired;
        this.bookable = bookable;
        this.description = description;
    }

    public CreateIndividualSessionPOJO(boolean success){
        this.success= success;
    }

    //4. toString()

    @Override
    public String toString() {
        return "CreateIndividualSessionPOJO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", showPrice=" + showPrice +
                ", duration=" + duration +
                ", blockBefore=" + blockBefore +
                ", blockAfter=" + blockAfter +
                ", paymentRequired=" + paymentRequired +
                ", bookable=" + bookable +
                ", description='" + description + '\'' +
                ", success=" + success +
                '}';
    }
}
