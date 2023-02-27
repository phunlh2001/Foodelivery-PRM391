package com.phunlh2001.fooddelivery.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import com.phunlh2001.fooddelivery.data.dao.UserDAO;
import com.phunlh2001.fooddelivery.data.model.User;

@Database(entities = {User.class}, version = 2)
public abstract class UserDatabase extends RoomDatabase {
    private static UserDatabase INSTANCE;

    public abstract UserDAO getUserDAO();
    public static UserDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.inMemoryDatabaseBuilder(context.getApplicationContext(), UserDatabase.class)
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
