package org.Bourgeois

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.Bourgeois.Model.Personne
import org.Bourgeois.adapters.PersonneAdapter
import org.Bourgeois.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonneAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
        title = "VERSIONS"
        binding.main.setOnClickListener{
            val monIntent = Intent(this, SecondActivity::class.java)
            startActivity(monIntent)
        }
    }
    private fun setupRecycler() {
        adapter = PersonneAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    private fun fillRecycler() {
        val items: MutableList<Personne> = mutableListOf(
            Personne("Android 1.1","Petit Four",1),
            Personne("Android 1.5", "Cupkace",2),
            Personne("Android 2.0", "Eclaire",3),
            Personne("Android 3.0", "HoneyComb",4),
            Personne("Android 4.0", "Ice cream sandwich",5),
            Personne("Android 5.0", "Lollipop",6)
//
        )
//        for (i in 1..10000) {
//            items.add("Item #$i")
//        }

        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}