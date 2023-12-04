package com.example.springbootsampleec.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootsampleec.entities.Cart;
import com.example.springbootsampleec.entities.Item;
import com.example.springbootsampleec.entities.User;
import com.example.springbootsampleec.repositories.CartRepository;
import com.example.springbootsampleec.services.CartService;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private final CartRepository cartRepository;
	
	public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    } 
	
	
	 @Transactional(readOnly = true)
	    @Override
	    public List<Cart> findAll() {
	        return cartRepository.findAll();
	    }
	//カート一覧
	@Transactional(readOnly = true)
    @Override
    public List<Cart> getCartItems(User user) {
        return cartRepository.findByUser(user);
    }
    
    //カートに登録
    @Transactional(readOnly = false)
    @Override
    public void register(User user, Item item, int amount) {
    	// Cart エンティティの生成
        Cart cart = new Cart(null,null, null , amount, null, null);
        
         // Cart を保存
         cartRepository.saveAndFlush(cart);
       }
    
    //カートID取得
    @Transactional(readOnly = true)
    @Override
    public Optional<Cart> findById(long id) {
        return cartRepository.findById(id);
    }
    
    //削除
    @Transactional
    @Override
    public void delete(long id) {
        Cart cart =  findById(id).orElseThrow();
        cartRepository.delete(cart);
    }
 
	

}
