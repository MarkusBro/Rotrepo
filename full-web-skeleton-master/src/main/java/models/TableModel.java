package models;

import jdk.nashorn.internal.codegen.LocalStateRestorationInfo;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Time;
import java.text.DecimalFormat;
import java.time.LocalTime;

public class TableModel {
    Integer Rank;
    double Score;
    Integer Født;
    String Navn;
    String Klubb;
    Time Meter2000;
    Time Meter3000;
    Integer Meter60;
    Integer Krhev;
    double Sargeant;
    Integer Beveg;

    public TableModel(Integer rank, double score, Integer født, String navn, String klubb,Time meter2000, Time meter3000, Integer meter60, Integer krhev, double sargeant, Integer beveg) {
        Rank = rank;
        Score = score;
        Født = født;
        Navn = navn;
        Klubb = klubb;
        Meter2000 = meter2000;
        Meter3000 = meter3000;
        Meter60  = meter60;
        Krhev = krhev;
        Sargeant = sargeant;
        Beveg = beveg;

    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer rank) {
        Rank = rank;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public Integer getFødt() {
        return Født;
    }

    public void setFødt(Integer født) {
        Født = født;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public String getKlubb() {
        return Klubb;
    }

    public void setKlubb(String klubb) {
        Klubb = klubb;
    }

    public Time getMeter2000() {
        return Meter2000;
    }

    public void setMeter2000(Time meter2000) {
        Meter2000 = meter2000;
    }

    public Time getMeter3000() {
        return Meter3000;
    }

    public void setMeter3000(Time meter3000) {
        Meter3000 = meter3000;
    }

    public int getMeter60() {
        return Meter60;
    }

    public void setMeter60(Integer meter60) {
        Meter60 = meter60;
    }

    public Integer getKrhev() {
        return Krhev;
    }

    public void setKrhev(Integer krhev) {
        Krhev = krhev;
    }

    public double getSargeant() {
        return Sargeant;
    }

    public void setSargeant(double sargeant) {
        Sargeant = sargeant;
    }

    public Integer getBeveg() {
        return Beveg;
    }

    public void setBeveg(Integer beveg) {
        Beveg = beveg;
    }
}

