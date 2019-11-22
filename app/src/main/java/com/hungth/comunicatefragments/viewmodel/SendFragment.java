package com.hungth.comunicatefragments.viewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.hungth.comunicatefragments.R;

public class SendFragment extends Fragment {
    private static SendFragment instance;

    private SendTextViewmodel viewmodel;

    public static SendFragment getInstance() {
        if (instance == null) {
            instance = new SendFragment();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_send, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    public void initView(View view) {
        final EditText editText = view.findViewById(R.id.edit_send);
        viewmodel = ViewModelProviders.of(getActivity()).get(SendTextViewmodel.class);
        Button button = view.findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewmodel.getText().postValue(editText.getText().toString());
            }
        });
    }
}
