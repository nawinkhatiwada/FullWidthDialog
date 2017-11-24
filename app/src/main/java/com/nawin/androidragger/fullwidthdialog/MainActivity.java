package com.nawin.androidragger.fullwidthdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialog = findViewById(R.id.btnShowDialog);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ChangePasswordDialog().show(getFragmentManager(), null);
            }
        });
    }
}
