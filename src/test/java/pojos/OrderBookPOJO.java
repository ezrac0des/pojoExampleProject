package pojos;


import java.io.Serializable;

public class OrderBookPOJO {
    /*
    pojo ne degildir
    - extends yoktur, inheritance olmamasi gerekir
    - implements yoktur, interface implementationi olmamali
    - disaridan annotation yoktur
     */

    /*
    encapsulation - private, getter, setter
    javaBean
    - bos, parametresiz constructor -> no args constructor
    - properties, fields private olmali
    - public getter & setters
    - serializable ->
     */

    /*
    {
     "bookId": {{book_id}},
     "customerName": "{{$randomFirstName}}"
    }

    {
    "created": true,
    "orderId": "60zzCn0_aGCImnHdR0Xha"
    }
     */

    //1. adim: private degiskenler olusturmak
    private int bookId;
    private String name;
    private boolean created;
    private String orderId;

    //2. adim: getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    //3. adim: parametreli ve parametresiz constructor
    public OrderBookPOJO(){

    }

    public OrderBookPOJO(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }

    public OrderBookPOJO(boolean created) {
        this.created = created;
    }

    //4. adim: toString methodu
    @Override
    public String toString() {
        return "OrderBookPOJO{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
