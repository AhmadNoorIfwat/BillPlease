package com.example.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtAmt;
    EditText etAmt;
    TextView txtPax;
    EditText etPax;
    ToggleButton tgbtSVS;
    ToggleButton tgbtGST;
    TextView txtDisc;
    EditText etDisc;
    RadioButton rdC;
    RadioButton rdPN;
    ToggleButton tgbtSplit;
    ToggleButton tgbtReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAmt = findViewById(R.id.textAmount);
        etAmt = findViewById(R.id.editAmount);
        txtPax = findViewById(R.id.textNumOfPax);
        etPax = findViewById(R.id.editNumOfPax);
        tgbtSVS = findViewById(R.id.tbSVS);
        tgbtGST = findViewById(R.id.tbGST);
        txtAmt = findViewById(R.id.textdiscount);
        etDisc = findViewById(R.id.editDiscount);
        rdC = findViewById(R.id.rdcash);
        rdPN = findViewById(R.id.rdpaynow);
        tgbtSplit = findViewById(R.id.tbSplit);
        tgbtReset = findViewById(R.id.tbReset);

    }
}