package com.example.admin.lifecylcle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Go22(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity .class);
        startActivity(intent);
    }

    public void showLog(View view) {
    }

    public void goX(View view) {
        Log.d("FT App", "Button Clicked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FT APP", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FT APP", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FT APP", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FT APP", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FT APP", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FT APP", "onRestart");
    }
}
