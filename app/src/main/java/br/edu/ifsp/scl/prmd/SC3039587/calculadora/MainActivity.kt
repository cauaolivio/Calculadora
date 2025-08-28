package br.edu.ifsp.scl.prmd.SC3039587.calculadora

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.scl.prmd.SC3039587.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        val calculo = amb.calculo

        amb.btn0.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        amb.btn1.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }

        amb.btn2.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }

        amb.btn3.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        amb.btn4.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }

        amb.btn5.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }

        amb.btn6.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }

        amb.btn7.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }

        amb.btn8.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }

        amb.btn9.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }

        amb.btnPonto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }

        amb.adicao.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        amb.subtracao.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }

        amb.multiplicacao.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }

        amb.divisao.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }

        amb.delete.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }

        amb.ac.setOnClickListener {
            calculo.text = ""
        }
    }
}