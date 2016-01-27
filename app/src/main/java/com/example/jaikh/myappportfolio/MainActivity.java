package com.example.jaikh.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.nio.charset.Charset;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(View view){
        Context context = getApplicationContext();
        CharSequence text="";
        switch (view.getId())
        {
            case R.id.app1:
                text="Spotify Streamer App";
                        break;
            case R.id.app2:
                text="Football Scores App";
                break;
            case R.id.app3:
                text="Library App";
                break;
            case R.id.app4:
                text="Build It Bigger App";
                break;
            case R.id.app5:
                text="XYZ Reader App";
                break;
            case R.id.app6:
                text="Capstone App";
                break;
        }
        Toast.makeText(context,"This button will launch my "+text+"!", Toast.LENGTH_SHORT).show();
    }
}
