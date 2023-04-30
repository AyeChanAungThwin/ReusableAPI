package io.github.ayechanaungthwin.api.reuseable.common;

import java.util.List;

import io.github.ayechanaungthwin.api.reuseable.model.Entity;
import io.github.ayechanaungthwin.api.reuseable.model.Product;

import java.io.Serializable;

public interface Filter<ID extends Comparable<ID> & Serializable, ITEM extends Entity<ID>> {
    List<Product> filter(List<Product> products, Predicate<ID, ITEM> predicate);
}
