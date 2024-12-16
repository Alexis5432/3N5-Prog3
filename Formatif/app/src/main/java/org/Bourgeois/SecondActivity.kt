package org.Bourgeois

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.Bourgeois.Model.Personne
import org.Bourgeois.adapters.PersonneAdapter
import org.Bourgeois.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
private lateinit var adapter: PersonneAdapter
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

    }

}