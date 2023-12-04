package com.example.springbootsampleec.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootsampleec.entities.Cart;
import com.example.springbootsampleec.entities.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	List<Cart> findByUser(User user);

}
