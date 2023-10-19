package org.ytmf.creational.prototype.shallow;

import lombok.Data;

/**
 * @author XieRongji
 * @date 2023/10/19 15:36
 **/
@Data
public class Song {

    /*
        歌名
     */
    private String title;
    /*
        作者
     */
    private String author;

    public Song(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
