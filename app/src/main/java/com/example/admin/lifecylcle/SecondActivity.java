package com.example.admin.lifecylcle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void GoBack(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity .class);
        startActivity(intent);
        this.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FT APP", "onStop 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FT APP", "onDestroy 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FT APP", "onPause 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FT APP", "onResume 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FT APP", "onStart 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FT APP", "onRestart 2");
    }
}
