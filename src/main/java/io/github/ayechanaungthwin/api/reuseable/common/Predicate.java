package io.github.ayechanaungthwin.api.reuseable.common;

import io.github.ayechanaungthwin.api.reuseable.model.Entity;

import java.io.Serializable;

public interface Predicate<ID extends Comparable<ID> & Serializable, ITEM extends Entity<ID>> {
    boolean isMatched(ITEM item);
}
