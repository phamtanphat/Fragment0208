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

public class FragmentB extends Fragment {
    TextView txtfragmentb;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b,container,false);
        txtfragmentb = view.findViewById(R.id.textviewfragmentb);
        txtfragmentb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Day la textview fragment B", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
