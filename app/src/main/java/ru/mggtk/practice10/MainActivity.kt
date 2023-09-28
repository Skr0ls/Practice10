package ru.mggtk.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setTitle("FrameLayout")
        //setTitle("LienarLayout")
        setTitle("TableLayout")
        //setContentView(R.layout.framelayout)
        //setContentView(R.layout.linerlayout)
        setContentView(R.layout.tablelayout)

    }

    /*fun clickVisibleChange(view: View){
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener{
            button1.visibility = View.VISIBLE
            button2.visibility = View.INVISIBLE
        }

        button2.setOnClickListener{
            button2.visibility = View.VISIBLE
            button1.visibility = View.INVISIBLE
        }
    }*/

    /*fun clickLinearLayout(view: View){
        //Values
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        
        val textView1 = findViewById<TextView>(R.id.textView2)
        val textView2 = findViewById<TextView>(R.id.textView4)
        //Clicks
        button1.setOnClickListener{
            textView1.text = "Вертикальная"
        }

        button2.setOnClickListener{
            textView2.text = "По левому краю"
        }

        button3.setOnClickListener {
            textView1.text = "Горизонтальная"
        }

        button4.setOnClickListener {
            textView2.text = "По центру"
        }

        button5.setOnClickListener {
            textView1.text = "Вертикальная"
        }

        button6.setOnClickListener {
            textView2.text = "По правому краю"
        }

    }*/


}