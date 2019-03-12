package com.au.fragmentbestpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by au on 2017/8/30.
 */

public class NewsContentFragment extends Fragment {
    private View view;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        view =inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }
    public void refresh(String newsTitle,String newsContent){
        View visibilityLayout=View.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText=(TextView)view.findViewById(R.id.news_title);
        TextView newsContentText=(TextView)view.findViewById(R.id.news_content);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
