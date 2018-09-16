package work.beltran.rentaboat.feed

import work.beltran.rentaboat.R

class Boat(
        val id: Int,
        val name: String,
        val location: String,
        val picture: Int,
        val price: String
)

val BOATS = listOf(
        Boat(
                id = 1,
                name = "Canoa Larga",
                location = "Tenerife",
                picture = R.drawable.boat_1,
                price = "45 EUR"

        ),
        Boat(
                id = 2,
                name = "Lancha Motora",
                location = "Costa Brava",
                picture = R.drawable.boat_2,
                price = "99 EUR"

        ),
        Boat(
                id = 3,
                name = "Velero",
                location = "Mallorca",
                picture = R.drawable.boat_3,
                price = "120 EUR"
        )
)

