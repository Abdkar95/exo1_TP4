package com.example.exo1_tp4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

public class SaisonsFragment extends Fragment {

    private String title="";

    private static final String ARG_SECTION_TITLE = "titre_page";

    public static SaisonsFragment newInstance(String title) {
        SaisonsFragment fragment = new SaisonsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString(ARG_SECTION_TITLE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_saisons, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.section_label2);
        tvLabel.setText(title);

        MainActivity mainActivity = (MainActivity) getActivity();

        ImageView imageView = view.findViewById(R.id.imageete);
        imageView.setImageResource(R.drawable.ete1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(0);
            }
        });

        ImageView imageView1 = view.findViewById(R.id.imageprintemps);
        imageView1.setImageResource(R.drawable.printemps1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(1);
            }
        });

        ImageView imageView2 = view.findViewById(R.id.imagehiver);
        imageView2.setImageResource(R.drawable.hiver1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(2);
            }
        });

        ImageView imageView3 = view.findViewById(R.id.imageautomne);
        imageView3.setImageResource(R.drawable.automne1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(3);
            }
        });

        return view;
    }

}
