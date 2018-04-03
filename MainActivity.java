package com.example.android.practiceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    int total = 0;
    int val = 0;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bm, bd, bs, ba, b_equal;
    EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.zero);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        bm = (Button) findViewById(R.id.Divide);
        bd = (Button) findViewById(R.id.mul);
        bs = (Button) findViewById(R.id.sub);
        ba = (Button) findViewById(R.id.add);
        b_equal = (Button) findViewById(R.id.result);
        edit_text = (EditText) findViewById(R.id.show);

    b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit_text.setText(edit_text.getText().toString() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit_text.setText(edit_text.getText().toString() + "1");
            }
        });
    }
}
