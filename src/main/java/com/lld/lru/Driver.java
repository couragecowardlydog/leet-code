package com.lld.lru;

import com.lld.lru.coupledds.Cache;
import com.lld.lru.coupledds.CoupledCache;

public class Driver {

    public static void main(String[] args) {
        Cache cache = new CoupledCache();
        cache.put("1", "1");
        cache.put("2", "2");
        cache.put("3", "3");
        cache.put("4", "4");
        System.out.println("----");
        System.out.println(cache.get("1"));
        System.out.println("----");
        cache.put("5", "5");

    }
}
