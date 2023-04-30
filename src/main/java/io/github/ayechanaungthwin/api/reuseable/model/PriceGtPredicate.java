package io.github.ayechanaungthwin.api.reuseable.model;

import io.github.ayechanaungthwin.api.reuseable.common.Predicate;

public class PriceGtPredicate implements Predicate<Long, Product> {

    private Double price;

    public PriceGtPredicate(Double price) {
        this.price = price;
    }

    @Override
    public boolean isMatched(Product product) {
        return product.getPrice()>this.price;
    }
}
