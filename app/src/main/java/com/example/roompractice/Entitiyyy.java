package com.example.roompractice;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Note")
public class Entitiyyy {


    @PrimaryKey
    String Note;

    public Entitiyyy() {

    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
}
