package com.example.gujarati.naeshuruwat;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class retrieve2 extends AppCompatActivity {
    TextView _text1,_text2,_text3,_text4,_text5,_text6,_rap1,_rap2,_rap3,_rap4,_rap5,_rap6,_sec;
    public static ArrayList<String> s,d;
    CardView card1,card2,card3,card4,card5,card6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve2);
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
final MediaPlayer mp=MediaPlayer.create(this,R.raw.sample1);

        _sec=(TextView)findViewById(R.id.tv);
        card1=(CardView)findViewById(R.id.cv1);
        card2=(CardView)findViewById(R.id.cv2);
        card2=(CardView)findViewById(R.id.cv2);
        card3=(CardView)findViewById(R.id.cv3);
        card4=(CardView)findViewById(R.id.cv4);
        card5=(CardView)findViewById(R.id.cv5);
        card6=(CardView)findViewById(R.id.cv6);


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


        final Dialog dialog = new Dialog(retrieve2.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("Custom Dialog");

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int seconds=Integer.parseInt(_rap1.getText().toString());
                CountDownTimer timer=new CountDownTimer(seconds*1000,1000){

                    @Override
                    public void onTick(long l) {
                        _sec.setText("seconds: "+(int)(l/1000));
                    }

                    @Override
                    public void onFinish() {
                    _sec.setText("");
                        Toast.makeText(retrieve2.this,"Congrats..!! "+_text1.getText().toString()+" is completed",Toast.LENGTH_SHORT).show();
                        mp.start();

                        dialog.show();

                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                // if decline button is clicked, close the custom dialog
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });
            }
        }.start();

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int seconds=Integer.parseInt(_rap2.getText().toString());
                CountDownTimer timer=new CountDownTimer(seconds*1000,1000){

                    @Override
                    public void onTick(long l) {
                        _sec.setText("seconds: "+(int)(l/1000));
                    }

                    @Override
                    public void onFinish() {
                        _sec.setText("");
                        Toast.makeText(retrieve2.this,"Congrats..!! "+_text2.getText().toString()+" is completed",Toast.LENGTH_SHORT).show();
                        mp.start();
                        dialog.show();

                        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                        // if decline button is clicked, close the custom dialog
                        declineButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Close dialog
                                dialog.dismiss();
                            }
                        });
                    }
                }.start();

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int seconds = Integer.parseInt(_rap3.getText().toString());
                CountDownTimer timer = new CountDownTimer(seconds * 1000, 1000) {

                    @Override
                    public void onTick(long l) {
                        _sec.setText("seconds: " + (int) (l / 1000));
                    }

                    @Override
                    public void onFinish() {
                        _sec.setText("");
                        Toast.makeText(retrieve2.this, "Congrats..!! " + _text3.getText().toString() + " is completed", Toast.LENGTH_SHORT).show();

                        dialog.show();

                        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                        // if decline button is clicked, close the custom dialog
                        declineButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Close dialog
                                dialog.dismiss();
                            }
                        });
                    }
                }.start();
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int seconds=Integer.parseInt(_rap4.getText().toString());
                CountDownTimer timer=new CountDownTimer(seconds*1000,1000){

                    @Override
                    public void onTick(long l) {
                        _sec.setText("seconds: "+(int)(l/1000));
                    }

                    @Override
                    public void onFinish() {
                        _sec.setText("");
                        Toast.makeText(retrieve2.this,"Congrats..!! "+_text4.getText().toString()+" is completed",Toast.LENGTH_SHORT).show();
                        mp.start();
                        dialog.show();

                        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                        // if decline button is clicked, close the custom dialog
                        declineButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Close dialog
                                dialog.dismiss();
                            }
                        });
                    }
                }.start();
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int seconds=Integer.parseInt(_rap5.getText().toString());
                CountDownTimer timer=new CountDownTimer(seconds*1000,1000){

                    @Override
                    public void onTick(long l) {
                        _sec.setText("seconds: "+(int)(l/1000));
                    }

                    @Override
                    public void onFinish() {
                        _sec.setText("");
                        Toast.makeText(retrieve2.this,"Congrats..!! "+_text5.getText().toString()+" is completed",Toast.LENGTH_SHORT).show();
                        mp.start();
                        dialog.show();

                        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                        // if decline button is clicked, close the custom dialog
                        declineButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Close dialog
                                dialog.dismiss();
                            }
                        });
                    }
                }.start();
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int seconds=Integer.parseInt(_rap6.getText().toString());
                CountDownTimer timer=new CountDownTimer(seconds*1000,1000){

                    @Override
                    public void onTick(long l) {
                        _sec.setText("seconds: "+(int)(l/1000));
                    }

                    @Override
                    public void onFinish() {
                        _sec.setText("");
                        Toast.makeText(retrieve2.this,"Congrats..!! "+_text6.getText().toString()+" is completed",Toast.LENGTH_SHORT).show();
                        dialog.show();

                        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                        // if decline button is clicked, close the custom dialog
                        declineButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Close dialog
                                dialog.dismiss();
                            }
                        });
                    }
                }.start();
            }
        });
    }
        }


