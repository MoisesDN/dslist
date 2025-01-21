package com.moisesdias.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String gender;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescriptions;
    private String longDescriptions;

    public Game() {
    }

    public Game(Long id, String title, String longDescriptions, String platforms, Integer year, String gender, Double score, String imgUrl, String shortDescriptions) {
        this.id = id;
        this.title = title;
        this.longDescriptions = longDescriptions;
        this.platforms = platforms;
        this.year = year;
        this.gender = gender;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescriptions = shortDescriptions;
    }

    public String getLongDescriptions() {
        return longDescriptions;
    }

    public void setLongDescriptions(String longDescriptions) {
        this.longDescriptions = longDescriptions;
    }

    public String getShortDescriptions() {
        return shortDescriptions;
    }

    public void setShortDescriptions(String shortDescriptions) {
        this.shortDescriptions = shortDescriptions;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
