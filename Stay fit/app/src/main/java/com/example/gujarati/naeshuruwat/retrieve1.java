package com.example.gujarati.naeshuruwat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import java.util.ArrayList;

public class retrieve1 extends AppCompatActivity {
    TextView _text1,_text2,_text3,_text4,_text5,_text6,_rap1,_rap2,_rap3,_rap4,_rap5,_rap6;

   public static ArrayList<String> s,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve1);
        _text1=(TextView)findViewById(R.id.rev1);
        _text2=(TextView)findViewById(R.id.rev2);
        _text3=(TextView)findViewById(R.id.rev3);
        _text4=(TextView)findViewById(R.id.rev4);
        _text5=(TextView)findViewById(R.id.rev5);
        _text6=(TextView)findViewById(R.id.rev6);
        _rap1=(TextView)findViewById(R.id.rep1);
        _rap2=(TextView)findViewById(R.id.rep2);
        _rap3=(TextView)findViewById(R.id.rep3);
        _rap4=(TextView)findViewById(R.id.rep4);
        _rap5=(TextView)findViewById(R.id.rep5);
        _rap6=(TextView)findViewById(R.id.rep6);


        d=new ArrayList<String>();
        s=new ArrayList<String>();
      Intent reintent=getIntent();
        if(weekdays.count==1) {
            d = reintent.getStringArrayListExtra("d1");
            s = reintent.getStringArrayListExtra("s1");
        }
        else if(weekdays.count==2)
        {
            d = reintent.getStringArrayListExtra("d2");
            s = reintent.getStringArrayListExtra("s2");
        }
        else if(weekdays.count==3)
        {
            d = reintent.getStringArrayListExtra("d3");
            s = reintent.getStringArrayListExtra("s3");
        }
        else if(weekdays.count==4)
        {
            d = reintent.getStringArrayListExtra("d4");
            s = reintent.getStringArrayListExtra("s4");
        }
        else if(weekdays.count==5)
        {
            d = reintent.getStringArrayListExtra("d5");
            s = reintent.getStringArrayListExtra("s5");
        }
        else if(weekdays.count==6)
        {
            d = reintent.getStringArrayListExtra("d6");
            s = reintent.getStringArrayListExtra("s6");
        }
        else if(weekdays.count==7)
        {
            d = reintent.getStringArrayListExtra("d7");
            s = reintent.getStringArrayListExtra("s7");
        }
            _text1.setText(""+d.get(0));
            _text2.setText(""+d.get(1));
            _text3.setText(""+d.get(2));
            _text4.setText(""+d.get(3));
            _text5.setText(""+d.get(4));
            _text6.setText(""+d.get(5));

            _rap1.setText(""+s.get(0));
            _rap2.setText(""+s.get(1));
            _rap3.setText(""+s.get(2));
            _rap4.setText(""+s.get(3));
            _rap5.setText(""+s.get(4));
            _rap6.setText(""+s.get(5));





    }
}
