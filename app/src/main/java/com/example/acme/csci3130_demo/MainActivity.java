package com.example.acme.csci3130_demo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    TextInputEditText tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.TV);
        btn=(Button) findViewById(R.id.btn);
        tf=(TextInputEditText) findViewById(R.id.TF);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                tv.setText(tf.getText());
            }
        });
    }
}
