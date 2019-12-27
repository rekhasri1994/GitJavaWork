package methods1addi;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

Scanner sc= new Scanner(System.in);

System.out.println("Enter the product id");
long getId= sc.nextLong();

        sc.nextLine();
System.out.println("Enter the product name");
String getProductName= sc.nextLine();

System.out.println("Enter the supplier name");
String getSupplierName= sc.next();

System.out.println("Enter the product price");
int getPrice= sc.nextInt();

ProductBo2 pb= new ProductBo2();
Product2 pa=new Product2(getId,getProductName,getSupplierName,getPrice);
pb.displayProductDetails(pa);

System.out.println("Update Menu :\n1) Update product name\n2) Update supplier name\n3) Update product price");
System.out.println("Enter Choice");
int a=sc.nextInt();

if(a==1)
{
System.out.println("Enter new product name");
       String pname= sc.next();
       pb.updateProductName(pa, pname);
}
else if(a==2)
{
System.out.println("Enter new supplier name");
            String sname= sc.next();
            pb.updateSupplierName(pa, sname);
}
else
{
System.out.println("Enter new product price");
            int p= sc.nextInt();
            pb.updateProductPrice(pa, p);
}
Product2 pc=new Product2(getId,getProductName,getSupplierName,getPrice);
   pb.displayProductDetails(pa);
}

}