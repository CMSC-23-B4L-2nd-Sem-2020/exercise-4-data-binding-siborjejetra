package com.android.example.exer4_sibor_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.android.example.exer4_sibor_b4l.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val name_text:Data = Data("Name")
    private val nickname_text:Data = Data("Nickname")
    private val age_text:Data = Data("Age")
    private val bday_text:Data = Data("When is your birthday?")
    private val number_text:Data = Data("Phone number")
    private val email_text:Data = Data("What is your email address?")
    private val course_text:Data = Data("What is your course?")
    private val dream_text:Data = Data("What is your ultimate dream?")
    private val crush_text:Data = Data("Who is your secret crush?")
    private val message_text:Data = Data("What is your message for me?")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.name = name_text
        binding.nickname = nickname_text
        binding.age = age_text
        binding.bday = bday_text
        binding.number = number_text
        binding.email = email_text
        binding.course = course_text
        binding.dream = dream_text
        binding.crush = crush_text
        binding.message = message_text

        binding.DoneButton.setOnClickListener(){
            fillupForm(it)
        }
    }

    private fun fillupForm(view: View){
        binding.apply {

            nameText.visibility = View.GONE
            nicknameText.visibility = View.GONE
            ageText.visibility = View.GONE
            bdayText.visibility = View.GONE
            numberText.visibility = View.GONE
            emailText.visibility = View.GONE
            courseText.visibility = View.GONE
            dreamText.visibility = View.GONE
            crushText.visibility = View.GONE
            messageText.visibility = View.GONE

            nameEdit.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            ageEdit.visibility = View.GONE
            bdayEdit.visibility = View.GONE
            numberEdit.visibility = View.GONE
            emailEdit.visibility = View.GONE
            courseEdit.visibility = View.GONE
            dreamEdit.visibility = View.GONE
            crushEdit.visibility = View.GONE
            messageText.visibility = View.GONE

            DoneButton.visibility = View.GONE

            name?.name = nameEdit.text.toString()
            nickname?.name = nicknameEdit.text.toString()
            age?.name = ageEdit.text.toString()
            course?.name = "\nThank you for answering!"

            invalidateAll()

            nameText.visibility = View.VISIBLE
            nicknameText.visibility = View.VISIBLE
            ageText.visibility = View.VISIBLE
            courseText.visibility = View.VISIBLE
        }
    }
}
