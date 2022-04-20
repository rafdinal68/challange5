package com.rafdi.mbuh.ui.menu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.rafdi.mbuh.ui.main.MainActivity
import com.rafdi.mbuh.ui.player.PlayerActivity
import rafdi.mbuh.R
import rafdi.mbuh.databinding.ActivityMenuBinding

@RequiresApi(Build.VERSION_CODES.M)
@SuppressLint("SetTextI18n")
class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")

        binding.tvPemainVsPemain.text = "$name VS Pemain"
        binding.tvPemainVsCPU.text = "$name VS CPU"


        Glide.with(this)
            .load(getString(R.string.url_landing_page1))
            .into(binding.ivPemainVsPemain)

        Glide.with(this)
            .load(getString(R.string.url_landing_page2))
            .into(binding.ivPemainVsCPU)

        binding.ivPemainVsPemain.setOnClickListener {
            val mIntent = Intent(this, PlayerActivity::class.java)
            mIntent.putExtra("name", name)
            startActivity(mIntent)

        }
        binding.ivPemainVsCPU.setOnClickListener {
            val mIntent = Intent(this, MainActivity::class.java)
            mIntent.putExtra("name", name)
            startActivity(mIntent)
        }

        Snackbar.make(
            binding.menuActivity,
            "Welcome $name",
            Snackbar.LENGTH_LONG
        ).setAction("CLOSE") {
        }.show()
    }
}