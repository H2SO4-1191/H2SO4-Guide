package com.h2so4.h2so4_guide.services

import com.h2so4.h2so4_guide.model.Category
import com.h2so4.h2so4_guide.model.Product

object DataService {
    val categories = listOf(
        Category("Consoles", "gaming_consoles.jpg"),
        Category("Controllers", "gaming_controllers.webp"),
        Category("Headsets", "gaming_headsets.webp"),
        Category("Games", "games.jpg"),
        Category("Accessories", "gaming_accessories.jpg")
    )
    val consoles = listOf(
        Product("PS5", 500f, "ps5.jpg"),
        Product("XBOX Series X", 490f, "xbox_series_x.jpg"),
        Product("PS4", 300f, "ps4.jpg"),
        Product("XBOX 1", 330f, "xbox_1.jpg"),
        Product("Nintendo Switch", 200f, "nintendo_switch.jpg")
    )
    val controllers = listOf(
        Product("Dualsense", 90f, "dualsense.jpg"),
        Product("XBOX Series X Controller", 70f, "xbox_series_x_controller.jpg"),
        Product("Dualshock 4", 50f, "dualshock_4.jpg"),
        Product("XBOX 1 Controller", 45f, "xbox_1_controller.jpg"),
        Product("Nintendo Switch Controller", 60f, "nintendo_switch_controller.jpg")
    )
    val headsets = listOf(
        Product("HyperX Cloud 3", 200f, "hyperx_cloud_3.jpg"),
        Product("SteelSeries Arctis 7", 125f, "steelseries_arctis_7.jpg"),
        Product("HyperX Cloud Stinger", 50f, "hyperx_cloud_stinger.jpg"),
        Product("Astro A40", 90f, "astro_a40.jpg"),
        Product("Sony WH-1000XM4", 340f, "sony_wh_1000xm4.jpg")
    )
    val games = listOf(
        Product("Assassin's Creed Mirage", 40f, "assassin_s_creed_mirage.jpg"),
        Product("Elden Ring", 20f, "elden_ring.jpg"),
        Product("Farcry 6", 35f, "farcry_6.jpg"),
        Product("God of War Ragnarok", 60f, "god_of_war_ragnarok.jpg"),
        Product("GTA 5", 15f, "gta_5.jpg"),
        Product("Mortal Kombat 1", 45f, "mortal_kombat_1.jpg"),
        Product("Red Dead Redemption 2", 30f, "red_dead_redemption_2.jpg"),
        Product("Spider-Man 2", 60f, "spider_man_2.jpg"),
        Product("Alan Wake 2", 55f, "alan_wake_2.jpg"),
        Product("Call of Duty Black Ops 6", 60f, "call_of_duty_black_ops_6.jpg")
    )
    val accessories = listOf(
        Product("Gaming Chair", 100f, "gaming_chair.jpg"),
        Product("Headset Stand", 10f, "headset_stand.jpg"),
        Product("Microphone", 25f, "microphone.jpg"),
        Product("Mouse & Keyboard Bundle", 50f, "mouse___keyboard_bundle.jpg"),
        Product("Logitech Steering Wheel", 350f, "steering_wheel.jpg")
        )
}