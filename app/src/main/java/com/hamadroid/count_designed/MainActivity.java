package com.hamadroid.count_designed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        count=0;

    }
    public void plus(View view){
    count =  count+1;
    textView.setText(count+"");
    }
    public void minus (View view){
    count = count-1;
    textView.setText(count+"");
    }
    public void clear (View view){
        count = count=0;
        textView.setText("0");
    }

}
