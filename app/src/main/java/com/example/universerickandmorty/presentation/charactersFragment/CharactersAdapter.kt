package com.example.universerickandmorty.presentation.charactersFragment

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
import com.example.universerickandmorty.data.network.dtoNetwork.StatusImgNetwork
import com.example.universerickandmorty.databinding.CharacterItemBinding

class CharactersAdapter : ListAdapter<CharactersModel, CharactersAdapter.Holder>(Comparator()) {


    class Holder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = CharacterItemBinding.bind(view)

        fun bind(model: CharactersModel) = with(binding) {

            Glide // для загрузки фото
                .with(imgPhoto.context)
                .load(model.imgPhoto)
                .circleCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_background)
                .into(imgPhoto)

            tvName.text = model.tvName
            tvStatus.text = model.tvStatus.value
            tvSpecies.text = model.tvSpecies


            when (model.tvStatus) {
                StatusImgNetwork.ALIVE -> imgStatus.setImageDrawable(ContextCompat.getDrawable(imgStatus.context, R.drawable.ic_alive))
                StatusImgNetwork.DEAD -> imgStatus.setImageDrawable(ContextCompat.getDrawable(imgStatus.context, R.drawable.ic_dead))
                StatusImgNetwork.UNKNOWN -> imgStatus.isVisible = false
            }


        }

    }

    class Comparator : DiffUtil.ItemCallback<CharactersModel>() {

        override fun areItemsTheSame(oldItem: CharactersModel, newItem: CharactersModel): Boolean {
            //if bd add .id
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: CharactersModel, newItem: CharactersModel): Boolean {
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


    //TODO Временный фикс , найти как исправить
    override fun getItemViewType(position: Int): Int {
        return position
    }


}