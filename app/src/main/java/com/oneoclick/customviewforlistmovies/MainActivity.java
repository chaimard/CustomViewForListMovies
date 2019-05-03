//Apply from
//ref http://mystou.com/android-project-custom-view-basic-1/
//2May2019 Chaichon Loi-ruk

package com.oneoclick.customviewforlistmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matchingView();
        createAdapter();
        setMyAdapter();
        setOnClick();


    }//void

    private void setOnClick() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"เลือก "+position,Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setMyAdapter() {
        listView.setAdapter(adapter);
    }

    private void createAdapter() {
        adapter = new CustomerAdapter(getApplicationContext());
    }

    private void matchingView() {
        listView = (ListView) findViewById(R.id.listView);
    }
}//main
