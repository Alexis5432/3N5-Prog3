package org.Bourgeois

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
            Personne("Android 1.1","Petit Four"),
            Personne("Android 1.5", "Cupkace"),
            Personne("Android 2.0", "Eclaire"),
            Personne("Android 3.0", "HoneyComb"),
            Personne("Android 4.0", "Ice cream sandwich"),
            Personne("Android 5.0", "Lollipop")
//
        )
//        for (i in 1..10000) {
//            items.add("Item #$i")
//        }

        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}