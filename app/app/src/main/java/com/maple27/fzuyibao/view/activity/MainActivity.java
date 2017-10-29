package com.maple27.fzuyibao.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maple27.fzuyibao.R;
import com.maple27.fzuyibao.presenter.util.ActivityController;
import com.maple27.fzuyibao.presenter.util.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityController.addActivity(this);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews(){
        StatusBarUtil.setStatusBar(this);
    }
}


