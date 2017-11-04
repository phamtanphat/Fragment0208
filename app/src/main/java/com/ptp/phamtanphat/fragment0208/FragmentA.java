package com.ptp.phamtanphat.fragment0208;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by KhoaPhamPC on 1/11/2017.
 */

public class FragmentA extends Fragment {
    TextView txtfragmentA;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_a,container,false);
        txtfragmentA = view.findViewById(R.id.textviewfragmentA);
        txtfragmentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Day la textview fragment A", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
