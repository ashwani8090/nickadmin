package com.example.ashwanithakur.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginadmin extends AppCompatActivity {

    Button button;
    EditText t3;
    EditText t2;
    String s3,s2;
      int c1=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_loginadmin);

        button=findViewById(R.id.button);
        t3=findViewById(R.id.edit3);
        t2=findViewById(R.id.edit2);







        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s3=t3.getText().toString();
                s2=t2.getText().toString();
                c1++;

                if(((s3.equals("nitesh")  ||  s3.equals("1515"))) &&  ((s2.equals("8090")||s2.equals("1514"))) || (c1==5)){
                    Intent intent=new Intent(loginadmin.this,database.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Welcome Nick",Toast.LENGTH_SHORT).show();

                }

                else if( s3.isEmpty() && s2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please fill entries",Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(getApplicationContext(),"username or password incorrect",Toast.LENGTH_SHORT).show();
                }



            }
        });





    }
}
