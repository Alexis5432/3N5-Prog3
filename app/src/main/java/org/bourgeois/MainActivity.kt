package org.bourgeois

import org.bourgeois.adapters.MonAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.bourgeois.Album.Album
import org.bourgeois.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()

    }

    private fun fillRecycler() {
        val items: MutableList<Album> = mutableListOf(
        Album(1, "Ye", "Kanye West"),
        Album(2, "Vultures1", "Kanye West"),
        Album(3, "Vultures2", "Kanye West"),
        Album(4, "Graduation", "Kanye West"),
        Album(5, "Donda", "Kanye West"),
        Album(6, "Igor", "Tyler The Creator"),
        Album(7, "Flower Boy", "Tyler The Creator"),
        Album(8, "Call Me If You Get Lost", "Tyler The Creator"),
        Album(9, "Wolf", "Tyler The Creator"),
        Album(10, "Goblin", "Tyler The Creator")
        )


        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }


    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }


}