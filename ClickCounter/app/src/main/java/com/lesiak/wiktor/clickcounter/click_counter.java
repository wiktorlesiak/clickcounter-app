package com.lesiak.wiktor.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class click_counter extends AppCompatActivity {

    Button btn1;
    TextView txtView1;
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_counter);

        btn1 = (Button)findViewById(R.id.button1);
        txtView1 = (TextView)findViewById(R.id.textView1);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                txtView1.setText("Clicks: " +clickCount);
            }
        });






    }
}
