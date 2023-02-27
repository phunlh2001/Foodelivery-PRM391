package com.phunlh2001.fooddelivery.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import com.phunlh2001.fooddelivery.utils.Helper;
import java.sql.Timestamp;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(tableName = "products")
public class Product {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int ID;
    @ColumnInfo(name = "product_name")
    private String name;
    @ColumnInfo(name = "product_category")
    private String category;
    @ColumnInfo(name = "cover_image")
    private String coverImage;
    @ColumnInfo(name = "product_price")
    private double price;
    @ColumnInfo(name = "stock")
    private int stock;
    @ColumnInfo(name = "description")
    private String desc;
    @ColumnInfo(name = "created_date")
    private Timestamp createdDate;
    @ColumnInfo(name = "expired_date")
    private Timestamp expiredDate;

    public String formatDate() {
        return Helper.get_format_date(createdDate);
    }
}
