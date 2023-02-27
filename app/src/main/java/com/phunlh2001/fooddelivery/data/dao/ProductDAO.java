package com.phunlh2001.fooddelivery.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import com.phunlh2001.fooddelivery.data.model.Product;
import java.util.List;

@Dao
public interface ProductDAO {
    @Insert
    void insert(Product... product);

    @Update
    void update(Product... product);

    @Query("DELETE FROM products WHERE id = :id")
    void delete(int id);

    @Query("SELECT * FROM products")
    List<Product> getAllProducts();

    @Query("SELECT * FROM products WHERE id = :id")
    Product getByID(int id);
}
