package com.we.rightmusicplayer.api;


import com.we.rightmusicplayer.entity.PaySongBean;
import com.we.rightmusicplayer.entity.RecommandSongListBean;
import com.we.rightmusicplayer.entity.SearchSongBean;
import com.we.rightmusicplayer.entity.SongBillListBean;
import com.we.rightmusicplayer.entity.SongLrcBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


public interface MusicApi {

    String MUSIC_BASE_URL = "http://tingapi.ting.baidu.com/";
    String SUB_URL = "v1/restserver/ting";


    /**
     * 播放音乐
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<PaySongBean> getPaySongData(@QueryMap Map<String, String> params);

    /**
     * 歌词
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<SongLrcBean> getSongLrcData(@QueryMap Map<String, String> params);

    /**
     * 获取列表
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<SongBillListBean> getSongBillListData(@QueryMap Map<String, String> params);

    /**
     * 搜索
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<SearchSongBean> getSearchSongData(@QueryMap Map<String, String> params);

    /**
     * 获取歌手歌曲列表
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<SongLrcBean> getSingerSongList(@QueryMap Map<String, String> params);

    /**
     * 推荐列表
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<RecommandSongListBean> getRecommandSongList(@QueryMap Map<String, String> params);

    /**
     * 下载
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<SongLrcBean> downSong(@QueryMap Map<String, String> params);

    /**
     * 获取歌手信息
     * @param params
     * @return
     */
    @GET(SUB_URL)
    Call<SongLrcBean> getSingerInfo(@QueryMap Map<String, String> params);


}
