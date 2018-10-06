package com.example.j.sdarot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView LV;
    Button btn;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    int i,j;
    int t;
    String [] arr1;
    String [] arr2;
    String st1;
    String st2;
    String sum;
    int x,y,sum1=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        LV = (ListView) findViewById(R.id.LV);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        btn = (Button) findViewById(R.id.btn);
    }



    public void yair(View view) {
        

        Intent gi = getIntent();
            st1 = gi.getStringExtra("STket1");
            st2 = gi.getStringExtra("STket2");
            t = gi.getIntExtra("key1",0);
            finish();




            x = Integer.parseInt(st1);
            y = Integer.parseInt(st2);




            if (t==1) {

                for (i = 0; i < 20; i++) {

                    x = x + y;


                    sum = Integer.toString(x);

                    arr1[i] = sum;

                }
                LV.setOnItemClickListener((AdapterView.OnItemClickListener) this);
                LV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

                ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr1);

                LV.setAdapter(adp);

            }

            else if (t==2) {

                for (i = 0; i < 20; i++) {

                    x = x * y;


                    sum = Integer.toString(x);

                    arr1[i] = sum;

                }
                LV.setOnItemClickListener((AdapterView.OnItemClickListener) this);
                LV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

                ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr1);

                LV.setAdapter(adp);

            }

        }


        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            tv2.setText(x);

            tv4.setText(y);

            tv6.setText(i+1);

            for (j=0;j<1;j++) {

                sum1=sum1+x;

            }

            tv8.setText(sum1);
        }
    }




