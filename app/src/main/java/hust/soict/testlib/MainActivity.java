package hust.soict.testlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hust.soict.tinycbc.TinyCBC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TinyCBC tinyCBC = new TinyCBC();
    }
}