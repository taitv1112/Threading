package ProductPractice.service;

import ProductPractice.Model.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManagementImpl implements IProductManagement{
    List<Product> products = new LinkedList<>();
    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(id);

    }
    @Override
    public List<Product> findAll() {
       return  products;
    }

    ////1. Thêm sản phẩm.
    ////2. Xoá.
    ////3. Show
    ////Yc: id tự tăng, price, soluong phải là số, nếu nhập sai bắt nhập lại, số lượng phải lớn hơn hoặc =0. Date là ngày hiện tại.

}
