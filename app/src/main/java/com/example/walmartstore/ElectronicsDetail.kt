package com.example.walmartstore

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.walmartstore.databinding.ActivityElectronicsDetailBinding
import edu.miu.walmartlogin.data.Product

class ElectronicsDetail : AppCompatActivity() {

    private lateinit var binding: ActivityElectronicsDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElectronicsDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_electronics_detail)

        val product: Product? = intent.getSerializableExtra("product") as Product?
        product?.image?.let { binding.detailProductColor.setBackgroundResource(it) }
        binding.detailProductTitle.text = product?.title
        binding.detailProductColor.text = "Color: ${product?.color}"
        binding.detailProductNumber.text = "Walmart #: ${product?.itemId.toString()}"
        binding.detailProductDescription.text = "Item Description:\n${product?.desc}"

    }
}