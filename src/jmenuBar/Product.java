/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmenuBar;

/**
 *
 * @author MANH TRUONG
 */
class Product {
        private String productId,name,unit;
//    unit là đơn vị sản phầm,productId là tên sản phẩm
    private double price;
//    price là giá sản phầm 
    private String provider;
//    provider là nhà cung cấp sản phầm 

    Product(String p01, String oil, int i, String can) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Product(String productId, String name, String unit, double price, String provider) {
        this.productId = productId;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.provider = provider;
    }

    public Product() {
    }
}
