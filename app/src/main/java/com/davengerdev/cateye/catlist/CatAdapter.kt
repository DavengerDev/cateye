package com.davengerdev.cateye.catlist


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.davengerdev.cateye.Cat
import com.davengerdev.cateye.databinding.CatListItemBinding

class CatAdapter : ListAdapter<Cat, CatAdapter.CatViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<Cat>(){
        override fun areItemsTheSame(oldItem: Cat, newItem: Cat): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Cat, newItem: Cat): Boolean {
            return oldItem.id == newItem.id
        }
    }


    //Viewholder - Contenedro pensado para el RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val binding = CatListItemBinding.inflate(LayoutInflater.from(parent.context))
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(catViewholder: CatViewHolder, position: Int) {
        val cat = getItem(position)
        catViewholder.bind(cat)
    }

    inner class CatViewHolder(private val binding: CatListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(cat: Cat) {
            binding.catName.text = cat.name
        }
    }

}
