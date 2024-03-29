package com.example.alaska_x_aceh_x_byuh_androidapp.Map;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.HospitalListActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.LibraryListActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.Other.CareerDevelopmentActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.Map.List.TransporationListActivity;
import com.example.alaska_x_aceh_x_byuh_androidapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MapFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MapFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
// TODO: Rename and change types and number of parameters
    public static MapFragment newInstance(String param1, String param2) {
        MapFragment fragment = new MapFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        Button btnOpenActivity = (Button) view.findViewById(R.id.HospitalButton);
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HospitalListActivity.class);
                startActivity(intent);
            }
        });

        Button transportation = (Button) view.findViewById(R.id.TransportationButton);
        transportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TransporationListActivity.class);
                startActivity(intent);
            }
        });

        Button library = (Button) view.findViewById(R.id.LibraryButton);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LibraryListActivity.class);
                startActivity(intent);
            }
        });

        Button Other = (Button) view.findViewById(R.id.OtherButton);
        Other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CareerDevelopmentActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}