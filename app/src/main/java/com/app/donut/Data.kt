package com.app.donut

object Data {
    fun list_ingredients():MutableList<Ingredients> {

        var ingredients = mutableListOf<Ingredients>()

        var ingre_one = ingredients.add(Ingredients("Salt"))
        var ingre_two = ingredients.add(Ingredients("Sugar"))
        var ingre_three = ingredients.add(Ingredients("Water"))

    return list_ingredients()
    }

}