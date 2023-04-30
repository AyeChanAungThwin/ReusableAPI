package io.github.ayechanaungthwin.api.reuseable.model;

import java.io.Serializable;

public abstract class Entity<ID extends Comparable<ID> & Serializable> {

    private ID id;

    public Entity() {

    }

    public Entity(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
