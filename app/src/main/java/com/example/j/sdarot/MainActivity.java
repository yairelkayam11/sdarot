package com.example.j.sdarot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1;
    Button btn2;
    Button btn3;
    EditText et1;
    EditText et2;
    String st1;
    String st2;
    String st3;
    String st4;
    int a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        st1=et1.getText().toString();
        st2=et2.getText().toString();


    }

    public void yair1(View view) {

        a=1;


    }
    public void yair2(View view) {

        a=2;

    }
    public void yair3(View view) {

        Intent t = new Intent(this,SecondActivity.class);
        t.putExtra("STkey1",st1);
        t.putExtra("STkey2",st2);
        t.putExtra("key1",a);
        startActivity(t);



    }


}


