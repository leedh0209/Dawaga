package com.gachon.dawaga.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gachon.dawaga.R;


public abstract class BaseFragment<B extends ViewBinding> extends Fragment {
    protected B binding;
    protected abstract B getBinding();

    protected void initBinding() {
        binding = getBinding();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.initBinding();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}