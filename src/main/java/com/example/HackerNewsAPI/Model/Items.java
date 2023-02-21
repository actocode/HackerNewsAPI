package com.example.HackerNewsAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;


@Table
@Entity
public class Items {

    private long id;
    private boolean deleted;
    private String type;
    private String username;
    private Date time;
    private String text;
    private boolean dead;
    private long parent;
    private long poll;
    private List<Long> kids;
    private String url;
    private int score;
    private String title;
    private List<Integer> parts;
    private int descedants;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public long getPoll() {
        return poll;
    }

    public void setPoll(long poll) {
        this.poll = poll;
    }

    public List<Long> getKids() {
        return kids;
    }

    public void setKids(List<Long> kids) {
        this.kids = kids;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getParts() {
        return parts;
    }

    public void setParts(List<Integer> parts) {
        this.parts = parts;
    }

    public int getDescedants() {
        return descedants;
    }

    public void setDescedants(int descedants) {
        this.descedants = descedants;
    }
}
