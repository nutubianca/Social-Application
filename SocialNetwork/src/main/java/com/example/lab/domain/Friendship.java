package com.example.lab.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Friendship extends Entity<Tuple<Integer,Integer>> {
    LocalDate date;
    boolean pending = true;
    public static final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public Friendship(Tuple<Integer,Integer> id) {
       super(id);
       this.date= LocalDate.now();
    }

    public Friendship(Tuple<Integer,Integer> id,LocalDate date) {
        super(id);
        this.date=date;
    }

    public Friendship(Tuple<Integer,Integer> id,LocalDate date, boolean pending) {
        super(id);
        this.date=date;
        this.pending = pending;
    }

    public Friendship(Tuple<Integer,Integer> id, boolean pending) {
        super(id);
        this.date= LocalDate.now();
        this.pending = pending;
    }

    public void setPending(boolean pending)
    {
        this.pending=pending;
    }
    public LocalDate getDate() {return date;}
    public boolean getPending() {return pending;}
    public void setData(LocalDate data) {
        this.date = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friendship that = (Friendship) o;
        return ((Objects.equals(this.getId().getLeft(), that.getId().getLeft()) && Objects.equals(this.getId().getRight(), that.getId().getRight()))
        ||(Objects.equals(this.getId().getLeft(), that.getId().getRight()) && Objects.equals(this.getId().getRight(), that.getId().getLeft())));
    }

    @Override
    public String toString() {
        return "Friendship{" +
                "user1=" + this.getId().getLeft().toString() +'\'' +
                "user2=" + this.getId().getRight().toString() +'\'' +
                "data= " + this.getDate();
    }
}
