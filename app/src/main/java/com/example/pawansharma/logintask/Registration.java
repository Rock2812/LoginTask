package com.example.pawansharma.logintask;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText[] ets=new EditText[5];
    String values[]=new String[ets.length];
    int []ids={R.id.etname,R.id.etdepartment,R.id.etcontectno,R.id.etemail,R.id.etdate};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
       for(int i=0;i<ets.length;i++)
       {
           ets[i]=(EditText)findViewById(ids[i]);
       }

    }
    public void Register(View v) {
        int i;
        for (i = 0; i < ets.length; i++) {
            if (ets[i].getText().toString().isEmpty()) {
                ets[i].setError("empty");
                ets[i].requestFocus();
            }
        }
        if (i == 5) {
            for(i=0;i<5;i++)
            {
                values[i]=ets[i].getText().toString().trim();
            }
            ConnectionHelper con = new ConnectionHelper(this);
            SQLiteDatabase db=con.getWritableDatabase();
            String query = "insert into employee values('" + values[0] + "','" + values[1]+ "','" + values[2]+ "','" + values[3] + "','" + values[4] + "') ";
            db.execSQL(query);
            Toast.makeText(Registration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
        }
    }
    }
