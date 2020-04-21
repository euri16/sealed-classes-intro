package dev.euryperez.sealedclasses.models

data class Product(val id: String, val name: String, val pictureUrl: String, val price: String) {
    companion object {
        private val dummyList = listOf(
            Product(
                System.currentTimeMillis().toString(),
                "Computer",
                "https://images.unsplash.com/photo-1517694712202-14dd9538aa97?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2700&q=80",
                "599.99"
            ),
            Product(
                System.currentTimeMillis().toString(),
                "Watch",
                "https://images.unsplash.com/photo-1524592094714-0f0654e20314?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2189&q=80",
                "299.99"
            ),
            Product(
                System.currentTimeMillis().toString(),
                "Tablet",
                "https://images.unsplash.com/photo-1565221287653-9a2713dbe4ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2702&q=80",
                "399.99"
            ),
            Product(
                System.currentTimeMillis().toString(),
                "Camera",
                "https://images.unsplash.com/photo-1489423561257-34e31d8836b2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1636&q=80",
                "399.99"
            ),
            Product(
                System.currentTimeMillis().toString(),
                "Headsets",
                "https://images.unsplash.com/photo-1570841398833-43e352b440ca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1600&q=80",
                "399.99"
            ),
            Product(
                System.currentTimeMillis().toString(),
                "Google Home",
                "https://images.unsplash.com/photo-1507646227500-4d389b0012be?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1600&q=80",
                "399.99"
            )
        )

        val randomProduct: Product
            get() = dummyList.shuffled()[0]
    }
}