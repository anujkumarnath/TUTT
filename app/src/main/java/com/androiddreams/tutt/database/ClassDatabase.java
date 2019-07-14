package com.androiddreams.tutt.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ClassEntry.class}, version = 1, exportSchema = false)
public abstract class ClassDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "class_table";
    private static final Object LOCK = new Object();
    private ClassDatabase sInstance;

    /**
     * Singleton pattern is used so that only one instance of the database object is
     * created and the block is made thread safe such that multiple threads running at the same time
     * cannot create multiple instances.
     */
    public ClassDatabase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(context, ClassDatabase.class, ClassDatabase.DATABASE_NAME)
                            //TODO: remove this later
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return sInstance;
    }

    public abstract ClassDao classDao();
}
