package com.indibite.config;

import com.indibite.model.MenuItem;
import com.indibite.repository.MenuItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

        @Bean
        CommandLineRunner initDatabase(MenuItemRepository repository) {
                return args -> {
                        repository.saveAll(Arrays.asList(
                                        // Starters
                                        new MenuItem(null, "Paneer Tikka", "Delicious grilled paneer", 180.0,
                                                        "paneertikka.png", "Starters"),
                                        new MenuItem(null, "Veg Manchurian", "Indo-Chinese favorite", 150.0,
                                                        "vegmanchurian.png", "Starters"),
                                        new MenuItem(null, "Chicken 65", "Spicy fried chicken", 200.0, "chicken65.png",
                                                        "Starters"),

                                        // Main Course
                                        new MenuItem(null, "Ragi mudde", "Healthy millet balls", 260.0, "mudde.png",
                                                        "Main Course"),
                                        new MenuItem(null, "Veg Biryani", "Aromatic rice dish", 220.0, "rice.png",
                                                        "Main Course"),
                                        new MenuItem(null, "Masala Dosa", "Crispy crepe with potato filling", 90.0,
                                                        "dosa.png", "Main Course"),

                                        // Desserts
                                        new MenuItem(null, "Gulab Jamun", "Sweet syrup dumplings", 80.0, "jamun.png",
                                                        "Desserts"),
                                        new MenuItem(null, "Cake", "Sweet treat", 70.0, "cake.png", "Desserts"),
                                        new MenuItem(null, "Ice Cream", "Cool refreshment", 110.0, "icecream.png",
                                                        "Desserts"),

                                        // Thali Components
                                        new MenuItem(null, "Rice Bowl", "Steamed Rice", 40.0, "ricebowl.png",
                                                        "Thali Component"),
                                        new MenuItem(null, "Poori", "Fried bread", 30.0, "poori.png",
                                                        "Thali Component"),
                                        new MenuItem(null, "Rasam", "Spicy soup", 20.0, "rasam.png", "Thali Component"),
                                        new MenuItem(null, "Roti", "Wheat flatbread", 25.0, "roti.png",
                                                        "Thali Component"),
                                        new MenuItem(null, "Sambar", "Lentil stew", 30.0, "sambar.png",
                                                        "Thali Component"),
                                        new MenuItem(null, "Curd", "Fresh yogurt", 20.0, "curd.png", "Thali Component"),
                                        new MenuItem(null, "Dal", "Lentil curry", 40.0, "dal.png", "Thali Component"),
                                        new MenuItem(null, "Channa", "Chickpea curry", 50.0, "channa.png",
                                                        "Thali Component"),
                                        new MenuItem(null, "Sabji", "Mixed vegetable", 45.0, "sabji.png",
                                                        "Thali Component")));
                };
        }
}
