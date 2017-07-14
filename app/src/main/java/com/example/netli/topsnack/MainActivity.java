package com.example.netli.topsnack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.topsnackbar.TopSnackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text:
                TopSnackbar.make(v, R.layout.demo_layout, TopSnackbar.LENGTH_SHORT, true)
                        .setLayoutText(R.id.demo_text2,"修改这信息")
                        .show();

                break;
        }
    }
}
