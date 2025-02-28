package com.example.matule.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matule.components.MyCartProduct
import com.example.matule.components.NotificationCard
import com.example.matule.ui.theme.Accent
import com.example.matule.ui.theme.Background
import com.example.matule.ui.theme.Block
import com.example.matule.ui.theme.SubTextDark
import com.example.matule.ui.theme.fontFamily
import com.example.matule.utils.AppIcons

/** Автор: Шадрин Роман Алексеевич
 *
 * Дата создания: 27.02.2025
 *
 * Функция отвечает за отрисовку активности MyCart
 * **/
@Composable
fun MyCart(
    modifier: Modifier = Modifier,
    onPrev: () -> Unit,
    onCheckout: () -> Unit,
) {

    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Background)
                .padding(paddingValues)
        ) {
            Column(
                modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)
            ) {
                Box(
                    modifier = modifier
                        .fillMaxWidth(),
                ) {
                    Box(
                        modifier = modifier
                            .size(44.dp)
                            .background(Block, CircleShape)
                            .clip(CircleShape)
                            .clickable { onPrev() }
                            .align(Alignment.CenterStart),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = AppIcons.ChevronLeft(),
                            contentDescription = null
                        )
                    }
                    Text(
                        text = "Корзина",
                        fontFamily = fontFamily,
                        modifier = modifier.align(Alignment.Center),
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.sp,
                        color = com.example.matule.ui.theme.Text,
                        textAlign = TextAlign.Center,
                    )
                }
                Spacer(modifier = modifier.height(16.dp))
                Text(
                    text = "3 товара",
                    fontFamily = fontFamily,
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.sp,
                    color = com.example.matule.ui.theme.Text,
                )
                Spacer(modifier = modifier.height(16.dp))
                LazyColumn(
                    modifier = modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    item {
                        MyCartProduct(
                            title = "Nike Club Max",
                            price = "₽584.95"
                        )
                    }
                    item {
                        MyCartProduct(
                            title = "Nike Air Max 200",
                            price = "₽94.05"
                        )
                    }
                    item {
                        MyCartProduct(
                            title = "Nike Air Max 270 Essential",
                            price = "₽74.95"
                        )
                    }
                }
            }
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .height(258.dp)
                    .background(Block)
                    .align(Alignment.BottomCenter)
            ) {
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp)
                        .padding(top = 36.dp)
                ) {
                    Row(
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Сумма",
                            fontFamily = fontFamily,
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            letterSpacing = 0.sp,
                            color = SubTextDark,
                        )
                        Text(
                            text = "₽753.95",
                            fontFamily = fontFamily,
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            letterSpacing = 0.sp,
                            color = com.example.matule.ui.theme.Text,
                        )
                    }
                    Spacer(modifier = modifier.height(10.dp))
                    Row(
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Доставка",
                            fontFamily = fontFamily,
                            fontSize = 16.sp,
                            lineHeight = 20.sp,
                            letterSpacing = 0.sp,
                            color = SubTextDark,
                        )
                        Text(
                            text = "₽60.20",
                            fontFamily = fontFamily,
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            letterSpacing = 0.sp,
                            color = com.example.matule.ui.theme.Text,
                        )
                    }
                    Spacer(modifier = modifier.height(18.dp))
                    Text(
                        text = "- - - - - - - - - - - - - - - - - - - -",
                        fontFamily = fontFamily,
                        fontSize = 32.sp,
                        lineHeight = 16.sp,
                        letterSpacing = 0.sp,
                        color = SubTextDark
                    )
                    Spacer(modifier = modifier.height(14.dp))
                    Row(
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Итого",
                            fontFamily = fontFamily,
                            fontSize = 16.sp,
                            lineHeight = 20.sp,
                            letterSpacing = 0.sp,
                            color = com.example.matule.ui.theme.Text,
                        )
                        Text(
                            text = "₽814.15",
                            fontFamily = fontFamily,
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            letterSpacing = 0.sp,
                            color = Accent,
                        )
                    }
                    Spacer(modifier = modifier.weight(1f))
                    Button(
                        onClick = { onCheckout() },
                        shape = RoundedCornerShape(13.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(82.dp)
                            .padding(bottom = 32.dp),
                        colors = ButtonColors(
                            disabledContainerColor = Accent,
                            disabledContentColor = Accent,
                            containerColor = Accent,
                            contentColor = Accent,
                        )
                    ) {
                        Text(
                            text = "Оформить заказ",
                            fontFamily = fontFamily,
                            letterSpacing = 0.sp,
                            lineHeight = 22.sp,
                            fontSize = 14.sp,
                            color = Block
                        )
                    }
                }
            }
        }
    }
}

/** Автор: Шадрин Роман Алексеевич
 *
 * Дата создания: 27.02.2025
 *
 * Функция отвечает за отображение активности MyCart на превью
 * **/
@Preview(
    showBackground = true,
    name = "MyCart"
)
@Composable
private fun MyCartPreview() {
    MyCart(
        onPrev = {},
        onCheckout = {},
    )
}