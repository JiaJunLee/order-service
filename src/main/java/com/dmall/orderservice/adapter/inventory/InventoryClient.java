package com.dmall.orderservice.adapter.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "inventory-service")
public interface InventoryClient {

    @RequestMapping(method = RequestMethod.GET, path = "/inventories/lock")
    String lock(Lock lock);

    @RequestMapping(method = RequestMethod.PUT, path = "/inventories/lock")
    void unlock(@PathVariable("lockId") String lockId);
}
