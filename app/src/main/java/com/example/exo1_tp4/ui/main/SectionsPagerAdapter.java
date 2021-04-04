package com.example.exo1_tp4.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.exo1_tp4.R;
import com.example.exo1_tp4.SaisonsFragment;

import java.util.Locale;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return NatureFragment.newInstance(0, mContext.getString(R.string.automne), R.drawable.automne1);
            case 1:
                return NatureFragment.newInstance(1, mContext.getString(R.string.printemps), R.drawable.printemps1);
            case 2:
                return NatureFragment.newInstance(2, mContext.getString(R.string.ete), R.drawable.ete1);
            case 3:
                return NatureFragment.newInstance(3, mContext.getString(R.string.hiver), R.drawable.hiver1);
            case 4:
                return SaisonsFragment.newInstance("");
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        String titre="";
        Drawable icone=null;
        switch (position) {
            case 0:
                titre = mContext.getString(R.string.automne).toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.automne1);
                break;
            case 1:
                titre = mContext.getString(R.string.printemps).toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.printemps1);
                break;
            case 2:
                titre = mContext.getString(R.string.ete).toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.ete1);
                break;
            case 3:
                titre = mContext.getString(R.string.hiver).toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.hiver1);
                break;
            case 4:
                titre = mContext.getString(R.string.saisons).toUpperCase(l);
                icone = mContext.getResources().getDrawable(R.drawable.saisons);
                break;
        }

        SpannableString sb = new SpannableString(" " + titre);

        icone.setBounds(0, 0, icone.getIntrinsicWidth(), icone.getIntrinsicHeight());
        ImageSpan span = new ImageSpan(icone, ImageSpan.ALIGN_BASELINE);
        sb.setSpan(span, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sb;

    }

    @Override
    public int getCount() {
        return 5;
    }
}