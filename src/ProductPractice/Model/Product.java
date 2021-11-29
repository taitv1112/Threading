package ProductPractice.Model;

import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

//Quản lý sản phẩm.(id, name, price, date, soluong)
//1. Thêm sản phẩm.
//2. Xoá.
//3. Show
//Yc: id tự tăng, price, soluong phải là số, nếu nhập sai bắt nhập lại, số lượng phải lớn hơn hoặc =0. Date là ngày hiện tại.
public class Product {
    private  int id ;
    private String name;
    private  double price;
    private LocalDate today ;
    private int quantity;
    static private int idnumber;

    public Product(String name, double price,  int quantity) {
        this.id = idnumber++;
        this.name = name;
        this.price = price;
        this.today = LocalDate.now();
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", today=" + today +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
