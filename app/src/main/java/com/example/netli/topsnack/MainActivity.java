package com.example.netli.topsnack;


import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.topsnackbar.TopSnackbar;

import static com.example.topsnackbar.BaseTransientBottomBar.LENGTH_INDEFINITE;



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
                TopSnackbar.make(v, R.layout.demo_layout,LENGTH_INDEFINITE, false)
                        .setLayoutText(R.id.demo_text2,"修改这信息")
                        .show();
//

                break;
        }
    }
}
