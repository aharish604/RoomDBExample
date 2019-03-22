package com.example.roompractice;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Query("SELECT * FROM Note")
   LiveData<List<Entitiyyy>> getnote();

    @Insert
    void insert(Entitiyyy entitiyyy);

    @Delete
    void  delete(Entitiyyy entitiyyy);

}
