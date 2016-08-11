package com.example.niraj.humptyapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ListActivity extends AppCompatActivity {

    private static List<Heritage> heritages = new ArrayList<>();

    private Adapter mAdapter;

    static {
        for (int i = 0; i < 1; i++) {
            Heritage heritage1 = new Heritage(R.drawable.rambagh, "Anantara Jaipur The Palm");
            heritages.add(heritage1);
        }
        for (int j = 0; j < 1; j++) {
            Heritage heritage = new Heritage(R.drawable.hotel, "Jaipur Heritage");
            heritages.add(heritage);
        }
        for (int k = 0; k < 1; k++){
            Heritage heritage2 = new Heritage(R.drawable.download, "Sunset of jaipur");
            heritages.add(heritage2);
        }

    }

    public ListActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        mAdapter = new Adapter(this, heritages);

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(mAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(ListActivity.this,StructureActivity.class);
                startActivity(i);
            }
        });

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Dubai");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}
