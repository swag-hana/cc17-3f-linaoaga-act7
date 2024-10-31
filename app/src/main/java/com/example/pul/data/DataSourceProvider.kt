package com.example.pul.data

import com.example.pul.R
import com.example.pul.data.model.CategoryOptions
import com.example.pul.data.model.Recommendation
import com.example.pul.ui.utils.FesPlacesReview

/** Map of available CategoryItem to be displayed in Category Fragments*/
object DataSourceProvider {

    val defaultRecommendation: Recommendation = Recommendation(
        name = "",
        description = "",
        review = FesPlacesReview.NONE,
        categoryOptions = CategoryOptions.LANDMARKS,
        imageResourceId = R.drawable.land1
    )

    val allRecommendations = listOf(
        Recommendation(
            name = "Pulilan Butterfly Haven",
            description = "A sure heaven for butterfly and nature lovers with a scenic view of a garden and collection of different species of greens and butterflies.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land1
        ),

        Recommendation(
            name = "Rizal Park",
            description = "Built in 1924 during the time of Presidente Municipal Santos Luna. It's one of the earliest Rizal monuments in Bulacan.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land2
        ),

        Recommendation(
            name = "Our Lady of Lourdes Grotto Shrine",
            description = "Our Lady of Lourdes Grotto Shrine is a Roman Catholic pilgrimage site in San Jose del Monte, Bulacan.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land3
        ),

        Recommendation(
            name = "Museo ng Kasaysayang Pampulitika ng Pilipinas",
            description = "Museo ng Kasaysayang Pampulitika ng Pilipinas (Museum of Philippine Political History) was inaugurated in 1995 and re-conceptualized two years later with the theme “The Filipino Struggle for Freedom.”",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land4
        ),

        Recommendation(
            name = "Kalayaan Tree",
            description = "In front of the imposing Malolos Cathedral, stands a very large tree. Locals fondly call it the Kalayaan Tree, which means “freedom tree.”",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land5
        ),

        Recommendation(
            name = "Obando Church",
            description = "The San Pascual Baylón Parish and National Shrine of Nuestra Señora de la Immaculada Concepcion de Salambao, commonly known as Obando Church, is a Roman Catholic church located in the municipality of Obando in the province of Bulacan, Philippines.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land6
        ),

        Recommendation(
            name = "Marcelo H. Del Pilar Shrine",
            description = "The Marcelo H. del Pilar Shrine is a declared national shrine by the National Historical Commission of the Philippines in honor of Filipino lawyer, poet and propagandist Marcelo H. del Pilar.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land7
        ),

        Recommendation(
            name = "Lydia's Food House",
            description = "When you enter this place, you notice the pretty atmosphere. Order the menu of Filipino cuisine at this restaurant. It's a pleasant experience to taste good sisig.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant1
        ),

        Recommendation(
            name = "Lee Foo Panciteria",
            description = "If you want cheap, freshly cooked, tasty Filipino/Chinese food - this is the place.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant2
        ),

        Recommendation(
            name = "Ribs Cafe",
            description = "Experience the perfect blend of taste and affordability at Ribs Cafe with our all-day breakfast menu.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant3
        ),

        Recommendation(
            name = "Carinderia ni Ka Enteng",
            description = "Carinderia ni Enteng is a comfort food restaurant located at Pulilan, Bulacan. Home of the Original Turon Halo-Halo!",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant4
        ),

        Recommendation(
            name = "K-Castle Korean Restaurant",
            description = "Your newest Meating Place! Unlimited Korean barbeque!",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant5
        ),

        Recommendation(
            name = "Aerostop Hotel and Restaurant",
            description = "Aerostop Hotel and Restaurant has accommodations with an outdoor swimming pool, free private parking, a fitness center and a garden.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel1
        ),

        Recommendation(
            name = "Matilde's Sanctuary Bed & Breakfast",
            description = "Providing a garden, Matilde’s Sanctuary Bed & Breakfast features accommodations in Dampol. This bed and breakfast provides air-conditioned accommodations with a terrace.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel2
        ),

        Recommendation(
            name = "El Vistra Traveller's Inn",
            description = "El Vistra Traveller's Inn features views of the garden. Featuring a garden, the 3-star inn has air-conditioned rooms with free WiFi, each with a private bathroom.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel3
        ),

        Recommendation(
            name = "Acro Residences",
            description = "Acro Residences has accommodations with an outdoor swimming pool, free private parking and a restaurant. This 3-star hotel offers room service and a 24-hour front desk.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel4
        ),

        Recommendation(
            name = "Chocolate N Berries Hotel",
            description = "This property puts you close to attractions and interesting dining options. Rated with 3 stars, this high-quality property provides guests with access to massage, restaurant and outdoor pool on-site.",
            review = FesPlacesReview.THREE,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel5
        ),

        Recommendation(
            name = "Amore Apartelle",
            description = "Amore Apartelle is a newly established business in Baliuag, Bulacan. A 3-storied building with 31 rooms for guest(s) to stay at their heart's wish.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel6
        )
    )
}