package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity
{
    EditText num1,num2;
    Button Calculate,New;
    RadioButton rbadd,rbsub,rbmul,rbdiv;
    RadioGroup rbg1;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate=(Button)findViewById(R.id.Calculate);

        Calculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               EditText num1=(EditText)findViewById(R.id.textView);
               EditText num2=(EditText)findViewById(R.id.textView2);

                int a=Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());


                RadioGroup rgb1=(RadioGroup)findViewById(R.id.rbg1);
                RadioButton rbadd=(RadioButton)findViewById(R.id.rbadd);
                RadioButton rbsub=(RadioButton)findViewById(R.id.rbsub);
                RadioButton rbmul=(RadioButton)findViewById(R.id.rbmul);
                RadioButton rbdiv=(RadioButton)findViewById(R.id.rbdiv);

                int cal=0;

                if(rbadd.isChecked()){
                    cal=a+b;
                }
                else if(rbsub.isChecked()){
                    cal=a-b;
                }
                else if(rbmul.isChecked()){
                    cal=a*b;
                }
                else if(rbdiv.isChecked()){
                    cal=a/b;
                }

                TextView result=(TextView) findViewById(R.id.result);
                result.setText("Result: " + cal);

            }
        });
           New=(Button)findViewById(R.id.New);
           New.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Intent i=new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(i);
                }
            });


    }


}