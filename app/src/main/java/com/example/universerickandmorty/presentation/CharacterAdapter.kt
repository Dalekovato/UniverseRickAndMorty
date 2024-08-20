package com.example.universerickandmorty.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.universerickandmorty.R
import com.example.universerickandmorty.databinding.CharacterAdapterBinding

class CharacterAdapter : ListAdapter<CharacterModel, CharacterAdapter.Holder>(Comparator()) {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = CharacterAdapterBinding.bind(view)

        fun bind(item: CharacterModel) = with(binding) {

            //imgPhoto
            tvName.text = item.tvName
            // imgStatus: String,
            tvStatus.text = item.tvStatus
            tvSpecies.text = item.tvSpecies

        }
    }

    class Comparator : DiffUtil.ItemCallback<CharacterModel>() {

        override fun areItemsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
            //if bd add .id
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.character_adapter,parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))
    }

}