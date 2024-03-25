package com.example.appfoodch4.presentation.foodlist.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.catnip.avengerslist.base.ViewHolderBinder
import com.example.appfoodch4.data.model.Food
import com.example.appfoodch4.databinding.ItemFoodGridBinding

class FoodGridItemViewHolder(
    private val binding: ItemFoodGridBinding,
    private val listener: OnItemClickedListener<Food>
) : ViewHolder(binding.root), ViewHolderBinder<Food> {

    override fun bind(item: Food) {
        item.let {
            binding.ivFoodPhoto.load(it.imagefoodPictUrl) {
                crossfade(true)

            }
            binding.tvFoodName.text = it.name
            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }
        }
    }
}