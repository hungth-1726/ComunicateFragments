package com.hungth.comunicatefragments.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendTextViewmodel extends ViewModel {

    public MutableLiveData<String> text = new MutableLiveData<>();

    public MutableLiveData<String> getText() {
        return text;
    }
}
