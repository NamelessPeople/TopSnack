package com.example.netli.topsnack;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.WindowManager;

import androidx.annotation.NonNull;

public class AttentionDialog extends Dialog {
    public AttentionDialog(@NonNull Context context) {
        super(context, R.style.NoTitle_Dialog);
        getWindow().setGravity(Gravity.BOTTOM);
        setContentView(R.layout.attention_dialog);
        WindowManager.LayoutParams dialogParams = getWindow().getAttributes();
        dialogParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        dialogParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        initView();
    }

    private void initView() {

    }
}
