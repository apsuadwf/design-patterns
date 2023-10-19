package org.ytmf.creational.prototype.shallow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 播放列表
 *
 * @author XieRongji
 * @date 2023/10/19 15:38
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayList {
    private Long id;

    private String listName;

    private List<Song> songList;

    public PlayList(PlayList sourcePlayList) {
        this.id = sourcePlayList.getId();
        this.listName = sourcePlayList.getListName();
        this.songList = sourcePlayList.getSongList();
    }

    public void addSong(Song song){
        if (null == songList){
            songList = new ArrayList<>();
        }
        this.songList.add(song);
    }

}
