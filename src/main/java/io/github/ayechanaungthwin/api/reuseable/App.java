package io.github.ayechanaungthwin.api.reuseable;

import java.util.ArrayList;
import java.util.List;

import io.github.ayechanaungthwin.api.reuseable.common.Color;
import io.github.ayechanaungthwin.api.reuseable.common.RAM;
import io.github.ayechanaungthwin.api.reuseable.common.ROM;
import io.github.ayechanaungthwin.api.reuseable.model.ColorPredicate;
import io.github.ayechanaungthwin.api.reuseable.model.Product;
import io.github.ayechanaungthwin.api.reuseable.model.ProductFilter;
import io.github.ayechanaungthwin.api.reuseable.model.RamAndColorPredicate;
import io.github.ayechanaungthwin.api.reuseable.model.RamPredicate;

public class App {
    
	public static void main( String[] args ) {
		//Created Product Filter (Created only once)
		ProductFilter productFilter = new ProductFilter();
		//Filter RAM
		List<Product> ramFilterList = productFilter.filter(
				getListOfProduct(), 
					new RamPredicate(RAM.x4GB)
				);
		
		//output
		for (Product out: ramFilterList) {
			System.out.println(out);
		}
		
		//Filter RAM and Color
		List<Product> ramAndColorFilterList = productFilter.filter(
				getListOfProduct(),
					new RamAndColorPredicate(
						new RamPredicate(RAM.x16GB),
						new ColorPredicate(Color.Green)
					)
				);
		//output
		for (Product out: ramAndColorFilterList) {
			System.out.println(out);
		}
    }
	
	public static List<Product> getListOfProduct() {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1L, "Samsung", List.of(RAM.x4GB), List.of(Color.Green), List.of(ROM.x128GB), 320000.0));
		list.add(new Product(2L, "Samsung", List.of(RAM.x4GB), List.of(Color.Green), List.of(ROM.x128GB), 300000.0));
		list.add(new Product(3L, "Samsung", List.of(RAM.x4GB), List.of(Color.Red), List.of(ROM.x64GB), 250000.0));
		
		list.add(new Product(4L, "Huawei", List.of(RAM.x8GB), List.of(Color.Green), List.of(ROM.x128GB), 380000.0));
		
		list.add(new Product(5L, "Oppo", List.of(RAM.x16GB), List.of(Color.Red), List.of(ROM.x128GB), 340000.0));
		list.add(new Product(6L, "Oppo", List.of(RAM.x16GB), List.of(Color.Green), List.of(ROM.x128GB), 450000.0));
		return list;
	}
}
