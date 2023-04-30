package io.github.ayechanaungthwin.api.reuseable.model;

import io.github.ayechanaungthwin.api.reuseable.common.Predicate;

public class RamAndColorPredicate implements Predicate<Long, Product> {

    private RamPredicate ramPredicate;
    private ColorPredicate colorPredicate;

    public RamAndColorPredicate(RamPredicate ram, ColorPredicate color) {
        this.ramPredicate = ram;
        this.colorPredicate = color;
    }

    @Override
    public boolean isMatched(Product product) {
    	boolean foundRAM = ramPredicate.isMatched(product);
    	boolean foundColor = colorPredicate.isMatched(product);
        return foundRAM&&foundColor;
    }
}
