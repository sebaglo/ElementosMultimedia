package com.example.semana9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class MainActivity2 extends AppCompatActivity {

    private MotionLayout motionLayout;  // MotionLayout para manejar la animación
    private Button startAnimationButton;  // El botón para iniciar la animación

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);  // El layout principal que contiene MotionLayout

        // Inicializar MotionLayout y el botón
        motionLayout = findViewById(R.id.motionLayout);
        startAnimationButton = findViewById(R.id.startAnimationButton);  // Asegúrate de que el ID coincida con el del XML

        // Configurar el listener para el botón
        startAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reiniciar la animación desde el inicio
                motionLayout.setProgress(0);  // Volver al estado inicial
                motionLayout.transitionToEnd();  // Iniciar la animación hacia el final
            }
        });
    }
}
