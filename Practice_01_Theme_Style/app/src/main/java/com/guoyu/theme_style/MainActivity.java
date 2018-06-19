package com.guoyu.theme_style;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.guoyu.theme_style.widget.DialogUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.act_main_show_ordinary_dialog)
    AppCompatButton actMainShowOrdinaryDialog;
    @BindView(R.id.act_main_show_v7_dialog)
    AppCompatButton actMainShowV7Dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.act_main_show_ordinary_dialog, R.id.act_main_show_v7_dialog})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.act_main_show_ordinary_dialog:
                DialogUtils.showOrdinaryDialog(MainActivity.this);
                break;
            case R.id.act_main_show_v7_dialog:
                DialogUtils.showV7Dialog(MainActivity.this);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
