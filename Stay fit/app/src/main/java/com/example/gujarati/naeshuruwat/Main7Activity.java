package com.example.gujarati.naeshuruwat;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {
    EditText _user,_pass;
    String user1,pass1,user2,pass2,tot2,tot1;
Button but3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        _user=(EditText)findViewById(R.id.testuser);
        _pass=(EditText)findViewById(R.id.testpass);
        but3=(Button)findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(Main7Activity.this,Main4Activity.class);
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
        mydatabase1 mydbs=new mydatabase1(Main7Activity.this);
        SQLiteDatabase _read=mydbs.getReadableDatabase();
        Cursor result_set=_read.rawQuery("select * from user_details",null);
        result_set.moveToFirst();
        user2=result_set.getString(0);
        pass2=result_set.getString(1);
        tot2=user2.concat(pass2);

        if(tot1.equals(tot2))
        {
            Toast.makeText(Main7Activity.this,"hello! you have successfully logged in ",Toast.LENGTH_SHORT).show();

            Intent myintent=new Intent(Main7Activity.this,navigation.class);
            myintent.putExtra("abc",user1);
            startActivity(myintent);
            flag++;
            //Intent intent=new Intent(Main3Activity.this,navigation.class);
            // intent.putExtra("abc",user1);
            //startActivity(intent);




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
                Toast.makeText(Main7Activity.this,"USERNAME:"+user2,Toast.LENGTH_SHORT).show();

                Intent myintent=new Intent(Main7Activity.this,navigation.class);
                myintent.putExtra("abc",user1);
                startActivity(myintent);

                //Intent intent=new Intent(Main3Activity.this,navigation.class);
                //intent.putExtra("abc",user1);
                //startActivity(intent);
                flag++;
            }
        }
        if(flag==0)
            Toast.makeText(Main7Activity.this, "account does not exist", Toast.LENGTH_SHORT).show();

    }

}
