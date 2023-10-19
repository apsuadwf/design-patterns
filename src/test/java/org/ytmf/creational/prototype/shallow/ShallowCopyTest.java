package org.ytmf.creational.prototype.shallow;

import org.junit.jupiter.api.Test;

/**
 * @author XieRongji
 * @date 2023/10/19 15:41
 **/
public class ShallowCopyTest {

    @Test
    public void test(){
        PlayList playlist = new PlayList();
        playlist.setId(1L);
        playlist.setListName("杰伦");
        playlist.addSong(new Song("稻香","杰伦"));
        playlist.addSong(new Song("迷迭香","杰伦"));
        playlist.addSong(new Song("七里香","杰伦"));

        // 浅拷贝后的最喜爱的专辑
        PlayList favouriteList = new PlayList(playlist);
        favouriteList.addSong(new Song("曹操","林俊杰"));
        System.out.println(favouriteList);
    }

    @Test
    public void cloneTest(){
        PlayList2 playlist = new PlayList2();
        playlist.setId(1L);
        playlist.setListName("杰伦");
        playlist.addSong(new Song("稻香","杰伦"));
        playlist.addSong(new Song("迷迭香","杰伦"));
        playlist.addSong(new Song("七里香","杰伦"));

        // 浅拷贝后的最喜爱的专辑
        PlayList2 favouriteList = playlist.clone();
        System.out.println(favouriteList);
    }
}
