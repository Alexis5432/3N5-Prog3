package org.Bourgeois.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.Bourgeois.Model.Personne
import org.Bourgeois.databinding.MonItemBinding

class PersonneAdapter : ListAdapter<Personne, PersonneAdapter.PersonneItemViewHolder>(PersonneItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class PersonneItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(personne: Personne) {
            binding.tvPrenom.text = personne.nom
            binding.tvvaleur.text = personne.type
            // Attention! Il faut toujours s'assurer qu'on assigne une String.
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