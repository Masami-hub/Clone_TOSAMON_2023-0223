package com.example.springbootsampleec.entities;
 
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//<<<<<<< HEAD

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//=======

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//>>>>>>> 2521b75b7534d94418e0fca8d72d4f3fab2420ae
 
@Getter
@Setter

//@Data
@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "item")
@Entity


//itemテーブルのカラム設定
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 商品id
    
    @Column(name = "stock", nullable = false)
    private int shop_id; // 店舗id
 
    @Column(name = "name", length = 200, nullable = false)
    private String name; // 商品名
    
    @Column(name = "price", nullable = false)
    private int price; // 価格
    
    @Column(name = "main_img", length = 100, nullable = false)
    private String image;  // メイン画像
    
    @Column(name = "img_1", length = 100, nullable = true)
    private String img_1;  // サブ画像1
    
    @Column(name = "img_2", length = 100, nullable = true)
    private String img_2;  // サブ画像2
    
    @Column(name = "img_3", length = 100, nullable = true)
    private String img_3;  // サブ画像3
    
    @Column(name = "stock", nullable = false)
    private int stock; // 在庫数
    
    @Column(name = "type", nullable = false)
    private int type; // 商品の種類
    
    @Column(name = "description", length = 1000, nullable = false)
    private String description; // 商品説明
 
//<<<<<<< HEAD
   // @Column(name = "image", length = 100, nullable = false)
    //private String image;  // 画像
    
    // 作成日時
    //@Column(name="createAt",nullable = false, updatable = false, insertable = false, 
//=======

    @Column(name="createdAt",nullable = false, updatable = false, insertable = false, 
//>>>>>>> 2521b75b7534d94418e0fca8d72d4f3fab2420ae
    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private ZonedDateTime createdAt;   // 登録
 
//<<<<<<< HEAD
    // 更新日時
  //  @Column(name="updateAt",nullable = false, updatable = false, insertable = false, 
//=======
    
    @Column(name="updatedAt",nullable = false, updatable = false, insertable = false, 
//>>>>>>> 2521b75b7534d94418e0fca8d72d4f3fab2420ae
    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private ZonedDateTime updatedAt;   // 更新日時
 
}