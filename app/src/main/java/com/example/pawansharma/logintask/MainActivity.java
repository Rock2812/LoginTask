package com.example.pawansharma.logintask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etuser,etpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etuser=(EditText)findViewById(R.id.etusername);
        etpass=(EditText)findViewById(R.id.etpassword);
    }
    public  void login(View v)
    {
        if(etuser.getText().toString().isEmpty())
        {
            etuser.setError("empty");
            etuser.requestFocus();
        }
        else {
            if (etpass.getText().toString().isEmpty()) {
                etpass.setError("empty");
                etpass.requestFocus();
            }
            else
            {
                if(etuser.getText().toString().trim().equals("admin") && etpass.getText().toString().trim().equals("admin@123"))
                {
                    Intent i=new Intent(this,Login.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid username or password.", Toast.LENGTH_SHORT).show();
                    etpass.setText("");
                    etuser.setText("");
                }
            }
        }
    }
    public void reg(View v){
        Intent i=new Intent(this,Registration.class);
        startActivity(i);
    }
}
