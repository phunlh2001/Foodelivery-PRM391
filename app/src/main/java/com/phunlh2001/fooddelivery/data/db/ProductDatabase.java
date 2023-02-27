package com.phunlh2001.fooddelivery.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import com.phunlh2001.fooddelivery.data.dao.ProductDAO;
import com.phunlh2001.fooddelivery.data.model.Product;

@Database(entities = {Product.class}, version = 2)
public abstract class ProductDatabase extends RoomDatabase {
    private static ProductDatabase INSTANCE;

    public abstract ProductDAO getProductDAO();
    public static ProductDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.inMemoryDatabaseBuilder(context.getApplicationContext(), ProductDatabase.class)
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
