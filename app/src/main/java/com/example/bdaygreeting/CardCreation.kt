package com.example.bdaygreeting

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_card_creation.*
import kotlinx.android.synthetic.main.activity_card_creation.view.*
import kotlinx.android.synthetic.main.activity_main.*

class CardCreation : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name_extra "
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_creation)

        val name = intent.getStringArrayExtra(NAME_EXTRA)
        birthdayGreetings.tooltipText = "Happy Birthday $name"
    }
}
