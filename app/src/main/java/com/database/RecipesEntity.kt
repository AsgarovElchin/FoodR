package com.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.models.FoodRecipe

@Entity(tableName = "recipes_table")
class RecipesEntity (
    var foodRecipe: FoodRecipe
        )
    {
        @PrimaryKey(autoGenerate = true)
        var id : Int = 0
    }
