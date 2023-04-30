package io.github.ayechanaungthwin.api.reuseable.model;

import io.github.ayechanaungthwin.api.reuseable.common.Color;
import io.github.ayechanaungthwin.api.reuseable.common.Predicate;

public class ColorPredicate implements Predicate<Long, Product> {

    private Color color;

    public ColorPredicate(Color color) {
        this.color = color;
    }

    @Override
    public boolean isMatched(Product product) {
    	boolean found = false;
    	for (Color out: product.getColorList()) {
    		if (out==color) {
    			found = true;
    			break;
    		}
    	}
        return found;
    }
}
