package io.github.ayechanaungthwin.api.reuseable.model;

import java.util.List;

import io.github.ayechanaungthwin.api.reuseable.common.Color;
import io.github.ayechanaungthwin.api.reuseable.common.RAM;
import io.github.ayechanaungthwin.api.reuseable.common.ROM;

public class Product extends Entity<Long> {

    //That's how your codes are not repeated.
    //You don't need to create id for every classes.
    private String name;
    private List<RAM> ramList;
    private List<Color> colorList;
    private List<ROM> romList;
    private double price;

    public Product() {
        super();
    }

	public Product(Long id, String name, List<RAM> ramList, List<Color> colorList, List<ROM> romList, double price) {
		super(id);
		this.name = name;
		this.ramList = ramList;
		this.colorList = colorList;
		this.romList = romList;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RAM> getRamList() {
		return ramList;
	}

	public void setRamList(List<RAM> ramList) {
		this.ramList = ramList;
	}

	public List<Color> getColorList() {
		return colorList;
	}

	public void setColorList(List<Color> colorList) {
		this.colorList = colorList;
	}

	public List<ROM> getRomList() {
		return romList;
	}

	public void setRomList(List<ROM> romList) {
		this.romList = romList;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", ramList=" + ramList + ", colorList=" + colorList + ", romList=" + romList
				+ ", price=" + price + "]";
	}
}
