package com.example.project_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Id Binding
        LinearLayout btnSubmit =findViewById(R.id.btnSubmit);
        EditText edtAmount =findViewById(R.id.edtAmount);
        EditText edtRate =findViewById(R.id.edtRate);
        EditText edtYear =findViewById(R.id.edtYear);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = edtAmount.getText().toString();
                String rate = edtRate.getText().toString();
                String year = edtYear.getText().toString();

                if (amount .isEmpty()) {
                    edtAmount.setError("Amount");
                }
                else if(rate.isEmpty())
                {
                    edtRate.setError("Rate");
                }
                else if(year.isEmpty())
                {
                    edtYear.setError("Year");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                    intent.putExtra("result",1000);
                    startActivity(intent);
                }


            }
        });
        
    }
}