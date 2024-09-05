package com.davengerdev.cateye.catlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.davengerdev.cateye.Cat
import com.davengerdev.cateye.R
import com.davengerdev.cateye.databinding.ActivityCatListBinding

class CatListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCatListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val catList = getFakeCats()

        val recycler = binding.catRecycler
        //Manager: para que convierta el estilo en una lista vertital u otro estilo
        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = CatAdapter()
        recycler.adapter = adapter

        adapter.submitList(catList)
    }

    private fun getFakeCats(): MutableList<Cat> {
        val catList = mutableListOf<Cat>()
        catList.add(
            Cat(
                1,
                1,
                "Maine Coon",
                "Large",
                "Estados Unidos",
                25.0,
                40.0,
                "",
                "12 - 15",
                "Gentil, inteligente y amistoso",
                9.0,
                18.0
            )
        )
        catList.add(
            Cat(
                2,
                1,
                "Sphynx",
                "Medium",
                "Canadá",
                20.0,
                25.0,
                "",
                "8 - 14",
                "Activo, cariñoso y extrovertido",
                6.0,
                12.0
            )
        )
        catList.add(
            Cat(
                3,
                1,
                "Persa",
                "Medium",
                "Irán",
                20.0,
                25.0,
                "",
                "10 - 15",
                "Tranquilo, cariñoso y relajado",
                7.0,
                12.0
            )
        )
        catList.add(
            Cat(
                4,
                1,
                "Siamés",
                "Medium",
                "Tailandia",
                15.0,
                20.0,
                "",
                "12 - 15",
                "Vocal, social y afectuoso",
                8.0,
                12.0
            )
        )
        catList.add(
            Cat(
                5,
                1,
                "Ragdoll",
                "Large",
                "Estados Unidos",
                30.0,
                40.0,
                "",
                "10 - 15",
                "Dócil, afectuoso y 'perruno'",
                10.0,
                20.0
            )
        )
        catList.add(
            Cat(
                6,
                1,
                "Bengalí",
                "Medium",
                "Estados Unidos",
                20.0,
                30.0,
                "",
                "12 - 16",
                "Activo, juguetón y curioso",
                8.0,
                15.0
            )
        )
        catList.add(
            Cat(
                7,
                1,
                "Británico de Pelo Corto",
                "Medium",
                "Reino Unido",
                20.0,
                30.0,
                "",
                "12 - 17",
                "Independiente, leal y tranquilo",
                9.0,
                18.0
            )
        )
        catList.add(
            Cat(
                8,
                1,
                "Abyssinian",
                "Medium",
                "Etiopía",
                15.0,
                20.0,
                "",
                "12 - 15",
                "Activo, curioso y juguetón",
                6.0,
                10.0
            )
        )
        catList.add(
            Cat(
                9,
                1,
                "Scottish Fold",
                "Medium",
                "Escocia",
                20.0,
                25.0,
                "",
                "11 - 14",
                "Dócil, afectuoso y adaptativo",
                6.0,
                13.0
            )
        )
        catList.add(
            Cat(
                10,
                1,
                "Devon Rex",
                "Small",
                "Reino Unido",
                15.0,
                20.0,
                "",
                "9 - 13",
                "Leal, juguetón y atento",
                6.0,
                9.0
            )
        )

        return catList
    }
}