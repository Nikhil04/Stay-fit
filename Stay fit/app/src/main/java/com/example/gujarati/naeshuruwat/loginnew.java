package com.example.gujarati.naeshuruwat;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginnew extends AppCompatActivity {
    EditText _user,_pass;
    String user1,pass1,user2,pass2,tot2,tot1;
    Button but3,but4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loginnew);
        _user=(EditText)findViewById(R.id.testuser);
        _pass=(EditText)findViewById(R.id.testpass);
        but4=(Button)findViewById(R.id.button3);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(loginnew.this,newregister.class);
                startActivity(myintent);
            }
        });

    }


    public void testlogin(View _view)
    {
        user1=_user.getText()+"";
        pass1=_pass.getText()+"";
        user2="";
        pass2="";
        tot2="";
        int flag=0;
        tot1=user1.concat(pass1);
        mydatabase1 mydbs=new mydatabase1(loginnew.this);
        SQLiteDatabase _read=mydbs.getReadableDatabase();
        Cursor result_set=_read.rawQuery("select * from user_details",null);
        result_set.moveToFirst();
        user2=result_set.getString(0);
        pass2=result_set.getString(1);
        tot2=user2.concat(pass2);

        if(tot1.equals(tot2))
        {
            Toast.makeText(loginnew.this,"hello! you have successfully logged in ",Toast.LENGTH_SHORT).show();

            Intent myintent=new Intent(loginnew.this,navigation.class);
            myintent.putExtra("abc",user1);
            startActivity(myintent);
            flag++;
            //Intent intent=new Intent(Main3Activity.this,navigation.class);
            // intent.putExtra("abc",user1);
            //startActivity(intent);x




        }
        while(!result_set.isLast())
        {
            result_set.moveToNext();
            user2="";
            pass2="";
            tot2="";
            user2=result_set.getString(0);
            pass2=result_set.getString(1);
            tot2=user2.concat(pass2);
            if(tot1.equals(tot2))
            {
                Toast.makeText(loginnew.this,"USERNAME:"+user2,Toast.LENGTH_SHORT).show();

                Intent myintent=new Intent(loginnew.this,navigation.class);
                myintent.putExtra("abc",user1);
                startActivity(myintent);

                //Intent intent=new Intent(Main3Activity.this,navigation.class);
                //intent.putExtra("abc",user1);
                //startActivity(intent);
                flag++;
            }
        }
        if(flag==0)
            Toast.makeText(loginnew.this, "account does not exist", Toast.LENGTH_SHORT).show();

    }

}

