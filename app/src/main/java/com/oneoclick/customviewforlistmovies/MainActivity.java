//Apply from
//ref http://mystou.com/android-project-custom-view-basic-1/
//2May2019 Chaichon Loi-ruk

package com.oneoclick.customviewforlistmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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


    }//void

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
