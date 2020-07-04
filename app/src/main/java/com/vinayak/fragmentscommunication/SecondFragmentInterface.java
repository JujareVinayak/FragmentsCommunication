package com.vinayak.fragmentscommunication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragmentInterface extends Fragment {
    private static final String TAG = "SecondFragment";
    private TextView txtName, txtEmail;
    public SecondFragmentInterface() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragmentInterface newInstance() {
        return new SecondFragmentInterface();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_interface, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtEmail = view.findViewById(R.id.textViewEmail);
    }
    public void onNameChange(String name) {
        txtName.setText(name);
        Log.d(TAG, "onNameChange() returned: " + name);
    }
    public void onEmailChange(String email) {
        txtEmail.setText(email);
        Log.d(TAG, "onEmailChange() returned: " + email);
    }
}
