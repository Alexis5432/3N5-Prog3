package org.bourgeois.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.bourgeois.Album.Album
import org.bourgeois.databinding.MonItemBinding

class MonAdapter : ListAdapter<Album, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Album) {
            binding.tvElement.text = item.name// On affiche l'élément dans le TextView
            binding.tvArtist.text = item.artistName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: Album = getItem(position)
        holder.bind(item)

    }
}
object MonItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }
}
