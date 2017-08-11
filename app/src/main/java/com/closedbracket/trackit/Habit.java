package com.closedbracket.trackit;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Zarif on 2017-05-09.
 */

public class Habit extends RealmObject{
    @PrimaryKey
    private long id;
    private String name;
    private Date created;
    private Date updated;
    private Date lastUpdated;
    private String repeat;
    private Date reminder;
    private int target;
    private int tracker;
    private int change;
    private int completion;

    //All of the getters and setters.
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getReminder() {
        return reminder;
    }

    public void setReminder(Date reminder) {
        this.reminder = reminder;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getTracker() {
        return tracker;
    }

    public void setTracker(int tracker) {
        this.tracker = tracker;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getCompletion() {
        return completion;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    //To string override to see habit info.
    @Override
    public String toString() {
        String temp = "Habit Name:" + getName() + ", Repeating: " + getRepeat() + ", Target: " + getTarget() + ", On track for: " + getTracker();
        return temp;
    }
}
