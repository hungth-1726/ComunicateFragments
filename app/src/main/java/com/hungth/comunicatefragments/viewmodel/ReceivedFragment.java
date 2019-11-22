package com.hungth.comunicatefragments.viewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.hungth.comunicatefragments.R;

public class ReceivedFragment extends Fragment {
    private static ReceivedFragment instance;

    private TextView textReceived;

    private SendTextViewmodel viewmodel;

    public static ReceivedFragment getInstance() {
        if (instance == null) {
            instance = new ReceivedFragment();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_receive, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewmodel = ViewModelProviders.of(getActivity()).get(SendTextViewmodel.class);
        textReceived = view.findViewById(R.id.text_receive);
        viewmodel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textReceived.setText(s);
            }
        });
    }
}
