package com.example.walmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.walmartstore.databinding.ActivityElectronicsItemBinding
import edu.miu.walmartlogin.adapter.CategoryAdapter
import edu.miu.walmartlogin.data.Product

class ElectronicsItem : AppCompatActivity() , CategoryAdapter.Callback {

    private lateinit var binding: ActivityElectronicsItemBinding
    private val productList = mutableListOf(
        Product("HP Flyer Silver 15.6 \" Laptop", "$435", "Silver", R.drawable.laptop, 1236L, "Nice laptop Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the "),
        Product("RCA Voyager 7\" 16GB android tablet", "$65", "Blue", R.drawable.tablet, 123L, "Nice tablet Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the "),
        Product("Vizio 70\" class 4K", "$235", "Silver", R.drawable.tv, 1234L, "Nice TV Screen Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the ."),
        Product("VILINICE Noise Cancelling Headphones", "$11", "Blue", R.drawable.headphones, 1235L, "Wireless Bluetooth On-Ear Headphones - Active Noise Cancelling Headphones, Hi-Fi Foldable VILINICE Wireless Stereo Headsets Earbuds with ANC, 40 Hours of Listening Time, Built-in Microphone. The Bluetooth headphones have signal enhanced technology that maximizes the signal strength between your phone and your headphones. ")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElectronicsItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CategoryAdapter(this, productList)
        adapter.setCallback(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClicked(product: Product?) {
        val intent = Intent(this, ShoppingCategory::class.java)
        intent.putExtra("product", product)
        startActivity(intent)
    }
}