package kr.co.tjoeun.a20200317_03_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String sendMessage = getIntent().getStringExtra("message");

        Log.d("받아온String", sendMessage);

    }
}
