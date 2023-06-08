package com.example.androidportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonSkills=findViewById<Button>(R.id.buttonSkills)
        buttonSkills.setOnClickListener {
        intent= Intent(this,SkillsActivity::class.java)
            startActivity(intent )
        }

        val buttonEdu=findViewById<Button>(R.id.buttonEdu)

        buttonEdu.setOnClickListener {
            intent= Intent(this,EducationActivity::class.java)
            startActivity(intent )
        }
        val buttonWork=findViewById<Button>(R.id.buttonWork)

        buttonEdu.setOnClickListener {
            intent= Intent(this,ExperienceActivity::class.java)
            startActivity(intent )
        }
        val buttonAward=findViewById<Button>(R.id.buttonAward)

        buttonEdu.setOnClickListener {
            intent= Intent(this,AcheivementsActivity::class.java)
            startActivity(intent )
        }
    }
}