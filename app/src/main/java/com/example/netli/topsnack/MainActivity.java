package com.example.netli.topsnack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
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
                TopSnackbar.make(v, R.layout.demo_layout, TopSnackbar.LENGTH_INDEFINITE, true)
                        .setLayoutAction(R.id.demo_text, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "花间提壶方大厨", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setLayoutAction(R.id.demo_text2, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "皇家特工楚乔传", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setLayoutAction(R.id.image, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "这是一张图片", Toast.LENGTH_SHORT).show();
                            }
                        }).show();

                break;
        }
    }
}
