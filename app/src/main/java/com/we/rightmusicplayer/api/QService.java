package com.we.rightmusicplayer.api;


import com.we.rightmusicplayer.entity.SongBillListBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wangchao on 17-11-1.
 */

public interface QService {
/**
 *
 * method=baidu.ting.billboard.billList&size=10&
 * from=webapp_music&type=1&offset=0&calback=&format=json"
 * */
    @GET("/v1/restserver/ting?method=baidu.ting.billboard.billList&from=webapp_music&calback=&format=json")
    Observable<SongBillListBean> getBillListenBean(
      @Query("size") int size,
      @Query("type") int type,
      @Query("offset") int offset
    );

}
