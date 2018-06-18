package com.example.android.newsapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {
    List<News> mNewsList;

    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
        mNewsList = newsList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        News currentNews = mNewsList.get(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        String formatDate = currentNews.getDate().substring(0, 10);

        TextView titleView = (TextView) view.findViewById(R.id.news_title);
        titleView.setText(currentNews.getTitle());

        TextView dateView = (TextView) view.findViewById(R.id.news_date);
        dateView.setText(formatDate);

        TextView sectionView = (TextView) view.findViewById(R.id.news_section);
        sectionView.setText(currentNews.getSection());


        TextView authorView = (TextView) view.findViewById(R.id.auhtorName);
        authorView.setText(currentNews.getAuthor());


        return view;
    }
}
