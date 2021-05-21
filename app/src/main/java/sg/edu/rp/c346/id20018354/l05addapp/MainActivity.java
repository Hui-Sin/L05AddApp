package sg.edu.rp.c346.id20018354.l05addapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView num1;
    TextView num2;
    Button btncalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.editTextNumber1);
        num2=findViewById(R.id.editTextNumber2);
        btncalculate=findViewById(R.id.buttonCalculate);
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int nums1= Integer.parseInt(num1.getText().toString());
                int nums2=Integer.parseInt(num2.getText().toString());
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("number1", nums1);
                intent.putExtra("number2", nums2);
                startActivity(intent);

            }
        });
    }
}