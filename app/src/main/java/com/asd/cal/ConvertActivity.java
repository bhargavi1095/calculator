package com.asd.cal;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ConvertActivity extends ActionBarActivity {
    TextView result;
    TextView result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final TextView result= (TextView) findViewById(R.id.textView3);
        final EditText km=(EditText) findViewById(R.id.editText);
        Button b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a =Double.parseDouble(km.getText().toString());
                double r= a*0.621371;
                result.setText(String.valueOf(r));

            }
        });
        final TextView result2= (TextView) findViewById(R.id.textView7);
        final EditText e=(EditText) findViewById(R.id.editText2);
        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double et=Double.parseDouble(e.getText().toString());
                double r2= et/0.621371;
                result2.setText(String.valueOf(r2));

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
