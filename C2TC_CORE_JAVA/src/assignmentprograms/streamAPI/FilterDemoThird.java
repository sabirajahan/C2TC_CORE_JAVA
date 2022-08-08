package assignmentprograms.streamAPI;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) 
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class FilterDemoThird 
{

	public static void main(String[] args) 
	{
		List<Product> productsList = new ArrayList<Product>(); 
		productsList.add(new Product(1, "HP", 36000));
		productsList.add(new Product(2, "Dell", 30000));
		productsList.add(new Product(3, "Lenovo", 25000));
		productsList.add(new Product(4, "Sony", 28000));
		productsList.add(new Product(5, "Apple", 90000));
		
		productsList.stream()
			.filter(p-> p.price>25000)
			.forEach(pr->System.out.println(pr.price));

	}

}