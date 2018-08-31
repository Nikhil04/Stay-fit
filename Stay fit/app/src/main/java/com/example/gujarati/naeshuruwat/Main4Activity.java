package com.example.gujarati.naeshuruwat;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Main4Activity extends AppCompatActivity {
    FirebaseAuth auth;
    EditText e1,e2,_user,_pass;
    Button verify_email;
    PhoneAuthProvider.OnVerificationStateChangedCallbacks mcallback;
    String verification_code;
    String username,password,mobile;
    String sum1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
       // final BottomSheetDialogFragment myBottomSheet = MyBottomSheetDialogFragment.newInstance("Modal Bottom Sheet");
        e1= (EditText) findViewById(R.id.phone_num);
        e2= (EditText) findViewById(R.id.otp_num);
        _user=(EditText)findViewById(R.id.main4user);
        _pass=(EditText)findViewById(R.id.main4pass);
        //intilize auth
        auth=FirebaseAuth.getInstance();
      //  verify_email=(Button)findViewById(R.id.verify_email);
        //verify_email.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
          //      Intent intent=new Intent(Main4Activity.this,MainActivity.class);
            //    startActivity(intent);
       //     }
       // });
        //
        mcallback=new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                Toast.makeText(Main4Activity.this, "verfication completed", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onVerificationFailed(FirebaseException e) {
                Toast.makeText(Main4Activity.this, "verfication failed"+e, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                verification_code=s;
                Toast.makeText(Main4Activity.this, "code send to the num", Toast.LENGTH_SHORT).show();
            }
        };
    }
    public void send_sms(View view)
    {
        String num=e1.getText().toString().trim();
        PhoneAuthProvider.getInstance().verifyPhoneNumber
                ( num,60,                 // Timeout duration
                        TimeUnit.SECONDS,   // Unit of timeout
                        this,               // Activity (for callback binding)
                        mcallback);
    }
    //
    public void SignInWithPhone(PhoneAuthCredential credential)
    {

        auth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    Toast.makeText(Main4Activity.this, "user signIn sucessfully", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    //
    public  void verify(View view)
    {
        //otp num
        String otp_num=e2.getText().toString().trim();


       verifyPhoneNumber(verification_code,otp_num);
       //myBottomSheet.show(getSupportFragmentManager(), myBottomSheet.getTag());
        username="";
        password="";
        mobile="";
        username=_user.getText()+"";
        password=_pass.getText()+"";
        mobile=e1.getText()+"";
        mydatabase1 obj=new mydatabase1(this);

        SQLiteDatabase _write=obj.getWritableDatabase();
        _write.execSQL("insert into user_details values('"+username+"','"+password+"','"+mobile+"')");

        Intent intent=new Intent(Main4Activity.this,Main7Activity.class);
        startActivity(intent);
        //Toast.makeText(this, username.concat(password), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "Pressed", Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "listen", Toast.LENGTH_SHORT).show();

    }
    public void verifyPhoneNumber(String verify_code,String input_code)
    {
        PhoneAuthCredential credential=PhoneAuthProvider.getCredential(verify_code,input_code);
        SignInWithPhone(credential);

    }
}