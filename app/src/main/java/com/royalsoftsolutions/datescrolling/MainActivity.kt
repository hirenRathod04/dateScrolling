package com.royalsoftsolutions.datescrolling

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
  private lateinit var button:Button
    private lateinit var tvdate :TextView
    private lateinit var currentDateAndTime :String
    private lateinit var calendar: Calendar
    private lateinit var day  :String
    private lateinit var date  :String
    private lateinit var month  :String
    private lateinit var month2  :String
    private lateinit var year  :String
    private lateinit var TodayDate :String
    private lateinit var day_date : String
    private lateinit var day_is:String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar = Calendar.getInstance()
        day = calendar.get(Calendar.DAY_OF_WEEK).toString()
        date = calendar.get(Calendar.DAY_OF_MONTH).toString()
        val month1 = calendar.get(Calendar.MONTH) + 1
        month = month1.toString()
        year = calendar.get(Calendar.YEAR).toString()

        val simpleDateFormat = SimpleDateFormat("E")
         currentDateAndTime = simpleDateFormat.format(java.util.Date())

        day_date = "day = $day date = $date-$month-$year"
        TodayDate = "$date-$month-$year"
        inti()

        //E : Sun
        //MMMM : January
        val three =  SimpleDateFormat("E")
        val weekday = SimpleDateFormat("E MMMM", Locale.ENGLISH).format(GregorianCalendar(1989, 8, 24).time)
        //val month = SimpleDateFormat("", Locale.ENGLISH).format(GregorianCalendar(1989, 8, 24).time)
        val arr = weekday.split(" ")//string to array
        Toast.makeText(this,"${arr[0]} : ${arr[1]}",Toast.LENGTH_LONG).show()

        button = findViewById(R.id.button)
        tvdate = findViewById(R.id.tvdate)

        button.setOnClickListener { perform() }

    }

    private fun inti() {
        if(day.equals("0")){

            day_is = "Sun"
        }
        else if(day.equals("1"))
        {
            day_is = "Mon"
        }
        else if(day.equals("2"))
        {
            day_is = "Tue"
        }
        else if(day.equals("3"))
        {
            day_is = "wed"
        }
        else if(day.equals("4"))
        {
            day_is = "thu"
        }
        else if(day.equals("5"))
        {
            day_is = "fri"
        }
        else if(day.equals("6"))
        {
            day_is = "sat"
        }
        else
        {
            day_is = "Some thing Wrong"
        }
    }

    private fun perform() {
       tvdate.text = currentDateAndTime
    }


}