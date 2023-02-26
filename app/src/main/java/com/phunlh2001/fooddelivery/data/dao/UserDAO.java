package com.phunlh2001.fooddelivery.data.dao;

import android.arch.persistence.room.*;

import com.phunlh2001.fooddelivery.data.model.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert
    void insert(User... user);

    @Update
    void update(User... user);

    @Query(value = "DELETE FROM users WHERE id = :id")
    void delete(int id);

    @Query(value = "SELECT * FROM users")
    List<User> getAllUser();
}
