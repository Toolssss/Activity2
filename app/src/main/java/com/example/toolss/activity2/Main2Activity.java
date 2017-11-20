package com.example.toolss.activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = this.getIntent();
        int num = intent.getIntExtra("num",0);
        TextView textView = (TextView)findViewById(R.id.text);
        textView.setText((num*num)+"");
    }

    public void FirstActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
