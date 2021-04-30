import java.util.ArrayList;
import java.util.List;

public class Product {

    private String id;
    private String name;
    private String price;
    private List<Stock> stockList;


    public Product(String id, String price, String name) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Product [" +
                "\n\tid = " + id + ", " +
                "\n\tprice = " + price + ", " +
                "\n\tname = " + name + ", " +
                "\n\tstockList = " + stockList + "" +
                "\n\t]";
    }

    public  List<Stock> delStockList(int id) {
        return (List<Stock>) stockList.remove(id);
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
