package org.Bourgeois.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.Bourgeois.Model.Personne
import org.Bourgeois.SecondActivity
import org.Bourgeois.databinding.MonItemBinding

class PersonneAdapter : ListAdapter<Personne, PersonneAdapter.PersonneItemViewHolder>(PersonneItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class PersonneItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Personne) {
            binding.tvPrenom.text = item.nom
            binding.tvvaleur.text = item.type
            // Attention! Il faut toujours s'assurer qu'on assigne une String.
            binding.tvElement.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, SecondActivity::class.java)
                // On ajoute le nom de l'élément à l'intent
                // Démarrer l'activité SecondActivity
                binding.root.context.startActivity(intent)
            }

        }
    }
    object PersonneItemDiffCallback : DiffUtil.ItemCallback<Personne>() {
        override fun areItemsTheSame(oldItem: Personne, newItem: Personne): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Personne, newItem: Personne): Boolean {
            return oldItem.nom == newItem.nom &&
                    oldItem.type == newItem.type


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonneItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonneItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonneItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}