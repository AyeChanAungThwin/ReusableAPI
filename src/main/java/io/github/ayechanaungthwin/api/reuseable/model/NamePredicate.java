package io.github.ayechanaungthwin.api.reuseable.model;

import io.github.ayechanaungthwin.api.reuseable.common.Predicate;

public class NamePredicate implements Predicate<Long, Product> {

    private String name;

    public NamePredicate(String name) {
        this.name = name;
    }

    @Override
    public boolean isMatched(Product product) {
    	boolean found = false;
    	if (name==product.getName()) {
    			found = true;
    	}
        return found;
    }
}
