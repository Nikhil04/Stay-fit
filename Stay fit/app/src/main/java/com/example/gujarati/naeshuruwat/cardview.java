package com.example.gujarati.naeshuruwat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class cardview extends AppCompatActivity {
    TextView _view1,view2,view3,view4,view5;
    CardView cd1;
    public static String str1,str2,str3,str4,str5,str6;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cardview);
        _view1 = (TextView) findViewById(R.id.tv2);
        view2 = (TextView) findViewById(R.id.tv3);
        view3 = (TextView) findViewById(R.id.tv4);
        view4 = (TextView) findViewById(R.id.tv5);
        bt=(Button) findViewById(R.id.bt5);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cardview.this,coachassign.class);
                startActivity(intent);
            }
        });
        _view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> s1,s2,s3,s4,s5,s6,s7,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30;
                d1 = new ArrayList<String>();
                d2 = new ArrayList<String>();
                d3 = new ArrayList<String>();
                d4 = new ArrayList<String>();
                d5 = new ArrayList<String>();
                d6 = new ArrayList<String>();
                d7 = new ArrayList<String>();

                s1 = new ArrayList<String>();
                s2 = new ArrayList<String>();
                s3= new ArrayList<String>();
                s4 = new ArrayList<String>();
                s5= new ArrayList<String>();
                s6 = new ArrayList<String>();
                s7 = new ArrayList<String>();

                d1.add("JUMPING JACKS");
                d1.add("PUSH-UPS");
                d1.add("SUPERMAN");
                d1.add("CURTSY LUNGES");
                d1.add("SIDE PLANK LEFT");
                d1.add("SIDE PLANK RIGHT");
                s1.add("15");
                s1.add("5");
                s1.add("15");
                s1.add("16");
                s1.add("20");
                s1.add("20");


                d2.add("JUMPING JACKS");
                d2.add("PUSH-UPS");
                d2.add("RUSSIAN TWIST");
                d2.add("CURTSY LUNGES");
                d2.add("SIDE PLANK LEFT");
                d2.add("SIDE PLANK RIGHT");
                s2.add("15");
                s2.add("6");
                s2.add("20");
                s2.add("15");
                s2.add("25");
                s2.add("25");

                d3.add("TRICEPS DIPS");
                d3.add("BIRD DOG");
                d3.add("HIGH STEPPING");
                d3.add("KNEE PUSH-UPS");
                d3.add("SIDE PLANK LEFT");
                d3.add("SIDE PLANK RIGHT");
                s3.add("5");
                s3.add("26");
                s3.add("20");
                s3.add("12");
                s3.add("25");
                s3.add("25");

                d4.add("SQUATS");
                d4.add("TRICEPS DIPS");
                d4.add("HIGH STEPPING");
                d4.add("CURTSY LUNGES");
                d4.add("SIDE PLANK LEFT");
                d4.add("SIDE PLANK RIGHT");
                s4.add("12");
                s4.add("6");
                s4.add("20");
                s4.add("26");
                s4.add("30");
                s4.add("30");

                d5.add("LUNGES");
                d5.add("PUSH-UPS");
                d5.add("HIGH STEPPING");
                d5.add("CURTSY LUNGES");
                d5.add("SIDE PLANK LEFT");
                d5.add("SIDE PLANK RIGHT");
                s5.add("30");
                s5.add("10");
                s5.add("25");
                s5.add("30");
                s5.add("30");
                s5.add("30");


                d6.add("SIDE LUNGES");
                d6.add("PUSH-UPS");
                d6.add("HIGH STEPPING");
                d6.add("CROSS ARM CRUNCHES");
                d6.add("WALL SIT");
                d6.add("PLANK");
                s6.add("30");
                s6.add("15");
                s6.add("30");
                s6.add("30");
                s6.add("45");
                s6.add("45");

                d7.add("SUPERMAN");
                d7.add("PUSH-UPS");
                d7.add("LEFT LUNGE KNEE HOPS");
                d7.add("RIGHT LUNGE KNEE HOPS");
                d7.add("SIDE PLANK LEFT");
                d7.add("SIDE PLANK RIGHT");
                s7.add("15");
                s7.add("20");
                s7.add("18");
                s7.add("18");
                s7.add("35");
                s7.add("35");

                Intent myintent=new Intent(cardview.this,weekdays.class);
                myintent.putStringArrayListExtra("d1",d1);
                myintent.putStringArrayListExtra("d2",d2);
                myintent.putStringArrayListExtra("d3",d3);
                myintent.putStringArrayListExtra("d4",d4);
                myintent.putStringArrayListExtra("d5",d5);
                myintent.putStringArrayListExtra("d6",d6);
                myintent.putStringArrayListExtra("d7",d7);

                myintent.putStringArrayListExtra("s1",s1);
                myintent.putStringArrayListExtra("s2",s2);
                myintent.putStringArrayListExtra("s3",s3);
                myintent.putStringArrayListExtra("s4",s4);
                myintent.putStringArrayListExtra("s5",s5);
                myintent.putStringArrayListExtra("s6",s6);
                myintent.putStringArrayListExtra("s7",s7);
                startActivity(myintent);


            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> s1,s2,s3,s4,s5,s6,s7,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30;

                d1 = new ArrayList<String>();
                d2 = new ArrayList<String>();
                d3 = new ArrayList<String>();
                d4 = new ArrayList<String>();
                d5 = new ArrayList<String>();
                d6 = new ArrayList<String>();
                d7 = new ArrayList<String>();

                s1 = new ArrayList<String>();
                s2 = new ArrayList<String>();
                s3= new ArrayList<String>();
                s4 = new ArrayList<String>();
                s5= new ArrayList<String>();
                s6 = new ArrayList<String>();
                s7 = new ArrayList<String>();

                d1.add("ABDOMINAL CRUNCHES");
                d1.add("REVERSE CRUNCHES");
                d1.add("CROSS ARM CRUNCHES");
                d1.add("PLANK");
                d1.add("SIDE PLANK LEFT");
                d1.add("SIDE PLANK RIGHT");
                s1.add("30");
                s1.add("30");
                s1.add("30");
                s1.add("30");
                s1.add("25");
                s1.add("25");

                d2.add("SIT UPS");
                d2.add("SUPERMAN");
                d2.add("ABDOMINAL CRUNCHES");
                d2.add("LEG RAISES");
                d2.add("SIDE PLANK LEFT");
                d2.add("SIDE PLANK RIGHT");
                s2.add("24");
                s2.add("20");
                s2.add("22");
                s2.add("22");
                s2.add("25");
                s2.add("25");

                d3.add("ABDOMINAL CRUNCHES");
                d3.add("SUPERMAN");
                d3.add("RUSSIAN TWIST");
                d3.add("HEEL TOUCH");
                d3.add("COBRAS");
                d3.add("PLANK");
                s3.add("26");
                s3.add("14");
                s3.add("44");
                s3.add("20");
                s3.add("25");
                s3.add("35");


                d4.add("ABDOMINAL CRUNCHES");
                d4.add("SUPERMAN");
                d4.add("REVERSE CRUNCHES");
                d4.add("LEG RAISES");
                d4.add("SIDE PLANK LEFT");
                d4.add("SIDE PLANK RIGHT");
                s4.add("28");
                s4.add("20");
                s4.add("28");
                s4.add("28");
                s4.add("30");
                s4.add("30");

                d5.add("SIT UPS");
                d5.add("SUPERMAN");
                d5.add("RUSSIAN TWIST");
                d5.add("BUTT BRIDGE");
                d5.add("LEG RAISES");
                d5.add("PLANK");
                s5.add("26");
                s5.add("24");
                s5.add("44");
                s5.add("24");
                s5.add("30");
                s5.add("40");

                d6.add("SUPERMAN");
                d6.add("REVERSE CRUNCHES");
                d6.add("LONG ARM CRUNCHES");
                d6.add("BUTT BRIDGE");
                d6.add("SIDE PLANK LEFT");
                d6.add("SIDE PLANK RIGHT");
                s6.add("15");
                s6.add("30");
                s6.add("30");
                s6.add("15");
                s6.add("30");
                s6.add("30");

                d7.add("SIT UPS");
                d7.add("SUPERMAN");
                d7.add("REVERSE CRUNCHES");
                d7.add("BUTT BRIDGE");
                d7.add("COBRAS");
                d7.add("PLANK");
                s7.add("30");
                s7.add("20");
                s7.add("30");
                s7.add("20");
                s7.add("30");
                s7.add("50");


                Intent myintent=new Intent(cardview.this,weekdays.class);
                myintent.putStringArrayListExtra("d1",d1);
                myintent.putStringArrayListExtra("d2",d2);
                myintent.putStringArrayListExtra("d3",d3);
                myintent.putStringArrayListExtra("d4",d4);
                myintent.putStringArrayListExtra("d5",d5);
                myintent.putStringArrayListExtra("d6",d6);
                myintent.putStringArrayListExtra("d7",d7);

                myintent.putStringArrayListExtra("s1",s1);
                myintent.putStringArrayListExtra("s2",s2);
                myintent.putStringArrayListExtra("s3",s3);
                myintent.putStringArrayListExtra("s4",s4);
                myintent.putStringArrayListExtra("s5",s5);
                myintent.putStringArrayListExtra("s6",s6);
                myintent.putStringArrayListExtra("s7",s7);
                startActivity(myintent);
            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ArrayList<String> s1,s2,s3,s4,s5,s6,s7,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30;

                d1 = new ArrayList<String>();
                d2 = new ArrayList<String>();
                d3 = new ArrayList<String>();
                d4 = new ArrayList<String>();
                d5 = new ArrayList<String>();
                d6 = new ArrayList<String>();
                d7 = new ArrayList<String>();

                s1 = new ArrayList<String>();
                s2 = new ArrayList<String>();
                s3= new ArrayList<String>();
                s4 = new ArrayList<String>();
                s5= new ArrayList<String>();
                s6 = new ArrayList<String>();
                s7 = new ArrayList<String>();

                d1.add("ARM CIRCLES");
                d1.add("PUSH-UPS");
                d1.add("TRICEPS DIPS");
                d1.add("MOUNTAIN CLIMBER");
                d1.add("PLANK");
                d1.add("");
                s1.add("15");
                s1.add("5");
                s1.add("10");
                s1.add("10");
                s1.add("35");
                s1.add("");

                d2.add("TRICEPS DIPS");
                d2.add("COBRAS");
                d2.add("FLOOR TRICEPS DIPS");
                d2.add("PLANK");
                d2.add("");
                d2.add("");
                s2.add("15");
                s2.add("10");
                s2.add("10");
                s2.add("35");
                s2.add("");
                s2.add("");

                d3.add("PUSH-UPS");
                d3.add("MOUNTAIN CLIMBER");
                d3.add("COBRAS");
                d3.add("PUNCHES");
                d3.add("PLANK");
                d3.add("");
                s3.add("8");
                s3.add("18");
                s3.add("12");
                s3.add("40");
                s3.add("35");
                s3.add("");


                d4.add("ARM CIRCLES");
                d4.add("TRICEPS DIPS");
                d4.add("PUSH-UP AND ROTATION");
                d4.add("PLANK");
                d4.add("");
                d4.add("");
                s4.add("20");
                s4.add("18");
                s4.add("10");
                s4.add("40");
                s4.add("");
                s4.add("");

                d5.add("ARM CIRCLES");
                d5.add("PUSH-UPS");
                d5.add("TRICEPS DIPS");
                d5.add("FLOOR TRICEPS DIPS");
                d5.add("PLANK");
                d5.add("");
                s5.add("25");
                s5.add("12");
                s5.add("20");
                s5.add("15");
                s5.add("40");
                s5.add("");

                d6.add("MOUNTAIN CLIMBER");
                d6.add("COBRAS");
                d6.add("PUNCHES");
                d6.add("FLOOR TRICEPS DIPS");
                d6.add("PLANK");
                d6.add("");
                s6.add("26");
                s6.add("16");
                s6.add("60");
                s6.add("16");
                s6.add("45");
                s6.add("");

                d7.add("ARM CIRCLES");
                d7.add("PUSH-UPS");
                d7.add("TRICEPS DIPS");
                d7.add("PLANK");
                d7.add("");
                d7.add("");
                s7.add("35");
                s7.add("15");
                s7.add("22");
                s7.add("50");
                s7.add("");
                s7.add("");


                Intent myintent=new Intent(cardview.this,weekdays.class);
                myintent.putStringArrayListExtra("d1",d1);
                myintent.putStringArrayListExtra("d2",d2);
                myintent.putStringArrayListExtra("d3",d3);
                myintent.putStringArrayListExtra("d4",d4);
                myintent.putStringArrayListExtra("d5",d5);
                myintent.putStringArrayListExtra("d6",d6);
                myintent.putStringArrayListExtra("d7",d7);

                myintent.putStringArrayListExtra("s1",s1);
                myintent.putStringArrayListExtra("s2",s2);
                myintent.putStringArrayListExtra("s3",s3);
                myintent.putStringArrayListExtra("s4",s4);
                myintent.putStringArrayListExtra("s5",s5);
                myintent.putStringArrayListExtra("s6",s6);
                myintent.putStringArrayListExtra("s7",s7);
                startActivity(myintent);
            }
        });


    }
}

