package io.github.ayechanaungthwin.api.reuseable.model;

import io.github.ayechanaungthwin.api.reuseable.common.Filter;
import io.github.ayechanaungthwin.api.reuseable.common.Predicate;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter implements Filter<Long, Product> {

    //We will never modify the class we have created.
    //Or else, it will violates OCP.
    @Override
    public List<Product> filter(List<Product> products, Predicate<Long, Product> predicate) {
        return products
                .stream()
                .filter(predicate::isMatched)
                .collect(Collectors.toList());
    }
}
