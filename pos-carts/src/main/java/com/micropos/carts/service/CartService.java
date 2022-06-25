package com.micropos.carts.service;

import com.micropos.carts.model.Cart;
import com.micropos.carts.model.Item;
import com.micropos.dto.OrderDto;

import java.util.List;
import java.util.Optional;

public interface CartService {

    Double getTotal(Cart cart);

    Double getTotal(Integer cartId);

    OrderDto checkout(Cart cart);

    Optional<OrderDto> checkout(Integer cartId);

    Cart createCart(Cart cart);

    Cart add(Cart cart, Item item);

    List<Cart> getAllCarts();

    Optional<Cart> getCart(Integer cartId);

}
