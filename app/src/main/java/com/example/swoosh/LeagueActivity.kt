package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClicked(view: View) {
        womenLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "men"
    }

    fun onWomenClicked(view: View) {
        menLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "women"
    }

    fun onCoedClicked(view: View) {
        menLeagueButton.isChecked = false
        womenLeagueButton.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}