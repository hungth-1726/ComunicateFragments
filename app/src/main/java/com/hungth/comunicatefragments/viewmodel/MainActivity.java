package com.hungth.comunicatefragments.viewmodel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hungth.comunicatefragments.R;
import com.hungth.comunicatefragments.callback.SendTextListener;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.send_fragment_container, SendFragment.getInstance()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.receive_fragment_container, ReceivedFragment.getInstance()).commit();
    }
}
