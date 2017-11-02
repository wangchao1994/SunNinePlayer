package com.we.rightmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import com.we.rightmusicplayer.entity.SongBillListBean;
import com.we.rightmusicplayer.net.NetCallBack;
import com.we.rightmusicplayer.net.NetManager;
import com.we.rightmusicplayer.utils.ToastUtil;


public class MainActivity extends AppCompatActivity implements XRecyclerView.LoadingListener{
    private XRecyclerView xRecyclerView;
    private FrameLayout bottom_container;
    private int mPage = 0;
    private int type = 1;
    private int size = 10;
    private int offset = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onRefresh();
        initData();
    }

    public void onRefresh() {
        initData();
    }

    @Override
    public void onLoadMore() {
        initData();
    }

    /**
 * 初始化数据
 * */
    private void initView() {
        xRecyclerView = findViewById(R.id.rv_container);
        bottom_container = findViewById(R.id.fl_bottom_container);
    }
/**
 * 数据加载
 * */
    private void initData() {

        NetManager.getInstance().getSongBillListData(type, size, offset, new NetCallBack<SongBillListBean>() {
            @Override
            public void onSuccess(SongBillListBean songBillListBean) {
                Log.d("music data","songbean==========>"+songBillListBean);
            }
            @Override
            public void onFailure(String msg) {
                super.onFailure(msg);
                ToastUtil.showShortToast(App.app,msg);
            }
        });

    }

}
