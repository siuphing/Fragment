package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TextFragment extends Fragment {
    TextView text, vers;
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragment, container, false);
        text = view.findViewById(R.id.AndroidOs);
        vers = view.findViewById(R.id.Version);
        imageView = view.findViewById(R.id.image);
        return view;
    }

    public void change(String txt, String txt1) {
        text.setText(txt);
        vers.setText(txt1);
    }

    public void changeImage(int resId){
        imageView.setImageResource(resId);
    }
}
