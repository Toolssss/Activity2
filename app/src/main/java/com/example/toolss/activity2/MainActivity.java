package com.example.toolss.activity2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SecondActivity(View view) {
        //Intent intent = new Intent(this, Main2Activity.class);
        //String text = ((Button)view).getText().toString();
        //intent.putExtra("num",Integer.parseInt(text));
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData((Uri.parse("http://myitschool.ru")));
        startActivity(intent);
    }

}
