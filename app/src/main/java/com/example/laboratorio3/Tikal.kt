package com.example.laboratorio3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityTikalBinding

import kotlinx.android.synthetic.main.activity_tikal.*

class Tikal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTikalBinding = DataBindingUtil.setContentView(this, R.layout.activity_tikal)
        var model = Model()
        model.phrase = "Let's take a ride to one of the most mytical places of ths mistery country..."
        model.title = "Tikal: A city of Mayans"
        model.description = "Its the ruin of an ancient city, which was likely to have been called Yax Mutal, found in a rainforest in Guatemala.[2] It is one of the largest archaeological sites and urban centers of the pre-Columbian Maya civilization. It is located in the archaeological region of the Petén Basin in what is now northern Guatemala. Situated in the department of El Petén, the site is part of Guatemalas Tikal National Park and in 1979 it was declared a UNESCO World Heritage Site." +
                "Tikal was the capital of a conquest state that became one of the most powerful kingdoms of the ancient Maya. Though monumental architecture at the site dates back as far as the 4th century BC, Tikal reached its apogee during the Classic Period, c. 200 to 900 AD. During this time, the city dominated much of the Maya region politically, economically, and militarily, while interacting with areas throughout Mesoamerica such as the great metropolis of Teotihuacan in the distant Valley of Mexico. There is evidence that Tikal was conquered by Teotihuacan in the 4th century CE." +
                " Following the end of the Late Classic Period, no new major monuments were built at Tikal and there is evidence that elite palaces were burned. These events were coupled with a gradual population decline, culminating with the site's abandonment by the end of the 10th century.\n" +
                "\n" +
                "Tikal is the best understood of any of the large lowland Maya cities, with a long dynastic ruler list, the discovery of the tombs of many of the rulers on this list and the investigation of their monuments, temples and palaces." + "\n" + "\n" + "Wikipedia"
        binding.model = model



        val comentario = findViewById<EditText>(R.id.final_comment)
        val sub_coment = findViewById<Button>(R.id.sub_comment)

        sub_coment.setOnClickListener {
            val comment_final = comentario.text.toString()

            val main = Intent(this@Tikal, MainActivity::class.java)
            main.putExtra("Comentario_final", comment_final)
            startActivity(main)
        }
    }

}
