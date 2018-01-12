package com.example.pawansharma.logintask;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Login extends AppCompatActivity {

    ListView lvname,lvdep,lvcontect,lvemail,lvdoj;
    ConnectionHelper con;
    Cursor c;
    ArrayList<HashMap<String,String>> al=new ArrayList<HashMap<String,String>>();
    String[] from={"name","department","contectno","email","doj"};
    int[] to={R.id.etuname,R.id.etudepartment,R.id.etucontectno,R.id.etuemail,R.id.etudoj};
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        lvname=(ListView)findViewById(R.id.lv_name);
        lvdep=(ListView)findViewById(R.id.lv_dep);
        lvcontect=(ListView)findViewById(R.id.lv_contect);
        lvemail=(ListView)findViewById(R.id.lv_email);
        lvdoj=(ListView)findViewById(R.id.lv_doj);
        con=new ConnectionHelper(this);
        SQLiteDatabase db=con.getWritableDatabase();
        String  q="select * from employee";
        c=db.rawQuery(q,null);
      
    }
}
