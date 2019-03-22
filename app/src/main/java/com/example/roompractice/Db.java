package com.example.roompractice;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = (Entitiyyy.class),version = 1)
public abstract class Db extends RoomDatabase {

    public abstract MyDao getDao();

    private static volatile Db obj;
    static Database getDatabase(final Context context) {
        if (obj == null) {
            synchronized (Database.class) {
                if (obj== null) {
                    obj= Room.databaseBuilder(context.getApplicationContext(),
                            Db.class, "Db")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return (Database) obj;

    }


}
