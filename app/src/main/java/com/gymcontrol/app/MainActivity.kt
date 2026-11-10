
package com.gymcontrol.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val BackgroundDark = Color(0xFF101510)
private val CardDark = Color(0xFF1C251E)
private val LimeGreen = Color(0xFFB5F23D)
private val TextWhite = Color(0xFFF4F7F1)
private val TextGray = Color(0xFF9BA69B)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                GymControlApp()
            }
        }
    }
}

@Composable
fun GymControlApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BackgroundDark
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(22.dp)
        ) {
            Text(
                text = "GYMCONTROL",
                color = LimeGreen,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 3.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "Panel principal",
                color = TextWhite,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Controla tu gimnasio fácilmente",
                color = TextGray,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

            DashboardCard(
                title = "Clientes activos",
                value = "0",
                description = "Socios al día"
            )

            Spacer(modifier = Modifier.height(14.dp))

            DashboardCard(
                title = "Mensualidades por vencer",
                value = "0",
                description = "Próximos vencimientos"
            )

            Spacer(modifier = Modifier.height(14.dp))

            DashboardCard(
                title = "Mensualidades vencidas",
                value = "0",
                description = "Requieren atención"
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "GYMCONTROL 1.0.0",
                color = TextGray,
                fontSize = 12.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Composable
fun DashboardCard(
    title: String,
    value: String,
    description: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = CardDark
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    color = TextWhite,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = description,
                    color = TextGray,
                    fontSize = 12.sp
                )
            }

            Text(
                text = value,
                color = LimeGreen,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
