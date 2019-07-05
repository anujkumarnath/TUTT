package com.androiddreams.tutt.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ClassDao {

    // Ordering the list of classes by the start time
    @Query("SELECT * FROM class ORDER BY start_time")
    List<ClassEntry> getClasses();

    @Insert
    void addClass(ClassEntry classEntry);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateClass(ClassEntry classEntry);

    @Delete
    void deleteClass(ClassEntry classEntry);
}
