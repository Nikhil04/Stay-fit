package com.example.gujarati.naeshuruwat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Main2Activity extends AppCompatActivity {

    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionbar=getSupportActionBar();
        actionbar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2);
      //  final Animation animation_1 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate_backward);
       // final Animation animation_2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.flip_from_right);
       // spinner.startAnimation();


        spinner = (ProgressBar)findViewById(R.id.progressBar);

//hi
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                Intent mainIntent = new Intent(Main2Activity.this,newsecond.class);
                Main2Activity.this.startActivity(mainIntent);
                Main2Activity.this.finish();
            }
        }, 2000);
    }
}


