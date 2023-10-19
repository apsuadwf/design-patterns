package org.ytmf.creational.prototype.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
public class PlayList2 implements Serializable,Cloneable {
    private Long id;

    private String listName;

    private List<Song> songList;

    public PlayList2(PlayList2 sourcePlayList) {
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

    @Override
    public PlayList2 clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (PlayList2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
