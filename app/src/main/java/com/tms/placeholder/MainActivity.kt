package com.tms.placeholder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Placeholder
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var placeHolder:Placeholder
    lateinit var layout:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        placeHolder = findViewById(R.id.placeholder)
        layout = findViewById(R.id.layout)
    }



    fun swapView(view: View) {
        Log.d("Adi" , "clicked" + view.id)
        TransitionManager.beginDelayedTransition(layout)
        placeHolder.setContentId(view.id)
    }

    fun startActivity(view:View) {
        var intent: Intent = Intent(this, PlaceMerge::class.java)
        startActivity(intent)
    }
}
