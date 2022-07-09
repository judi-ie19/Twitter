package com.example.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }


    fun displayTweets() {
        var Tweet=Tweets("Judy", "@emmah.2h","Rule your own world and put your ideas out there",)
        var Tweet1=Tweets("Judy", "@emmah.2h","Originality is trying to do something new everyday",)
        var Tweet2=Tweets("Judy", "@emmah.2h","Originality is when you try to change the default conditions",)
        var Tweet3=Tweets("Judy", "@emmah.2h","Originality is when you are able to take measurable risks",)
        var Tweet4=Tweets("Judy", "@emmah.2h","The best Enterpreneurs are risk takers ",)
        var Tweet5=Tweets("Judy", "@emmah.2h","you gain originality when you feel confident about your opinions",)

        var tweetList =listOf(Tweet,Tweet1,Tweet2,Tweet3,Tweet4,Tweet5)


        var TwitterAdapter = TwitterRvAdapter(tweetList)
        binding.rvtweet.layoutManager = LinearLayoutManager(this)
        binding.rvtweet.adapter = TwitterAdapter
    }
}