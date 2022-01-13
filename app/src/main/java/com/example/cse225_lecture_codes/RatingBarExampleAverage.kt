package com.example.cse225_lecture_codes

import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class RatingBarExampleAverage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar_example_average)

        val cleanlinessRating=findViewById<RatingBar>(R.id.cleanlinessRatingBar)
        val tasteRating=findViewById<RatingBar>(R.id.tasteRatingBar)
        val timeRating=findViewById<RatingBar>(R.id.timeRatingBar)
        val otherRating=findViewById<RatingBar>(R.id.otherRatingBar)
        val totalAverageRating=findViewById<RatingBar>(R.id.totalAverageRatingBar)
        val submitButton=findViewById<Button>(R.id.submitButton)
        val ratingText=findViewById<TextView>(R.id.totalAverageTextView)

        fun ratingTextResponder(totalRating:Double):String{
            if (totalRating==5.0)
                return "Excellent"
            else if(totalRating>4.0)
                return "Good"
            else if(totalRating>3.0)
                return "Above Average"
            else if(totalRating>2.0)
                return "average"
            else if(totalRating>1.0)
                return "Bad"
            else if(totalRating==0.0)
                return "Worst"
            else return ""
        }
        submitButton.setOnClickListener {
            val averageRating=(cleanlinessRating.rating+tasteRating.rating+timeRating.rating+otherRating.rating)/4
            totalAverageRating.rating=averageRating
            ratingText.text=ratingTextResponder(averageRating.toDouble())
        }



    }
}