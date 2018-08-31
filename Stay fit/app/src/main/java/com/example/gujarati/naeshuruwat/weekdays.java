package com.example.gujarati.naeshuruwat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

public class weekdays extends AppCompatActivity {

     ArrayList<String> d1,d2,d3,d4,d5,d6,d7,s1,s2,s3,s4,s5,s6,s7;
    public static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekdays);

        d1=new ArrayList<String>();
        d2=new ArrayList<String>();
        d3=new ArrayList<String>();
        d4=new ArrayList<String>();
        d5=new ArrayList<String>();
        d6=new ArrayList<String>();
        d7=new ArrayList<String>();
        s1=new ArrayList<String>();
        s2=new ArrayList<String>();
        s3=new ArrayList<String>();
        s4=new ArrayList<String>();
        s5=new ArrayList<String>();
        s6=new ArrayList<String>();
        s7=new ArrayList<String>();

        Intent intent=getIntent();
        d1=intent.getStringArrayListExtra("d1");
        d2=intent.getStringArrayListExtra("d2");
        d3=intent.getStringArrayListExtra("d3");
        d4=intent.getStringArrayListExtra("d4");
        d5=intent.getStringArrayListExtra("d5");
        d6=intent.getStringArrayListExtra("d6");
        d7=intent.getStringArrayListExtra("d7");

        s1=intent.getStringArrayListExtra("s1");
        s2=intent.getStringArrayListExtra("s2");
        s3=intent.getStringArrayListExtra("s3");
        s4=intent.getStringArrayListExtra("s4");
        s5=intent.getStringArrayListExtra("s5");
        s6=intent.getStringArrayListExtra("s6");
        s7=intent.getStringArrayListExtra("s7");
    }

    public void one(View _view)
    {
        Intent thisintent=new Intent(this,retrieve2.class);
        thisintent.putStringArrayListExtra("d1",d1);
        thisintent.putStringArrayListExtra("s1",s1);
        startActivity(thisintent);
        count=1;
    }
    public void two(View _view)
    {
        Intent thisintent=new Intent(this,retrieve2.class);
        thisintent.putStringArrayListExtra("d2",d2);
        thisintent.putStringArrayListExtra("s2",s2);
        startActivity(thisintent);
        count=2;
    }

    public void three(View _view)
    {
        Intent thisintent=new Intent(this,retrieve2.class);
        thisintent.putStringArrayListExtra("d3",d3);
        thisintent.putStringArrayListExtra("s3",s3);
        startActivity(thisintent);
        count=3;
    }

    public void four(View _view)
    {
        Intent thisintent=new Intent(this,retrieve2.class);
        thisintent.putStringArrayListExtra("d4",d4);
        thisintent.putStringArrayListExtra("s4",s4);
        startActivity(thisintent);
        count=4;
    }

    public void five(View _view)
    {
        Intent thisintent=new Intent(this,retrieve2.class);
        thisintent.putStringArrayListExtra("d5",d5);
        thisintent.putStringArrayListExtra("s5",s5);
        startActivity(thisintent);
        count=5;
    }

    public void six(View _view)
    {
        Intent thisintent=new Intent(this,retrieve2.class);
        thisintent.putStringArrayListExtra("d6",d6);
        thisintent.putStringArrayListExtra("s6",s6);
        startActivity(thisintent);
        count=6;
    }

    public void seven(View _view)
    {
        Intent thisintent=new Intent(this,retrieve2.class);
        thisintent.putStringArrayListExtra("d7",d7);
        thisintent.putStringArrayListExtra("s7",s7);
        startActivity(thisintent);
        count=7;
    }
}
