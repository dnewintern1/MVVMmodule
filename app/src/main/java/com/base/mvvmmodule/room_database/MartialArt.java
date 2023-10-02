package com.base.mvvmmodule.room_database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Martial_art_table")

public class MartialArt {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "fav_martial_art")
    public String mFavMartialArt;

    public MartialArt(@NonNull String favMartialArt) {

        mFavMartialArt = favMartialArt;

    }

    public String getFavmaterialArt() {
        return mFavMartialArt;
    }
}
