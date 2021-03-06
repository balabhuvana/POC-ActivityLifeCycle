package com.example.balamurugan_se.poc_activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private EditText et1, et2;
    private String ET_ONE_VALUE, ET_TWO_VALUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate()");
        initView();
    }

    private void initView() {
        try {
            et1 = (EditText) findViewById(R.id.etOne);
            et2 = (EditText) findViewById(R.id.etTwo);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    public void nextActivity(View view) {
        Intent mIntent = new Intent(this, SecondActivity.class);
        startActivity(mIntent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState()");
        et1.setText(savedInstanceState.getString(ET_ONE_VALUE));
        et2.setText(savedInstanceState.getString(ET_TWO_VALUE));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause()");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState()");
        outState.putString(ET_ONE_VALUE, et1.getText().toString());
        outState.putString(ET_TWO_VALUE, et2.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy()");
        super.onDestroy();
    }
}
