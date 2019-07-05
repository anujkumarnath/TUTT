package com.androiddreams.tutt.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Class for a individual period(class)
 */
@Entity(tableName = "class")
public class ClassEntry {

    // Integer primary key
    @PrimaryKey(autoGenerate = true)
    private int id;

    // Fields
    private String subject;
    private String faculty;
    private String start_time;
    private String end_time;
    private String room_no;
    private String periods;
    private String notes;
    // Add more if required


    /**
     *  Room will use this constructor to create records
     * @param id represents the integer primary key for the database
     * @param subject represents the subject that will be taught
     * @param faculty represents the faculty
     * @param start_time represents when the class starts
     * @param end_time represents when teh class ends
     * @param room_no represents in which room the lacture will be carried on
     * @param periods represents the units of periods take by faculty
     * @param notes represents the notes stroed if any
     */
    public ClassEntry(int id, String subject, String faculty, String start_time, String end_time,
                      String room_no, String periods, String notes) {
        this.id = id;
        this.subject = subject;
        this.faculty = faculty;
        this.start_time = start_time;
        this.end_time = end_time;
        this.room_no = room_no;
        this.periods = periods;
        this.notes = notes;
    }

    /**
     * Room will use this constructor to read record from database
     * @param subject represents the subject that will be taught
     * @param faculty represents the faculty
     * @param start_time represents when the class starts
     * @param end_time represents when teh class ends
     * @param room_no represents in which room the lacture will be carried on
     * @param periods represents the units of periods take by faculty
     * @param notes represents the notes stroed if any
     */
    public ClassEntry(String subject, String faculty, String start_time, String end_time,
                      String room_no, String periods, String notes) {
        this.subject = subject;
        this.faculty = faculty;
        this.start_time = start_time;
        this.end_time = end_time;
        this.room_no = room_no;
        this.periods = periods;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getPeriods() {
        return periods;
    }

    public void setPeriods(String periods) {
        this.periods = periods;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
