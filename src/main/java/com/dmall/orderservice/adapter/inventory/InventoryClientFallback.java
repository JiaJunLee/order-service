package com.dmall.orderservice.adapter.inventory;

import org.springframework.stereotype.Component;

/**
 * @author Burgess Li
 * @version 1.0
 * @date 5/31/2019 4:37 PM
 **/
@Component
public class InventoryClientFallback implements InventoryClient {
  @Override
  public String lock(Lock lock) {
    return null;
  }

  @Override
  public void unlock(String lockId) {
  }

}
