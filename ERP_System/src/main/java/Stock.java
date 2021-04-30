import java.time.LocalDateTime;

public class Stock {

    private LocalDateTime date;
    private int Quantity;

    public Stock(LocalDateTime fechaingreso, int quantity) {
        super();
        this.date = fechaingreso;
        this.Quantity = quantity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "\n\t\t\tStock [date=" + date + ", Quantity=" + Quantity + "]";
    }

}
