package com.example.universerickandmorty.presentation

import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.universerickandmorty.R
import com.example.universerickandmorty.data.dto.StatusImg
import com.example.universerickandmorty.databinding.CharacterItemBinding

class CharacterAdapter : ListAdapter<CharacterModel, CharacterAdapter.Holder>(Comparator()) {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = CharacterItemBinding.bind(view)

        fun bind(model: CharacterModel) = with(binding) {

            Glide // для загрузки фото
                .with(imgPhoto.context)
                .load(model.imgPhoto)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_background)
                .into(imgPhoto)

            tvName.text = model.tvName
            tvStatus.text = model.tvStatus.value
             tvSpecies.text = model.tvSpecies


            when (model.tvStatus) {
                StatusImg.ALIVE -> imgStatus.setImageDrawable(ContextCompat.getDrawable(imgStatus.context, R.drawable.ic_alive))
                StatusImg.DEAD -> imgStatus.setImageDrawable(ContextCompat.getDrawable(imgStatus.context, R.drawable.ic_dead))
                StatusImg.UNKNOWN -> imgStatus.isVisible = false

            }

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
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))
    }

}