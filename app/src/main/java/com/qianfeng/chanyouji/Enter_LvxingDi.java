package com.qianfeng.chanyouji;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
=======
>>>>>>> origin/master
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
<<<<<<< HEAD
import android.widget.TextView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.qianfeng.chanyouji.adapter.Enter_LvxingDi_Adapter;
import com.qianfeng.chanyouji.netutils.DownLoadData;
import com.qianfeng.chanyouji.netutils.PaseJson;
import com.qianfeng.chanyouji.urls.FinalUrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
=======

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
>>>>>>> origin/master


public class Enter_LvxingDi extends ActionBarActivity  implements PullToRefreshBase.OnRefreshListener2<ListView>{

    private PullToRefreshListView pullListView;
<<<<<<< HEAD
    private String id;
    private static int pageIndex=1;
    List<HashMap<String, String>> hashMaps;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what==1) {//下拉刷新
                pullListView.onRefreshComplete();
                String s = (String) msg.obj;
                hashMaps.clear();
                //解析
                 hashMaps.addAll(PaseJson.jsonToEnter_AttractionsData(s));
                adapter.notifyDataSetChanged();


            }else if (msg.what==2){
                pullListView.onRefreshComplete();
                //加载更多
               String s =((String) msg.obj);
                hashMaps.addAll(PaseJson.jsonToEnter_AttractionsData(s));
                adapter.notifyDataSetChanged();

            }else if (msg.what==0){
                pullListView.onRefreshComplete();
            }
        }
    };
    private Enter_LvxingDi_Adapter adapter;
=======
>>>>>>> origin/master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter__lvxing_di);
        init();
<<<<<<< HEAD
        pullListView.setAdapter(adapter);
    }

    private void init() {
        hashMaps=new ArrayList<HashMap<String, String>>();
=======

    }

    private void init() {
>>>>>>> origin/master
        LinearLayout linner = (LinearLayout) findViewById(R.id.articlesback);
        linner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
<<<<<<< HEAD

        TextView textView_artitle = (TextView) findViewById(R.id.articles);
        Intent intent = getIntent();
        String name_zh_cn = intent.getStringExtra("name_Zh_Cn");
        textView_artitle.setText(name_zh_cn);
        id = intent.getStringExtra("id");
        pullListView = ((PullToRefreshListView) findViewById(R.id.articleslistview));
        pullListView.setMode(PullToRefreshBase.Mode.BOTH);
        pullListView.setOnRefreshListener(this);
        adapter = new Enter_LvxingDi_Adapter(this,hashMaps);

        //"https://chanyouji.com/api/destinations/attractions/45.json?page=1"
        DownLoadData.downData(this, FinalUrl.ENTER_ATTRACTIONS+id+".json?page=1",handler,1);

=======
        pullListView = ((PullToRefreshListView) findViewById(R.id.articleslistview));
        pullListView.setMode(PullToRefreshBase.Mode.BOTH);
        pullListView.setOnRefreshListener(this);
>>>>>>> origin/master


    }


    @Override
    public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
        //下拉刷新
<<<<<<< HEAD
        DownLoadData.downData(this, FinalUrl.ENTER_ATTRACTIONS+id+".json?page=1",handler,1);
=======

>>>>>>> origin/master

    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
      //上拉加载
<<<<<<< HEAD
        pageIndex++;
        DownLoadData.downData(this, FinalUrl.ENTER_ATTRACTIONS+id+".json?page="+pageIndex,handler,2);
=======
>>>>>>> origin/master
    }
}
