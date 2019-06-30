package com.pupha.showcase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class YoutubeFragment extends Fragment {


    public YoutubeFragment() {
        // Required empty public constructor
    }

    WebView videoWeb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_youtube, container, false);


        videoWeb = (WebView) view.findViewById(R.id.videoWebView);

        videoWeb.getSettings().setJavaScriptEnabled(true);
        videoWeb.setWebChromeClient(new WebChromeClient() {

        } );

        videoWeb.loadData(new YoutubeVideos("https://www.youtube.com/watch?v=bQ1VlAnJxns").getVideoUrl(), "text/html" , "utf-8" );


        return view;
    }

}
