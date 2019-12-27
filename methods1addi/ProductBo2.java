package methods1addi;

public class ProductBo2
{
    private long id;
private String productName;
private String supplierName;
private int price;

public void displayProductDetails(Product2 product)
{
System.out.println("Product Id is "+product.getId());
System.out.println("Product Name is "+product.getProductName());
System.out.println("Supplier Name is "+product.getSupplierName());
System.out.println("Product price is "+product.getPrice());
}

public void updateProductName(Product2 product, String pname)
{
product.setProductName(pname);
}
public void updateSupplierName(Product2 product, String sname)
{
product.setSupplierName(sname);
}
public void updateProductPrice(Product2 product, Integer p)
{
product.setPrice(p);
}
}