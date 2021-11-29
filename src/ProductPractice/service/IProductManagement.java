package ProductPractice.service;

import ProductPractice.Model.Product;

import java.util.List;

public interface IProductManagement {
    ////1. Thêm sản phẩm.
    ////2. Xoá.
    ////3. Show
    ////Yc: id tự tăng, price, soluong phải là số, nếu nhập sai bắt nhập lại, số lượng phải lớn hơn hoặc =0. Date là ngày hiện tại.
    void addProduct(Product product);
    void deleteProduct(int id);
    List<Product> findAll();
}
