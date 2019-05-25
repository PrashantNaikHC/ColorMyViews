package com.hyperclock.prashant.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickListeners()
    }

    private fun setClickListeners() {
        val clickableViews : List<View> = listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,
            blue_button,red_button,yellow_button)

        for (item in clickableViews){
            item.setOnClickListener {
                changeColors(it)
            }
        }
    }

    private fun changeColors(it: View?) {
        when(it?.id){
            //for the defined colors
            R.id.box_one_text -> it.setBackgroundColor(Color.BLUE)
            R.id.box_two_text -> it.setBackgroundColor(Color.GREEN)

            //for the system colors
            R.id.box_three_text -> it.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_four_text -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_five_text -> it.setBackgroundResource(android.R.color.holo_blue_dark)

            R.id.red_button -> it.setBackgroundColor(Color.RED)
            R.id.blue_button -> it.setBackgroundColor(Color.BLUE)
            R.id.yellow_button -> it.setBackgroundColor(Color.YELLOW)


            else -> it?.setBackgroundResource(android.R.color.holo_blue_dark

            )
        }
    }
}
