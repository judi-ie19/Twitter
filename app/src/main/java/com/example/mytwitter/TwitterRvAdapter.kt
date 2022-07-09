package com.example.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter (var tweetList:List<Tweets>):
    RecyclerView.Adapter<TweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item, parent, false)
        return TweetsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {

        var CurrentTweets=tweetList.get(position)
        holder.tvname.text=CurrentTweets.name
        holder.tvhandle.text=CurrentTweets.handle
        holder.tvtweet.text=CurrentTweets.tweet
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}





    class TweetsViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView) {
        var tvname= itemView.findViewById<TextView>(R.id.tvname)
        var tvhandle = itemView.findViewById<TextView>(R.id.tvhandle)
        var tvtweet= itemView.findViewById<TextView>(R.id.tvtweet)



    }


