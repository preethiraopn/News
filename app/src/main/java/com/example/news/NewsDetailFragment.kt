package com.example.news

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.news.data.NewsDummyData
import org.w3c.dom.Text


class NewsDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.news_detail_fragment, container, false)
        val news: NewsDummyData.NewsItems? = arguments?.getParcelable("newsItem")
        if(news != null){
            Log.e("Content",news.details);
            view.findViewById<TextView>(R.id.news_title).text = news.content
            view.findViewById<TextView>(R.id.news_content).text = news.details
        }

        return view
    }


}
