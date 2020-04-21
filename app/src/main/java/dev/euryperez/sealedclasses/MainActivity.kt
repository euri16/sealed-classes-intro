package dev.euryperez.sealedclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import dev.euryperez.sealedclasses.adapter.AdvertisementItem
import dev.euryperez.sealedclasses.adapter.AuctionProductItem
import dev.euryperez.sealedclasses.adapter.BuyNowProductItem
import dev.euryperez.sealedclasses.adapter.ProductListAdapter
import dev.euryperez.sealedclasses.models.Advertisement
import dev.euryperez.sealedclasses.models.Product

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ProductListAdapter { item ->
            when (item) {
                is BuyNowProductItem -> showProductDetail(item.product)
                is AuctionProductItem -> showProductDetail(item.product, item.endingTime)
                is AdvertisementItem -> openAdLink(item.advertisement)
            }
        }

        recyclerView = findViewById(R.id.rv_products)
        recyclerView.adapter = adapter

        adapter.items = getDummyProductListItems()
    }

    private fun showProductDetail(product: Product, endingTime: String? = null) {
        val text = if(endingTime != null) "Showing detail for product ${product.name}, endingTime: $endingTime"
        else "Showing detail for product ${product.name}"

        Snackbar.make(
            recyclerView,
            text,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    private fun openAdLink(ad: Advertisement) {
        Snackbar.make(recyclerView, "Opening ad for company ${ad.companyName}", Snackbar.LENGTH_SHORT).show()
    }

    enum class SaleType {
        BUY_NOW,
        AUCTION
    }
}
