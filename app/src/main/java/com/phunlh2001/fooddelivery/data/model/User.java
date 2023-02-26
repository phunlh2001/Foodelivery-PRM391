package com.phunlh2001.fooddelivery.data.model;

import android.arch.persistence.room.*;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(tableName = "users")
public class User {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long ID;
    @ColumnInfo(name = "first_name")
    private String firstName;
    @ColumnInfo(name = "last_name")
    private String lastName;
    @ColumnInfo(name = "username")
    private String userName;
    @ColumnInfo(name = "password")
    private String password;
}
