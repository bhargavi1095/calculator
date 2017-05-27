package com.asd.cal;

import android.app.Activity;
import android.app.backup.BackupDataInput;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

/**
 * Created by asd on 7/30/2015.
 */
public class BmiActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        final EditText weight=(EditText) findViewById(R.id.editText3);
      final   EditText height=(EditText) findViewById(R.id.editText4);
        Button b=(Button) findViewById(R.id.button3);
       final TextView re=(TextView) findViewById(R.id.textView12);
        final TextView description=(TextView) findViewById(R.id.textView14);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float w =Float.parseFloat(weight.getText().toString());
                Float h = Float.parseFloat(height.getText().toString());
                Float r = w/(h*h);

                BigDecimal bd = new BigDecimal(Float.toString(r));
                bd = bd.setScale(2, BigDecimal.ROUND_CEILING);

                re.setText(String.valueOf(bd));

                if(r<18.5)
                    description.setText("Under Weight");

                if(r==18.5 || (r<24.9 && r>18.5))
                description.setText("Normal Weight");

                if(r==25 || (r>25 && r<29.9))
                description.setText("Overweight");

                if(r==30 || r>30)
                    description.setText("Obese");


            }
        });

    }
}
