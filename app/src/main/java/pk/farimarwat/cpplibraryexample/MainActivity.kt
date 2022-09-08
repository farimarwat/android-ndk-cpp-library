package pk.farimarwat.cpplibraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import pk.farimarwat.mynativelibrary.NativeLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addition = NativeLib().Add(20,10)
        val subtraction = NativeLib().Subtract(30,15);
        val multiply = NativeLib().Multiply(2,5);

        Log.e("TEST","Add: ${addition} Subtract: ${subtraction}, Multiply: ${multiply}")
    }
}