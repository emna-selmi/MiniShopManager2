package com.example.minishopmanager2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val btnRetour = findViewById<Button>(R.id.btnRetour)

        btnRetour.setOnClickListener {
            // Ferme l'activité actuelle et revient à MainActivity
            finish()
        }
    }
}