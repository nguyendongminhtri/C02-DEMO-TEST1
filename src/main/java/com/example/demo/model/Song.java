package com.example.demo.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nameSong;
    @NotBlank
    @Lob
    private String lyrics;

    private String avatarUrl;

    private String mp3Url;
    @ManyToOne
    User user;
    public Song() {
    }

    public Song(Long id, @NotBlank String nameSong, @NotBlank  String lyrics, String avatarUrl, String mp3Url, User user) {
        this.id = id;
        this.nameSong = nameSong;
        this.lyrics = lyrics;
        this.avatarUrl = avatarUrl;
        this.mp3Url = mp3Url;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getMp3Url() {
        return mp3Url;
    }

    public void setMp3Url(String mp3Url) {
        this.mp3Url = mp3Url;
    }
}
