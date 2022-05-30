package edu.csc.bai_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText CMND, SDT, DC;
    Button capnhat, lamlai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        capnhat = findViewById(R.id.button1);
        lamlai = findViewById(R.id.button2);
        CMND = findViewById(R.id.CMND);
        SDT = findViewById(R.id.SDT);
        DC = findViewById(R.id.DC);
        capnhat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Cập nhật thành công",Toast.LENGTH_SHORT).show();
            }
        });
        lamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CMND.setText("");
                SDT.setText("");
                DC.setText("");
                CMND.requestFocus();
                Toast.makeText(MainActivity.this, "Xóa thành công",Toast.LENGTH_SHORT).show();
            }
        });
    }
}