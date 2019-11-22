package com.hungth.comunicatefragments.callback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hungth.comunicatefragments.R;

public class SendFragment extends Fragment {
    private static SendFragment instance;

    private SendTextListener sendTextListener;

    public static SendFragment getInstance() {
        if (instance == null) {
            instance = new SendFragment();
        }
        return instance;
    }

    public void setSendTextListener(SendTextListener sendTextListener) {
        this.sendTextListener = sendTextListener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_send, container, false);
        initView(view);
        return view;
    }

    public void initView(View view) {
        final EditText editText = view.findViewById(R.id.edit_send);
        Button button = view.findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTextListener.sendText(editText.getText().toString());
            }
        });

    }
}
