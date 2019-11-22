package com.hungth.comunicatefragments.callback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hungth.comunicatefragments.R;

public class MainActivity extends AppCompatActivity implements SendTextListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        getSupportFragmentManager().beginTransaction().add(R.id.send_fragment_container, SendFragment.getInstance()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.receive_fragment_container, ReceivedFragment.getInstance()).commit();
        SendFragment.getInstance().setSendTextListener(this);
    }

    @Override
    public void sendText(String text) {
        ReceivedFragment.getInstance().getText(text);
    }
}
