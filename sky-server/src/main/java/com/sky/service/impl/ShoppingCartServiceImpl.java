package com.sky.service.impl;

import com.sky.dto.ShoppingCartDTO;
import com.sky.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShoppingCartServiceImpl implements ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */

    public void addShoppingCart(ShoppingCartDTO shoppingCartDTO) {
        //判断当前加入购物车中的商品是否已经存在了

        //如果已经存在了，只需要将数量加一

        //如果不存在，需要插入一条购物车数据
    }
}
