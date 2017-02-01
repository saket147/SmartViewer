package com.example.socket.smartviewer;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launch(View view) {
        Intent intent = new Intent(this, Launched.class);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, view, "hello");
        startActivity(intent, options.toBundle());
    }
}
