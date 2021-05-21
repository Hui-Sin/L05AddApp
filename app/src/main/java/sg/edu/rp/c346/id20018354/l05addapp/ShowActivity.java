package sg.edu.rp.c346.id20018354.l05addapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView tvSumAns;
    TextView tvProdAns;
    TextView tvDiviAns;
    TextView tvSubtAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        tvSumAns=findViewById(R.id.textViewSumAns);
        tvProdAns=findViewById(R.id.textViewProductAns);
        tvDiviAns=findViewById(R.id.textViewDivisionAns);
        tvSubtAns=findViewById(R.id.textViewSubtractAns);
        Intent intentReceived = getIntent();
        int numb1 = intentReceived.getIntExtra("number1", 0);
        double numb2 = intentReceived.getDoubleExtra("number2", 0);
        tvSumAns.setText("" + (numb1+numb2));
        tvProdAns.setText(""+(numb1*numb2));
        tvDiviAns.setText(""+(numb1/numb2));
        tvSubtAns.setText(""+(numb1-numb2));

    }
}