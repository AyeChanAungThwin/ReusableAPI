package io.github.ayechanaungthwin.api.reuseable.model;

import io.github.ayechanaungthwin.api.reuseable.common.RAM;
import io.github.ayechanaungthwin.api.reuseable.common.Predicate;

public class RamPredicate implements Predicate<Long, Product> {

    private RAM ram;

    public RamPredicate(RAM ram) {
        this.ram = ram;
    }

    @Override
    public boolean isMatched(Product product) {
    	boolean found = false;
    	for (RAM out: product.getRamList()) {
    		if (out==ram) {
    			found = true;
    			break;
    		}
    	}
        return found;
    }
}
