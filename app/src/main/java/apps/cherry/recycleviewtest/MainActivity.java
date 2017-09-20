package apps.cherry.recycleviewtest;

import android.app.Activity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import apps.cherry.recycleviewtest.data.entities.Friend;

public class MainActivity extends AppCompatActivity {



    RecyclerView recyclerView;
    FriendsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView    = (RecyclerView) findViewById(R.id.rv_friends);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter         = new FriendsAdapter(this, getData());
        recyclerView.setAdapter(adapter);

    }

    public List<Friend> getData(){

        List<Friend> items = new ArrayList<>();

        items = new ArrayList();

        for (int i=0 ; i< 4 ; i++){
            String title            = "Tarjeta A "+i;
            String name             = "name A "+i;
            String lastname         = "lastname A "+i;
            String url              = "www.google.com";

            items.add(new Friend(title, name, lastname, url));
        }
        for (int i=0 ; i< 3 ; i++){
            String title            = "Tarjeta B "+i;
            String name             = "name B "+i;
            String lastname         = "lastname B "+i;
            String url              = "www.facebook.com";

            items.add(new Friend(title, name, lastname, url));
        }
        return items;

    }

}
